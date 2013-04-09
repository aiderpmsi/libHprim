package com.github.aiderpmsi.hprim.parser;

import org.antlr.runtime.IntStream;
import org.antlr.runtime.RecognitionException;

import org.antlr.runtime.Token;

/**
 * Erreur lors de la gestion de contentHanlder
 */
public class ContentHandlerException extends RecognitionException {

	/**
	 * Numéro de version généré
	 */
	private static final long serialVersionUID = -9127327223096277825L;

	/**
	 * Message d'erreur
	 */
	private String text;
	
	/**
	 * Constructeur par défaut
	 */
	public ContentHandlerException() {
		super();
	};
	
	/**
	 * Constructeur riche, permettant d'indiquer clairement l'erreur
	 * @param input
	 * @param startToken
	 * @param text
	 * @param regex
	 */
	public ContentHandlerException(String text) {
		 this.text = text;
	}
	
	/**
	 * Sélectionne le flux d'entrée
	 */
	public void setIntStream(IntStream input) {
		this.input = input;
		this.index = input.index();
	}
	
	/**
	 * Sélectionne le token d'entrée
	 */
	public void setStartToken(Token startToken) {
		 this.token = startToken;
		 this.line = token.getLine();
		 this.charPositionInLine = token.getCharPositionInLine();
	}
	
	/**
	 * Récupère le texte ayant bénéficié du regex 
	 * @return texte
	 */
	public String getText() {
		return text;
	}

}
