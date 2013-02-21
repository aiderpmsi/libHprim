package aider.org.hprim.parser.examples;

import java.io.*;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Logger;

import org.antlr.runtime.*;

import aider.org.hprim.parser.xml.XmlReader;


/**
 * Classe d'exemple
 * @author delabre
 * @version $Id: SimpleExample.java 1024 2012-08-06 19:47:04Z jp $
 */
public class XmlReaderExample {

	/**
	 * Logger de la classe
	 */
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(XmlReaderExample.class.getCanonicalName());
	
	/**
	 * @param args
	 * @throws Exception 
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 * @throws RecognitionException 
	 * @throws HPRIMSMismatchException 
	 */
	public static void main(String[] args) throws IOException {

		// Création de l'inputstream en entrée
		InputStream is = new FileInputStream(args[0]);

		// Transformation de cet inputstream hprim en reader xml
		XmlReader reader = new XmlReader(is);
		
		char[] buffer = new char[256];
		int size;
		
		while ((size = reader.read(buffer)) != -1) {
			char[] toprint = Arrays.copyOf(buffer, size);
			System.out.print(toprint);
		}

		// Fermeture du fichier d'entrée
		is.close();
		
		reader.close();
		
		System.out.println("done");
		
		System.exit(0);
	}
}
