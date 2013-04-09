package com.github.aiderpmsi.hprim.parser.examples;

import java.io.IOException;
import java.io.Writer;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class ContentHandlerExample implements ContentHandler {

	private Writer out;
	
	private int level = 0;
	
	public ContentHandlerExample(Writer out) {
		this.out = out;
	}
	
	@Override
	public void setDocumentLocator(Locator locator) {
	}

	@Override
	public void startDocument() throws SAXException {
		try {
			out.write("Début document ");
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void endDocument() throws SAXException {
		try {
			out.write("\nFin document \n");
			out.flush();
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void startPrefixMapping(String prefix, String uri)
			throws SAXException {
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes atts) throws SAXException {
		try {
			out.write("\n");
			indent();
			out.write(localName + " : ");
		} catch (IOException e) {
			throw new SAXException(e);
		}
		level++;
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		level--;
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		try {
			out.write(ch, start, length);
		} catch (IOException e) {
			throw new SAXException(e);
		}
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length)
			throws SAXException {
	}

	@Override
	public void processingInstruction(String target, String data)
			throws SAXException {
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
	}

	private void indent() throws IOException {
		for (int i = 0 ; i < level ; i++) {
			out.write("+");
		}
	}
}
