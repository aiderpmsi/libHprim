package org.aider.hprim.parser.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Logger;

import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.aider.hprim.parser.xml.HprimReader;
import org.xml.sax.ContentHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;



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
		
		// Définition des flux matériels (à fermer en fin d'utilisation)
		InputStream is = null;
		InputSource inputS = null;
		
		try {
			// Création de l'inputstream en entrée
			is = new FileInputStream(args[0]);
			
			inputS = new InputSource(new InputStreamReader(is, "ISO8859_1"));
			
			// Définition du reader utilisé
			XMLReader reader = new HprimReader();
	
			// Création d'une instance de transformation
			TransformerFactory tFactory = TransformerFactory.newInstance();
			
			// Définition du xslt utilisé
			InputStream isXslt = reader.getClass().getClassLoader().getResourceAsStream("aider/org/hprim/parser/examples/example.xslt");
		    Transformer transformer = tFactory.newTransformer(new StreamSource(isXslt));
		    
		    // Définition du contenthandler de sortie :
		    ContentHandler example = new ContentHandlerExample(new PrintWriter(System.out));
		    
		    // Transformation
		    transformer.transform(new SAXSource(reader, inputS), new SAXResult(example));
		    // If only xml output :
		    // transformer.transform(new SAXSource(reader, inputS), new StreamResult(System.out));
		} catch (NullPointerException e) {
			e.printStackTrace();
		} finally {
			if (is != null) {
				is.close();
			}
		}

		System.out.println("done");
	}
}
