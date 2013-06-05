package com.github.aiderpmsi.hprim.parser.examples;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Logger;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import com.github.aiderpmsi.hprim.parser.HPRIMSInputStreamReader;
import com.github.aiderpmsi.hprim.parser.HPRIMSTokenSource;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;



/**
 * Classe d'exemple
 * @author delabre
 * @version $Id: SimpleExample.java 1024 2012-08-06 19:47:04Z jp $
 */
public class SimpleExample {

	/**
	 * Logger de la classe
	 */
	@SuppressWarnings("unused")
	private static final Logger logger = Logger.getLogger(SimpleExample.class.getCanonicalName());
	
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
		ContentHandlerExample contentHandler = new ContentHandlerExample(new PrintWriter(System.out));
		
		// Définition des flux matériels (à fermer en fin d'utilisation)
		InputStream is = null;
		HPRIMSInputStreamReader inputreader = null;
		
		try {
			// Création de l'inputstream en entrée
			is = new FileInputStream(args[0]);
			String toRead = "H|~^\\&|TEST.HPR||code~labo||ORU|||TEST~T.E.S.T||P|H2.2~C|200700\r" +
					"P|1|01234|A0010308007|01234|NOM~PRENOM~AUTRE||19790101|F||21 RUE DE LA PAIX~~PARIS~~75000|||hello~un&deux^bye~3&4~good\r" +
					"C|2|P|toto\r" +
					"OBR|1|~|227dc251e1~70528100180|NF|R||200705281759|||hello~un&deux|N|||200705281801||MAB~DR MAB OUL~L|||||||||F|||||||VAUTO\r" +
					"OBX|1|NM|GR~HEMATIES x1 000 000~L||3.98|/mm3|7 - 5.7|L|||F|||200705291644|HEMAT~20~NF~10~0~P\r" +
					"C|2|P|toto\r" +
					"P|1|01234|A0010308007|01234|NOM~PRENOM~AUTRE||19790101|F||21 RUE DE LA PAIX~~PARIS~~75000|||hello~un&deux^bye~3&4~good";
			ByteArrayInputStream by = new ByteArrayInputStream(toRead.getBytes("ISO8859_1"));
			// Création de la source des tokens
			inputreader = new HPRIMSInputStreamReader(by, "ISO8859_1");
			HPRIMSTokenSource toksce = new HPRIMSTokenSource(inputreader);
	
			// Création du flux de tokens
			TokenStream tokenstream = new CommonTokenStream (toksce);
	
			// Création du parser de tokens provenant de input et réalisant dans
			// la classe collecteur l'export des données
			HPRIMSParser parser = new HPRIMSParser(tokenstream, contentHandler);
	
			parser.hprim(2);
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
