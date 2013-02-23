package aider.org.hprim.parser.examples;

import java.io.*;
import java.util.logging.Logger;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

import aider.org.hprim.parser.xml.XmlReader;


/**
 * Classe d'exemple
 * @author delabre
 * @version $Id: SimpleExample.java 1024 2012-08-06 19:47:04Z jp $
 */
public class XmlXsltSimpleExample {

	/**
	 * Logger de la classe
	 */
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(XmlXsltSimpleExample.class.getCanonicalName());

	/**
	 * @param args
	 * @throws IOException 
	 * @throws TransformerException 
	 */
	public static void main(String[] args) throws IOException, TransformerException {
		
		InputStream is = null;
		XmlReader reader = null;
		
		try {
			// Création de l'inputstream en entrée
			is = new FileInputStream(args[0]);
	
			// Transformation de cet inputstream hprim en reader xml
			reader = new XmlReader(is);
			
			// Création d'une instance de transformation
			TransformerFactory tFactory = TransformerFactory.newInstance();
			// Définition du xslt utilisé
			InputStream isXslt = reader.getClass().getClassLoader().getResourceAsStream("aider/org/hprim/parser/examples/example.xslt");
		    Transformer transformer = tFactory.newTransformer(new StreamSource(isXslt));
		    // Transformation 
		    transformer.transform(new StreamSource(reader), new StreamResult(System.out));
		} finally {
			if (reader != null)
				reader.close();
			else if (is != null)
				is.close();
		}
	}
}
