package aider.org.hprim.parser.examples;

import java.io.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.antlr.runtime.*;


/**
 * Classe d'exemple
 * @author delabre
 * @version $Id: MainExample.java 1024 2012-08-06 19:47:04Z jp $
 */
public class MainExample {

	/**
	 * Logger de la classe
	 */
	private static final Logger logger = Logger.getLogger(MainExample.class.getCanonicalName());
	
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

		// Création du collecteur par défaut (affiche sur la console les donn�es)
		DefaultCollecteur col = new DefaultCollecteur(System.out);
		
		// Création de l'inputstream en entrée
		InputStream is = new FileInputStream(args[0]);
		
		// Création du parseur par défaut
		DefaultParser parser = new DefaultParser(is, col);
		// Parsing
		parser.parse();
		
		// Récupération des erreurs
		if (parser.hasErrors()) {
			logger.log(Level.WARNING, "Fichier " + args[0] + " en erreur :\n" +
					"Nombre d'erreurs : " + parser.getErrors().size());
			for (String err : parser.getErrors()) {
				logger.log(Level.INFO, err);
			}
		}
		
		// Fermeture du fichier d'entrée
		is.close();
		
		System.out.println("done");
	}
}
