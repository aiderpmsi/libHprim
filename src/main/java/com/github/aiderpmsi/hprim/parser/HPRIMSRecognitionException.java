package com.github.aiderpmsi.hprim.parser;

import org.antlr.runtime.RecognitionException;

/**
 * Redéfinit les erreurs de reconnaissance pour le tokenizer
 * {@link HPRIMSTokenSource}
 * @author delabre
 * @version $Revision: 1029 $
 */
public class HPRIMSRecognitionException extends RecognitionException {
    
	/**
	 * Source des caractères
	 */
	private HPRIMSInputStreamReader reader;
	
	/**
	 * Message de l'erreur
	 */
	private String msg;

	/**
	 * Caractères du flux qui ont posé l'erreur 
	 */
	private char[] errorChar;

	/**
	 * Ligne lue dans le flux d'entrée
	 */
	private int line;

	/**
	 * Caractère dans le flux d'entrée lu
	 */
	private int charPositionInLine;

	/**
	 * Numéro de série
	 */
	private static final long serialVersionUID = -3080833919898873756L;

	/**
	 * Constructeur riche
	 * @param msg Message à transmettre
	 * @param reader Lecteur de flux
	 * @param errorChar liste decaractères ayant provoqué l'rreur
	 */
	public HPRIMSRecognitionException(String msg, HPRIMSInputStreamReader reader,
			char[] errorChar) {
		this.msg = msg;
		this.reader = reader;
		this.charPositionInLine = reader.getCharNumber();
		this.line = reader.getLineNumber();
		this.errorChar = errorChar;
	}
	
	public HPRIMSInputStreamReader getReader() {
		return reader;
	}

	@Override
	public String getMessage() {
		return msg;
	}
	
	/**
	 * Renvoie le texte contenant l'erreur.
	 */
	public char[] getContent() {
		return errorChar;
	}

	public int getLine() {
		return line;
	}

	public int getCharPositionInLine() {
		return charPositionInLine;
	}
}
