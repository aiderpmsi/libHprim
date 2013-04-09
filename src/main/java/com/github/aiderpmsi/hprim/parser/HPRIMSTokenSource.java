package com.github.aiderpmsi.hprim.parser;

import java.io.*;
import java.util.LinkedList;
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
    	// == Définition des variables de la méthode : ==
    	char[] delimitersBuffer = new char[5]; // Buffer récupérant les caractères délimiteurs
    	int nbcharsread; // Variable récupérant le nombre de caractères ayant été effectivement lus
    	
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
     * Renvoie le code du Lexer associé à un caractère
     * @param character
     * @return
     */
    public int getCharTokenClass(char character) {
    	switch (character) {
    		case '0' : return HPRIMSParser.CHIFFRE0;
    		case '1' : return HPRIMSParser.CHIFFRE1;
    		case '2' : return HPRIMSParser.CHIFFRE2;
    		case '3' : return HPRIMSParser.CHIFFRE3;
    		case '4' : return HPRIMSParser.CHIFFRE4;
    		case '5' : return HPRIMSParser.CHIFFRE5;
    		case '6' : return HPRIMSParser.CHIFFRE6;
    		case '7' : return HPRIMSParser.CHIFFRE7;
    		case '8' : return HPRIMSParser.CHIFFRE8;
    		case '9' : return HPRIMSParser.CHIFFRE9;
    		case '.' : return HPRIMSParser.POINT;
    		case '+' : return HPRIMSParser.PLUS;
    		case '-' : return HPRIMSParser.MOINS;
    		case 'A' : return HPRIMSParser.CHARA;
    		case 'B' : return HPRIMSParser.CHARB;
    		case 'C' : return HPRIMSParser.CHARC;
    		case 'D' : return HPRIMSParser.CHARD;
    		case 'E' : return HPRIMSParser.CHARE;
    		case 'F' : return HPRIMSParser.CHARF;
    		case 'G' : return HPRIMSParser.CHARG;
    		case 'H' : return HPRIMSParser.CHARH;
    		case 'I' : return HPRIMSParser.CHARI;
    		case 'K' : return HPRIMSParser.CHARK;
    		case 'L' : return HPRIMSParser.CHARL;
    		case 'M' : return HPRIMSParser.CHARM;
    		case 'N' : return HPRIMSParser.CHARN;
    		case 'O' : return HPRIMSParser.CHARO;
    		case 'P' : return HPRIMSParser.CHARP;
    		case 'R' : return HPRIMSParser.CHARR;
    		case 'S' : return HPRIMSParser.CHARS;
    		case 'T' : return HPRIMSParser.CHART;
    		case 'U' : return HPRIMSParser.CHARU;
    		case 'V' : return HPRIMSParser.CHARV;
    		case 'W' : return HPRIMSParser.CHARW;
    		case 'X' : return HPRIMSParser.CHARX;
    		case 'l' : return HPRIMSParser.CHARl;
    		case 'u' : return HPRIMSParser.CHARu;
    		case '<' : return HPRIMSParser.CHAR_SYMBOL_INF;
    		case '>' : return HPRIMSParser.CHAR_SYMBOL_SUP;
    		default:
    			return HPRIMSParser.LETTRE;
    	}
    }
    
    /**
     * Remplit le tampon du tokenizer 
     * @return le nombre de tokens rajoutés
     */
    private int fillToken() {
    	int nbadded = 0;
		try {
			// On r�cup�re le prochain token
			int readresult = inputReader.read();
			char nextChar = (char) readresult;
			
			// L'inputReader est � la fin du flux.
			if (readresult == -1) {
				tokenList.add(CommonToken.EOF_TOKEN);
				nbadded++;
			}
			
			// Le tokenizer attend un caract�re standard et n'est pas dans un �t� particulier
			else if (tokenSourceState == TokenSourceState.STD_CHAR) {

				// Le prochain caract�re est un caract�re d'�chappement
				if (nextChar == delimiters.getEchap()) {
					tokenSourceState = TokenSourceState.ECHAPED;
					nbadded += fillToken(); 
				}
				
				// Le prochain caract�re est un d�limiteur 1
				else if (nextChar == delimiters.getDelimiter1()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER1,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caract�re est un d�limiteur 2
				else if (nextChar == delimiters.getDelimiter2()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER2,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caract�re est un d�limiteur 3
				else if (nextChar == delimiters.getDelimiter3()) {
					tokenList.add(createToken(HPRIMSParser.DELIMITER3,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caract�re est un r�p�titeur
				else if (nextChar == delimiters.getRepet()) {
					tokenList.add(createToken(HPRIMSParser.REPETITEUR,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}
				
				// Le prochain caract�re est un carriage return
				else if (nextChar == '\r') {

					// En cas de A apr�s les caract�res non imprimables on n'envoie pas le CR
					// ni le A ni le d�limiteur
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
						tokenList.add(createToken(HPRIMSLexer.CR,
								Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
						tokenList.add(createToken(getCharTokenClass(nextChar),
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
								reportError(new HPRIMSRecognitionException("Suite de ligne A sans d�limiteur",
										inputReader, new char[]{nextChar}));
							nbadded += fillToken();							
						}
					}
				}
				
				// Le caract�re ne revet aucun caract�re particulier, en renvoie un token
				else {
					tokenList.add(createToken(getCharTokenClass(nextChar),
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded++;
				}

			}
			
			// Le dernier caract�re �tait un caract�re d'�chappement, on renvoie le suivant
			// quel qu'il soit.
			else if (tokenSourceState == TokenSourceState.ECHAPED) {
				tokenSourceState = TokenSourceState.STD_CHAR;
				tokenList.add(createToken(getCharTokenClass(nextChar), 
						Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
				nbadded++;
			}

			// Le tokenizer attend les caract�res d'initialisation
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
