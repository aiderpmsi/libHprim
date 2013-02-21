package aider.org.hprim.parser.xml;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.concurrent.CancellationException;

import org.apache.commons.lang.StringEscapeUtils;

import aider.org.hprim.parser.ContentHandler;

/**
 * Implémentation de l'interface ContentHandler permettant de sortir sur une sortie
 * de type {@link PrintStream} les éléments du fichier HPRIM sous la forme d'un xml
 * valide
 * @author delabre
 */
public class XmlContentHandler implements ContentHandler {
		
	/**
	 * Writer utilisé dans ce collecteur
	 */
	private PrintWriter out;

	/**
	 * Pile FILO permettant de se souvenir du type d'élément antérieur
	 */
	private Stack<String> typeElementStack = new Stack<String>();

	/**
	 * Pile FILO permettant de se souvenir du nom d'élément antérieur
	 */
	private Stack<String> nameElementStack = new Stack<String>();

	/**
	 * Constructeur
	 */
	public XmlContentHandler(PrintWriter printWriter) {
		this.out = printWriter;
		out.write("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>");
		out.flush();
		if (Thread.currentThread().isInterrupted())
			throw new CancellationException();
	}
	
	// ======== Méthodes pour ContentHandler =======
	
	@Override
	public void startElement(String typeElement, String nameElement) {
		out.write("<" + StringEscapeUtils.escapeXml(typeElement) +
				" nom=\"" + StringEscapeUtils.escapeXml(nameElement) + "\">");
		out.flush();
		typeElementStack.add(typeElement);
		nameElementStack.add(nameElement);
		if (Thread.currentThread().isInterrupted())
			throw new CancellationException();
	}

	@Override
	public void endElement() {
		out.write("</" + StringEscapeUtils.escapeXml(typeElementStack.pop()) + ">");
		out.flush();
		nameElementStack.pop();
		if (Thread.currentThread().isInterrupted())
			throw new CancellationException();
	}

	@Override
	public void content(String contenu) {
		out.write(StringEscapeUtils.escapeXml(contenu));
		out.flush();
		if (Thread.currentThread().isInterrupted())
			throw new CancellationException();
	}

}
