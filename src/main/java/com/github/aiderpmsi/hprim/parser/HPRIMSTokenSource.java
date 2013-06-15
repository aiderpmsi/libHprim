package com.github.aiderpmsi.hprim.parser;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.MatchResult;
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
public class HPRIMSTokenSource implements TokenSource, Closeable {

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
     * Scanner appliqué sur HPRIMSInputStreamReader
     */ 
	private Scanner scanner;

    /**
     * Stocke des tokens à renvoyer dès que possible (Buffer lorsque plusieurs tokens
     * doivent être lus en même temps).
     */
    private LinkedList<Token> tokenList = new LinkedList<>();
    
    /**
     * Patterns pour récupérer les tokens
     */
    private List<Pattern> tokenRegexps = new ArrayList<>(8);
    
    /**
     * Indicateur pour générer un tokenizer strict ou non
     */
    private boolean strict;
    
    /**
     * Constructeur : prend un flux d'entrée et le transforme en tokens selon les délimiteurs déterminés
     * @param inputStream Flux d'où les caractères sont extraits
     * @throws IOException 
     */
    public HPRIMSTokenSource(HPRIMSInputStreamReader inputStream, boolean strict) throws IOException {
    	this.inputReader = inputStream;
    	this.strict = strict;
    	scanner = new Scanner(inputReader);
    }
    /**
     * Prend les 6 prochains caractères dans le flux et regarde si on a H et les délimiteurs
     * @throws RecognitionException Si l'entête n'est pas compatible avec les spécifications HPRIM
     * @throws IOException Si la lecture duflux est impossible
     */
    private void parseDelimiters(boolean strict) {
    	// Création du regex pour récupérer les 5 premiers caractères
    	Pattern p;
    	if (strict) p = Pattern.compile("^(H)((?!\\1)[^\\r\\n])((?!\\1)(?!\\2)[^\\r\\n])((?!\\1)(?!\\2)(?!\\3)[^\\r\\n])" +
    			"((?!\\1)(?!\\2)(?!\\3)(?!\\4)[^\\r\\n])((?!\\1)(?!\\2)(?!\\3)(?!\\4)(?!\\5)[^\\r\\n])(\\2)");
    	else p = Pattern.compile("^([A-Z]*)([^A-Z])((?!\\2)[^A-Z])((?!\\2)(?!\\3)[^A-Z])" +
    			"((?!\\2)(?!\\3)(?!\\4)[^A-Z])((?!\\2)(?!\\3)(?!\\4)(?!\\5)[^A-Z])(\\2)");

    	// Si on ne trouve pas ce motif, il faut lancer une erreur
    	if (scanner.findWithinHorizon(p, 0) == null)
    		reportError ("Fin prématurée du fichier", inputReader.getLineNumber(), inputReader.getCharNumber());
    	
    	// Arrivé ici, on a trouvé les délimiteurs de l'entête, il faut les stocker dans des tokens
    	MatchResult m = scanner.match();
		tokenList.add(createToken(HPRIMSLexer.NEWLINE,
				Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{}));
		tokenList.add(createToken(HPRIMSLexer.CONTENT,
				Lexer.DEFAULT_TOKEN_CHANNEL, m.group(1).toCharArray()));
		tokenList.add(createToken(HPRIMSLexer.DELIMITERS, 
				Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{m.group(2).charAt(0), m.group(3).charAt(0),
				m.group(4).charAt(0), m.group(5).charAt(0), m.group(6).charAt(0)}));
		tokenList.add(createToken(HPRIMSLexer.DELIMITER1, 
				Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{m.group(7).charAt(0)}));

		// On crée la liste des patterns à appliquer à la suite :
		// 1 - Délimiteur 1
		tokenRegexps.add(Pattern.compile("^" + Pattern.quote(m.group(2))));
		// 2 - Délimiteur 2
		tokenRegexps.add(Pattern.compile("^" + Pattern.quote(m.group(3))));
		// 3 - Répétiteur
		tokenRegexps.add(Pattern.compile("^" + Pattern.quote(m.group(4))));
		// 4 - Délimiteur 3
		tokenRegexps.add(Pattern.compile("^" + Pattern.quote(m.group(6))));
		// 5 - Contenu standard
		tokenRegexps.add(Pattern.compile("^(?:(?!" + Pattern.quote(m.group(2)) + "|" +
				Pattern.quote(m.group(3)) + "|" + Pattern.quote(m.group(4)) + "|" +
				Pattern.quote(m.group(5)) + "|" + Pattern.quote(m.group(6)) + "|\\r|\\n).|" +
				"(?:" + Pattern.quote(m.group(5)) + ".)|(?:\\r[^\\p{Print}]*(?:A|" + 
				Pattern.quote(m.group(5)) + "A)" + Pattern.quote(m.group(2)) + "))*"));
		// 6 - Sauts de ligne
		tokenRegexps.add(Pattern.compile("^\\r\\p{Print}*(?!A|" + Pattern.quote(m.group(5)) + "A)"));
		
		// On crée également les regex pour nettoyer les chaines de caractères du contenu
		tokenRegexps.add(Pattern.compile("\\r[^\\p{Print}]*(?:A|" + Pattern.quote(m.group(5)) + "A)" +
				Pattern.quote(m.group(2))));
		tokenRegexps.add(Pattern.compile(Pattern.quote(m.group(5)) + "(.)"));
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
    private void fillToken() {
    	// Si les regexps pour lire les tokens ne sont pas définis, on les recherche :
    	if (tokenRegexps.size() == 0)
    		parseDelimiters(strict);
    		
    	// Essai de chaque regexp
    	for (int i = 0 ; i < 6 ; i++) {
    		Pattern to_match = tokenRegexps.get(i);

    		// Si le regexp ne fonctionne pas, on passe au suivant
    		if (scanner.findWithinHorizon(to_match, 0) == null)
    			continue;
    		
    		// Arrivé ici, le regexp fonctionne bien, on renvoie le token correspondant :
    		// Chaine dans le token
    		MatchResult m = scanner.match();
    		String tokenString = m.group(0);
    		// Identifiant du token
    		int tokenType = 0;
    		switch (i) {
    			case 0:
    				tokenType = HPRIMSParser.DELIMITER1;
    				break;
    			case 1:
    				tokenType = HPRIMSParser.DELIMITER2;
    				break;
    			case 2:
    				tokenType = HPRIMSParser.REPETITEUR;
    				break;
    			case 3:
    				tokenType = HPRIMSParser.DELIMITER3;
    				break;
    			case 4:
    				tokenType = HPRIMSParser.CONTENT;
    				// Il faut supprimer les les sauts de ligne
    				tokenString = tokenRegexps.get(6).matcher(tokenString).replaceAll("");
    				// Il faut remplacer les caractère échappés
    				tokenString = tokenRegexps.get(7).matcher(tokenString).replaceAll("$1");
    				break;
    			case 5:
    				tokenType = HPRIMSParser.NEWLINE;
    				break;
    		}
    		// Ajout du token dans la liste des tokens
			tokenList.add(createToken(tokenType,
					Lexer.DEFAULT_TOKEN_CHANNEL, tokenString.toCharArray()));
    		// Sortie de la fonction
			return;
    	}
    	
    	// Si on arrive ici, c'est qu'aucun regex n'a fonctionné :
    	// 1 - Est-on arrivé à la fin du fichier ?
    	try {
    		if (inputReader.read() == -1)
    			tokenList.add(createToken(HPRIMSParser.EOF,
    					Lexer.DEFAULT_TOKEN_CHANNEL, new char[]{}));
    		// 2 - On n'est pas à la fin
    		else
    			tokenList.add(CommonToken.INVALID_TOKEN);
    	} catch (IOException e) {
    		reportError(e.getMessage(), inputReader.getLineNumber(), inputReader.getCharNumber());
    		tokenList.add(CommonToken.INVALID_TOKEN);
    	}
    }
    
	/**
	 * Retourne le prochain token retrouvé dans le flux d'entrée de caractères
	 * @return Token token représentant la chaine trouvée, ou Token (EOF) si fin de fichier
	 */
	public Token nextToken() {
		// S'il n'y a pas de token dispo, on remplit la liste des tokens à envoyer
		while (tokenList.size() == 0) {
			fillToken();
		}
		// On a trouvé au moins un nouveau token, on l'envoie
		return tokenList.removeFirst();
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
	 public void reportError(String message, int line, int charInLine) {
		 logger.log(Level.INFO, message + " L:" + line +" C:" + charInLine);
		 throw new IllegalArgumentException(message + " L:" + line +" C:" + charInLine);
     }
	 
	 @Override
	 public void close() {
		 scanner.close();
	 }
	
}
