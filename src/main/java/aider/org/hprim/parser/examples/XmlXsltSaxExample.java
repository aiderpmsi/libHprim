package aider.org.hprim.parser.examples;

import java.io.*;
import java.util.logging.Logger;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.xml.sax.SAXException;

import aider.org.hprim.parser.xml.XmlReader;


/**
 * Classe d'exemple
 * @author delabre
 * @version $Id: SimpleExample.java 1024 2012-08-06 19:47:04Z jp $
 */
public class XmlXsltSaxExample {

	/**
	 * Logger de la classe
	 */
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(XmlXsltSaxExample.class.getCanonicalName());

	/**
	 * @param args
	 * @throws IOException 
	 * @throws TransformerException 
	 * @throws SAXException 
	 */
	public static void main(String[] args) throws IOException, TransformerException, SAXException {
		// Création de l'inputstream en entrée
		InputStream is = new FileInputStream(args[0]);

		// Transformation de cet inputstream hprim en reader xml
		XmlReader reader = new XmlReader(is);
		
		// Création d'une instance de transformation
		TransformerFactory tFactory = TransformerFactory.newInstance();
		// Définition du xslt utilisé
		InputStream isXslt = reader.getClass().getClassLoader().getResourceAsStream("aider/org/hprim/parser/examples/example.xslt");
	    Transformer transformer = tFactory.newTransformer(new StreamSource(isXslt));
	    // Définition du gestionnaire de contenu utilisé sur le résultat de la transformation
	    ContentHandlerExample example = new ContentHandlerExample(new PrintWriter(System.out));
	    // Transformation 
	    transformer.transform(new StreamSource(reader), new SAXResult(example));
			    
		// Fermeture du fichier d'entrée
		is.close();
		
		reader.close();

		System.out.println("done");
	}
}
