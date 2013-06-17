package com.github.aiderpmsi.hprim.parser.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.github.aiderpmsi.hprim.parser.HPRIMSScanner;
import com.github.aiderpmsi.hprim.parser.HPRIMSTokenSource;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;
import com.github.aiderpmsi.hprim.parser.xml.XmlContentHandler;


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
	public static void main(String[] args) throws IOException, RecognitionException {

		// Création du collecteur par défaut (affiche sur la console les données)
		XmlContentHandler contentHandler = new XmlContentHandler(new PrintWriter(System.out));
		
		// Définition des flux matériels (à fermer en fin d'utilisation)
		InputStream is = null;
		HPRIMSScanner inputreader = null;
		
		try {
			// Création de l'inputstream en entrée
			is = new FileInputStream(args[0]);
	
			// Création de la source des tokens
			inputreader = new HPRIMSScanner(is, "ISO8859_1");
			HPRIMSTokenSource toksce = new HPRIMSTokenSource(inputreader, true);
	
			// Création du flux de tokens
			TokenStream tokenstream = new CommonTokenStream (toksce);
	
			// Création du parser de tokens provenant de input et réalisant dans
			// la classe collecteur l'export des données
			HPRIMSParser parser = new HPRIMSParser(tokenstream, contentHandler);
	
			parser.hprim();
		} finally {
			// Fermeture propre des ressources allouées
			if (inputreader != null)
				inputreader.close();
			if (is != null)
				is.close();
		}
		
		System.out.println("done");
	}
}
