package com.github.aiderpmsi.hprim.parser;

import java.io.*;
import java.nio.CharBuffer;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.runtime.*;

import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSLexer;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;


/**
 * Limitations de ce tokenizer pour HPRIM :
 * Les spécifications suivantes sont implémentées :
 *   . utilisation du CR seul pour saut de ligne
 *   . suppression des caractères non inscriptibles après le CR
 *   . Tous les caractères peuvent ètre utilisés comme délimiteurs,
 *     même A, P, L, O, B et R
 * @author delabre/aider
 * @version $Revision: 1028 $
 */
public class HPRIMSTokenSource implements TokenSource {

	/**
	 * Logger Log4J
	 */
	private static final Logger logger = Logger.getLogger(HPRIMSTokenSource.class.getCanonicalName());
	
	/** 
     * La source de chaine de caractères. Pour permettre la lecture de grandes
     * quantités de données, les données sont envoyées sous forme d'un Stream
     */ 
	private HPRIMSInputStreamReader inputReader;
	
    /**
     * Classe définissant les délimiteurs HPRIM
     */
    private HPRIMSDelimiters delimiters;
	
    /**
     * Liste des état du lecteur de tokens
     */
    public enum TokenSourceState {
    	INIT,
    	STD_CHAR,
    	ECHAPED
    }

    /**
     * Etat actuel de lecture de tokens du flux
     */
    private TokenSourceState tokenSourceState = TokenSourceState.INIT;   

    
    /**
     * Stocke des tokens à renvoyer dès que possible (Buffer lorsque plusieurs tokens
     * doivent être lus en même temps).
     */
    private LinkedList<Token> tokenList = new LinkedList<Token>();
    
    /**
     * 
     */
    StringBuilder content = new StringBuilder();
    
	/**
	 * Pattern matching précompilée pour reconnaitre les charactères imprimables
	 */
	private static final Pattern patternPrintable = Pattern.compile("\\p{Print}");
    
    /**
     * Constructeur : prend un flux d'entrée et le transforme en tokens selon les délimiteurs déterminés
     * @param inputStream Flux d'où les caractères sont extraits
     * @throws IOException 
     */
    public HPRIMSTokenSource(HPRIMSInputStreamReader inputStream) throws IOException {
    	this.inputReader = inputStream;
    }

    /**
     * Prend les 6 prochains caractères dans le flux et regarde si on a H et les délimiteurs
     * @throws RecognitionException Si l'entête n'est pas compatible avec les spécifications HPRIM
     * @throws IOException Si la lecture duflux est impossible
     */
    private void parseDelimiters() throws RecognitionException, IOException {
    	char[] delimitersBuffer = new char[5]; // Buffer récupérant les caractères délimiteurs
    	int nbcharsread; // Variable récupérant le nombre de caractères ayant été effectivement lus

    	// Remplissage du buffer pour lire la définition des délimiteurs
    	nbcharsread = inputReader.read(delimitersBuffer);
    	if (nbcharsread == -1)
    		throw new HPRIMSRecognitionException("Fin prématurée du fichier",
        		inputReader, delimitersBuffer);
    	
  	  	// Création d'un objet de type délimiteurs à partir de cette chaîne
    	delimiters = new HPRIMSDelimiters();
    	try {
    		delimiters.setDelimiters(delimitersBuffer);
    	} catch (IOException e) {
    		throw new HPRIMSRecognitionException(e.getMessage(),
        		inputReader, delimitersBuffer);
    	}
    }
                
    /**
	 * Retourne le nom de la source de données (nécessaire pour étendre TokenSource)
	 * @return La chaine de caractères 'Reader'
	 */
    @Override
	public String getSourceName() {
		return "Reader";
	}
	
    /**
     * Remplit le tampon du tokenizer 
     * @return le nombre de tokens rajoutés
     */
    private int fillToken() {
    	int nbadded = 0;
		try {
			// On récupère le prochain caractère
			int readresult = inputReader.read();
			char nextChar = (char) readresult;
			
			// Si no est à la fin du flux, on envoie le token de fin de flux
			if (readresult == -1) {
				tokenList.add(CommonToken.EOF_TOKEN);
				nbadded++;
			}
			
			// Si tokenSourceState est à STD_CHAR, le tokenizer n'attend par de caractère particulier
			else if (tokenSourceState == TokenSourceState.STD_CHAR) {

				// Le prochain caractère est un caractère d'échappement, il faut le mettre de côté et
				// spécifier que l'état du tokenizer est en post-caractère d'échappement (ECHAPED)
				if (nextChar == delimiters.getEchap()) {
					tokenSourceState = TokenSourceState.ECHAPED;
					nbadded += fillToken();
				}
				
				// Le prochain caractère est un délimiteur 1, il faut renvoyer un token DELIMITER1
				else if (nextChar == delimiters.getDelimiter1()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER1,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caractère est un délimiteur 2, il faut renvoyer un token DELIMITER2
				else if (nextChar == delimiters.getDelimiter2()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER2,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caractère est un délimiteur 3, il faut renvoyer un token DELIMITER3
				else if (nextChar == delimiters.getDelimiter3()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER3,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caractère est un répétiteur, il faut envoyer un token REPETITEUR
				else if (nextChar == delimiters.getRepet()) {
					tokenList.add(createToken(HPRIMSParser.REPETITEUR,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caractère est un carriage return, il faut vérifier qu'on ne soit pas juste à
				// un saut de ligne 
				else if (nextChar == '\r') {

					// En cas de A après les caractères non imprimables on n'envoie pas le CR
					// ni le A ni le délimiteur
					while (true) {
						readresult = inputReader.read();
						nextChar = (char) readresult;
						if (readresult == -1) {
							tokenList.add(CommonToken.EOF_TOKEN);
							nbadded++;
							break;
						}
						Matcher m = patternPrintable.matcher(Character.toString(nextChar));
						if (m.matches())
							break;
					}
					if (nextChar != 'A') {
						tokenList.add(createToken(HPRIMSParser.CR,
								Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
						tokenList.add(createToken(HPRIMSParser.CONTENT,
								Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
						nbadded += 2;
					} else {
						readresult = inputReader.read();
						nextChar = (char) readresult;
						if (readresult == -1) {
							tokenList.add(CommonToken.EOF_TOKEN);
							nbadded++;
						} else {
							if (nextChar != delimiters.getDelimiter1())
								reportError(new HPRIMSRecognitionException("Suite de ligne A sans délimiteur",
										inputReader, new char[]{nextChar}));
							nbadded += fillToken();							
						}
					}
				}
				
				// Le caractère ne revet aucun caractère particulier, on le rajoute à la liste des 
				else {
					tokenList.add(createToken(HPRIMSLexer.CONTENT,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}

			}
			
			// Le dernier caractère était un caractère d'échappement, on renvoie le suivant
			// quel qu'il soit.
			else if (tokenSourceState == TokenSourceState.ECHAPED) {
				tokenSourceState = TokenSourceState.STD_CHAR;
				tokenList.add(createToken(HPRIMSLexer.CONTENT, 
						Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
				nbadded++;
			}

			// Le tokenizer attend les caractères d'initialisation
			else if (tokenSourceState == TokenSourceState.INIT) {
				if (nextChar == 'H') {
					try {
						parseDelimiters();
					} catch (RecognitionException e) {
						reportError(e);
					}
				} else {
					reportError(new HPRIMSRecognitionException("Ent�te non compatible HPRIM",
							inputReader, new char[]{nextChar}));
				}
				tokenSourceState = TokenSourceState.STD_CHAR;
				tokenList.add(createToken(HPRIMSLexer.DELIMITERS, 
						Lexer.DEFAULT_TOKEN_CHANNEL, delimiters.getDelimiters()));
				nbadded++;
			}
			
			else {
				reportError(new HPRIMSRecognitionException("Etat inconnu", inputReader, new char[]{nextChar}));
			}
		} catch (IOException e) {
			reportError(new HPRIMSRecognitionException("Impossible de lire le flux", inputReader, new char[]{}));
		}
		return nbadded;
	}
    
    private char[] purgeContent() {
    	char[] toPurge = content.toString().toCharArray();
    	content.setLength(0);
    	return toPurge;
    }
    
	/**
	 * Retourne le prochain token retrouvé dans le flux d'entrée de caractères
	 * @return Token token représentant la chaine trouvée, ou Token (EOF) si fin de fichier
	 */
	public Token nextToken() {
		// On regarde s'il y a des tokens à envoyer
		if (this.tokenList.size() != 0) {
			return this.tokenList.removeFirst();
		} else {
			// On remplit la liste des tokens à envoyer
			if (this.fillToken() == 0) {
				// Si malgré un nouveau parsing on ne trouve pas
				// d'autre token on renvoie un token invalide
				return CommonToken.INVALID_TOKEN;
			} else {
				return this.nextToken();
			}
		}
	}

	/**
	 * Crée un token avec les attribut suivants pour retourner au parser. Renseigne
	 * également quel est le dernier type de token créé.
	 * @param type type (à voir dans le HPRIMSParser associé)
	 * @param channel canal à utiliser (cf canaux ANTLR)
	 * @param tokenText texte à mettre dans le token 
	 * @return : le token créé
	 */
	private Token createToken(int type, int channel, char[] tokenText) {
		Token token = new CommonToken(type, new String(tokenText));
		token.setChannel(channel);
		token.setLine(inputReader.getLineNumber());
		token.setCharPositionInLine(inputReader.getCharNumber());
		return token;
	}
	
	/**
	 * Les erreurs dans le lexer ne sont pas irrécupérables : elles entrainent
	 * la non production d'un lexem, et l'envoi d'un token invalide
	 * @param e
	 */
	 public void reportError(RecognitionException e) {
		 logger.log(Level.INFO, e.getMessage() + " L:" + e.line +" C:" + e.charPositionInLine);
		 if (e instanceof HPRIMSRecognitionException)
			 logger.log(Level.INFO, "Dans : " + new String(((HPRIMSRecognitionException) e).getContent()));
     }
	
}
