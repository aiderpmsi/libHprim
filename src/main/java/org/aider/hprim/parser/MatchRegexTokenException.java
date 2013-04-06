package org.aider.hprim.parser;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.RecognitionException;

import org.antlr.runtime.Token;

/**
 * Erreur lors des non reconnaissances de regex 
 * @author delabre
 * @version $Revision: 972 $
 */
public class MatchRegexTokenException extends RecognitionException {

	/**
	 * Numéro de version généré
	 */
	private static final long serialVersionUID = -9056085750892408912L;

	/**
	 * Texte ayant été comparé au regex
	 */
	private String text;
	
	/**
	 * Regex	
	 */
	private String regex;
	
	/**
	 * Constructeur par défaut
	 */
	public MatchRegexTokenException() {
		super();
	};
	
	/**
	 * Constructeur à partir d'un IntStream
	 * @param input
	 */
	public MatchRegexTokenException(IntStream input) {
		super(input);
	}

	/**
	 * Constructeur riche, permettant d'indiqer clairement l'erreur
	 * @param input
	 * @param startToken
	 * @param text
	 * @param regex
	 */
	public MatchRegexTokenException(IntStream input, Token startToken, String text, String regex) {
		 this.input = input;
		 this.index = input.index();
		 this.token = startToken;
		 this.line = token.getLine();
		 this.charPositionInLine = token.getCharPositionInLine();
		 this.text = text;
		 this.regex = regex;
	}
	
	/**
	 * Récupère le texte ayant bénéficié du regex 
	 * @return texte
	 */
	public String getText() {
		return text;
	}
	
	/**
	 * Récupère le regex
	 * @return regex
	 */
	public String getRegex() {
		return regex;
	}
}
