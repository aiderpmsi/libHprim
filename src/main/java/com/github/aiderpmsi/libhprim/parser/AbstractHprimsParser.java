package com.github.aiderpmsi.libhprim.parser;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map.Entry;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

public abstract class AbstractHprimsParser extends Parser {

	/**
	 * Collecteur utilisé dans cette classe
	 */
	public ContentHandler contentHandler;

	/**
	 * Type utilisé pour se souvenir du dernier élément
	 */
	private class XmlElement {
		public String uri;
		public String localName;
		public String qName;
	}
	
	/**
	 * Liste des éléments parcourus
	 */
	private LinkedList<XmlElement> xmlElements = new LinkedList<>();

	/**
	 * Type de conformance :
	 */
	final public static int FULL_CONFORMANCE = 3;
	final public static int MEDIUM_CONFORMANCE = 2;
	final public static int LOW_CONFORMANCE = 1;
	final public static int NO_CONFORMANCE = 0;
	
	/**
	 * Niveau de conformance à HPRIM demandé par définition FULL
	 */
	private int strictNess = FULL_CONFORMANCE;

	public AbstractHprimsParser(TokenStream input) {
		super(input);
	}

	public ContentHandler getContentHandler() {
		return contentHandler;
	}

	public void setContentHandler(ContentHandler contentHandler) {
		this.contentHandler = contentHandler;
	}

	public int getStrictNess() {
		return strictNess;
	}

	public void setStrictNess(int strictNess) {
		this.strictNess = strictNess;
	}

	/**
	 * Finds if the next token has this content
	 * @param character
	 * @return
	 */
	protected boolean tryToken(String content) {
		if (getInputStream().LT(1).getText().equals(content)) {
			return true;
		} else
			return false;
	}
	
	/**
	 * Encadre l'appel du contentHandler
	 */
	public void startElement(String nameElement, HashMap<String, String> attributes) {
		try {
			// Création de cet élément
			XmlElement xmlElement = new XmlElement();
			xmlElement.uri = "";
			xmlElement.localName = nameElement;
			xmlElement.qName = nameElement;
			xmlElements.add(xmlElement);
			
			// Création des attributs de cet élément
			AttributesImpl atts = new AttributesImpl();
			for (Entry<String, String> entry : attributes.entrySet()) {
				atts.addAttribute("", entry.getKey(), entry.getKey(), "string", entry.getValue());
			}
			
			// Ajout de ce élément avec ses attributs
			contentHandler.startElement("", nameElement, nameElement, atts);

		} catch (SAXException e) {
			notifyErrorListeners(e.getMessage());
		}
	}

	/**
	 * Encadre l'appel du contentHandler
	 */
	public void endElement() {
		try {
			XmlElement xmlElement = xmlElements.pollLast();
			contentHandler.endElement(xmlElement.uri, xmlElement.localName,
					xmlElement.qName);
		} catch (SAXException e) {
			notifyErrorListeners(e.getMessage());
		}
	}

	/**
	 * Début de document
	 */
	public void startDocument() {
		try {
			contentHandler.startDocument();
		} catch (SAXException e) {
			notifyErrorListeners(e.getMessage());
		}
	}

	/**
	 * Fin de document
	 */
	public void endDocument() {
		try {
			contentHandler.endDocument();
		} catch (SAXException e) {
			notifyErrorListeners(e.getMessage());
		}
	}

	/**
	 * Encadre l'appel du contentHandler
	 */
	public void content(String content) {
		try {
			contentHandler.characters(content.toCharArray(), 0,
					content.length());
		} catch (SAXException e) {
			notifyErrorListeners(e.getMessage());
		}
	}
	
}
