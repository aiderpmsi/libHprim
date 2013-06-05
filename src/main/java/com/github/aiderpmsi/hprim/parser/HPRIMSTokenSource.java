package com.github.aiderpmsi.hprim.parser;

import java.io.*;
import java.util.Arrays;
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
    	START_LINE,
    	STD_CHAR,
    	ECHAPED
    }

    /**
     * Pile des états de lecture du flux (permet de se souvenir de l'ancien
     * état lors des échappements)
     */
    private LinkedList<TokenSourceState> tokenSourceStates =
    		new LinkedList<HPRIMSTokenSource.TokenSourceState> (
    				Arrays.asList(TokenSourceState.INIT));   

    
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
			
			// Si on est à la fin du flux, on envoie le contenu disponible puis on envoie le token de fin de flux
			if (readresult == -1) {
				tokenList.add(createToken(HPRIMSParser.CONTENT,
						Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
				tokenList.add(CommonToken.EOF_TOKEN);
				nbadded += 2;
			}

			// Si tokenSourceState est à STD_CHAR, le tokenizer n'attend par de caractère particulier
			// Si le tokenSourceState est à START_LINE, le tokenizer n'attend que un délimiteur1
			else if (tokenSourceStates.getLast() == TokenSourceState.STD_CHAR ||
					tokenSourceStates.getLast() == TokenSourceState.START_LINE) {

				// Le prochain caractère est un caractère d'échappement, il faut le mettre de côté et
				// spécifier que l'état du tokenizer est en post-caractère d'échappement (ECHAPED)
				if (nextChar == delimiters.getEchap()) {
					tokenSourceStates.add(TokenSourceState.ECHAPED);
					nbadded += fillToken();
				}

				// A chaque fois que l'on rencontre un délimiteur, il faut renvoyer le contenu qu'on vient de lire
				// précédemment et le purger pour remplir avec un nouveau contenu 
				
				// Le prochain caractère est un délimiteur 1 , deux solutions :
				// A - On est en début de ligne, il faut récupérer le contenu et décider
				//     de quel token de début de ligne il s'agit, le renvoyer et renvoyer
				//     un délimiteur1
				// B - On est pas en début de ligne, on renvoie le contenu de content puis
				//     un délimiteur1
				else if (nextChar == delimiters.getDelimiter1()) {
					if (tokenSourceStates.getLast() == TokenSourceState.STD_CHAR)
						tokenList.add(createToken(HPRIMSParser.CONTENT,
								Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
					else {
						String start_line_content = new String(purgeContent());
						int token = HPRIMSParser.LINE_GENERIC;
						if (start_line_content.equals("P"))
							token = HPRIMSParser.LINE_P;
						else if (start_line_content.equals("C"))
							token = HPRIMSParser.LINE_C;
						else if (start_line_content.equals("OBR"))
							token = HPRIMSParser.LINE_OBR;
						else if (start_line_content.equals("OBX"))
							token = HPRIMSParser.LINE_OBX;
						else if (start_line_content.equals("AP"))
							token = HPRIMSParser.LINE_AP;
						// On a passé le début de ligne, changement de l'état du
						// tokenizer
						tokenSourceStates.removeLast();
						tokenSourceStates.add(TokenSourceState.STD_CHAR);
						tokenList.add(createToken(token,
								Lexer.DEFAULT_TOKEN_CHANNEL, start_line_content.toCharArray()));
					}
					tokenList.add(createToken(HPRIMSParser.DELIMITER1,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded += 2;
				}
				
				// Le prochain caractère est un délimiteur 2, il faut :
				// A - vérifier qu'on ne soit pas dans un contexte de début de ligne,
				//     dans ce cas renvoyer une erreur
				// B - Si on n'est pas en début de ligne :
				//   1 - renvoyer le contenu de content
				//   2 - renvoyer un token DELIMITER2
				else if (nextChar == delimiters.getDelimiter2()) {
					if (tokenSourceStates.getLast() == TokenSourceState.START_LINE)
						reportError(new HPRIMSRecognitionException("Délimiteur 2 dans un début de ligne interdit",
								inputReader, new char[]{nextChar}));
					tokenList.add(createToken(HPRIMSParser.CONTENT,
							Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
					tokenList.add(createToken(HPRIMSParser.DELIMITER2,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded += 2;
				}
				
				// Le prochain caractère est un délimiteur 3, il faut :
				// A - vérifier qu'on ne soit pas dans un contexte de début de ligne,
				//     dans ce cas renvoyer une erreur
				// B - Si on n'est pas en début de ligne :
				//   1 - renvoyer le contenu de content
				//   2 - renvoyer un token DELIMITER3
				else if (nextChar == delimiters.getDelimiter3()) {
					if (tokenSourceStates.getLast() == TokenSourceState.START_LINE)
						reportError(new HPRIMSRecognitionException("Délimiteur 3 dans un début de ligne interdit",
								inputReader, new char[]{nextChar}));
					tokenList.add(createToken(HPRIMSParser.CONTENT,
							Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
					tokenList.add(createToken(HPRIMSParser.DELIMITER3,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded += 2;
				}
				
				// Le prochain caractère est un répétiteur, il faut :
				// A - vérifier qu'on ne soit pas dans un contexte de début de ligne,
				//     dans ce cas renvoyer une erreur
				// B - Si on n'est pas en début de ligne :
				//   1 - renvoyer le contenu de content
				//   2 - renvoyer un token REPETITEUR
				else if (nextChar == delimiters.getRepet()) {
					if (tokenSourceStates.getLast() == TokenSourceState.START_LINE)
						reportError(new HPRIMSRecognitionException("Répétiteur dans un début de ligne interdit",
								inputReader, new char[]{nextChar}));
					tokenList.add(createToken(HPRIMSParser.CONTENT,
							Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
					tokenList.add(createToken(HPRIMSParser.REPETITEUR,
							Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
					nbadded += 2;
				}
				
				// Le prochain caractère est un carriage return, il faut :
				// A - vérifier qu'on ne soit pas dans un contexte de début de ligne,
				//     dans ce cas renvoyer une erreur
				// B - Si on n'est pas en début de ligne, il faut voir si c'est :
				//   1 - Une fin de ligne
				//   2 - Juste un saut dans une même ligne
				else if (nextChar == '\r') {
					if (tokenSourceStates.getLast() == TokenSourceState.START_LINE)
						reportError(new HPRIMSRecognitionException("Absence de délimiteur 1 à la fin de la définition de ligne",
								inputReader, new char[]{nextChar}));
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
						// On n'a pas de A, c'est donc un entête de champ, on le traite comme
						// du contenu standard et on change l'état de lecture
						tokenList.add(createToken(HPRIMSParser.CONTENT,
								Lexer.DEFAULT_TOKEN_CHANNEL, purgeContent()));
						tokenList.add(createToken(HPRIMSParser.CR,
								Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{nextChar}));
						tokenSourceStates.removeLast();
						tokenSourceStates.add(TokenSourceState.START_LINE);
						content.append(nextChar);
						nbadded += 2;
					} else {
						// On a un A, il faut continuer à lire comme du contenu standard
						readresult = inputReader.read();
						nextChar = (char) readresult;
						if (readresult == -1) {
							tokenList.add(CommonToken.EOF_TOKEN);
							nbadded++;
						} else {
							if (nextChar != delimiters.getDelimiter1())
								reportError(new HPRIMSRecognitionException("Suite de ligne A sans délimiteur",
										inputReader, new char[]{nextChar}));
						}
					}
				}
				
				// Le caractère ne revet aucun caractère particulier, on le rajoute au contenu en cours de sauvegarde 
				else {
					content.append(nextChar);
				}

			}
			
			// Le dernier caractère était un caractère d'échappement, on rajoute au contenu le prohain quel qu'il soit
			else if (tokenSourceStates.getLast() == TokenSourceState.ECHAPED) {
				// Changement de l'état de lecture : récupération de l'état précédent
				tokenSourceStates.removeLast();
				content.append(nextChar);
			}

			// Le tokenizer attend les caractères d'initialisation
			else if (tokenSourceStates.getLast() == TokenSourceState.INIT) {
				// Récupération du H et des délimiteurs
				if (nextChar == 'H') {
					try {
						parseDelimiters();
					} catch (RecognitionException e) {
						reportError(e);
					}
				} else {
					reportError(new HPRIMSRecognitionException("Entête non compatible HPRIM",
							inputReader, new char[]{nextChar}));
				}
				// Récupération du délimiteur1 suivant
				if (inputReader.read() != (int)delimiters.getDelimiter1()) {
					reportError(new HPRIMSRecognitionException("Entête non compatible HPRIM",
							inputReader, new char[]{nextChar}));
				}
				tokenList.add(createToken(HPRIMSLexer.LINE_H,
						Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{'H'}));
				tokenList.add(createToken(HPRIMSLexer.DELIMITERS, 
						Lexer.DEFAULT_TOKEN_CHANNEL, delimiters.getDelimiters()));
				tokenList.add(createToken(HPRIMSLexer.DELIMITER1, 
						Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{delimiters.getDelimiter1()}));
				tokenSourceStates.remove();
				tokenSourceStates.add(TokenSourceState.STD_CHAR);
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
		if (tokenList.size() != 0) {
			return tokenList.removeFirst();
		} else {
			// On remplit la liste des tokens à envoyer
			while (fillToken() == 0) { }
			// On a trouvé un (ou des) nouveau(x) token(s), on l(les)'envoie
			return nextToken();
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
