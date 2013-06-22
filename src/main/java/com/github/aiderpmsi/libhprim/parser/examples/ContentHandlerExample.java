package com.github.aiderpmsi.libhprim.parser.examples;

import org.apache.commons.lang3.StringEscapeUtils;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.PrintStream;
import java.io.Writer;
import java.util.concurrent.CancellationException;

/**
 * Implémentation de l'interface ContentHandler permettant de sortir sur une
 * sortie de type {@link PrintStream} les éléments du fichier HPRIM sous la
 * forme d'un xml valide
 * 
 * @author delabre
 */
public class ContentHandlerExample implements ContentHandler {

	/**
	 * Writer utilisé dans ce collecteur
	 */
	private Writer out;

	/**
	 * Constructeur
	 */
	public ContentHandlerExample(Writer writer) {
		this.out = writer;
	}

	// ======== Méthodes pour ContentHandler =======
	@Override
	public void setDocumentLocator(Locator locator) {
		// Do nothing
	}

	@Override
	public void startDocument() throws SAXException {
		try {
			out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void endDocument() throws SAXException {
		try {
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
		// Do nothing
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		// Do nothing
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		StringBuilder builder = new StringBuilder();
		try {
			builder.append("<").append(StringEscapeUtils.escapeXml(localName));
			if (atts != null) {
				int i = 0;
				while (i < atts.getLength()) {
					builder.append(" ")
							.append(StringEscapeUtils.escapeXml(atts
									.getLocalName(i)))
							.append("=\"")
							.append(StringEscapeUtils.escapeXml(atts
									.getValue(i))).append("\"");
					i++;
				}
			}
			builder.append(">");
			out.write(builder.toString());
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		StringBuilder builder = new StringBuilder();
		try {
			builder.append("</").append(StringEscapeUtils.escapeXml(localName))
					.append(">");
			out.write(builder.toString());
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		try {
			out.write(StringEscapeUtils
					.escapeXml(new String(ch, start, length)));
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
		// Do nothing
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
		// Do nothing
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		// Do nothing
	}

}