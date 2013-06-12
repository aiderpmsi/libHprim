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
			String toRead = "H|~^\\&|Test1.HPR||PO~LABM||ORU|||HPRIM~TESTE||P|H2.1~C|201204292059\r\n" +
					"P|1|398|B1042100871||GAULLE~MARECHAL|PIT|19370325|F||28 RUE DE LA PAIX~~PARIS~~75000|||||||||||||||~~TEST\r\n" +
					"OBR|1|idechantillo~|~20428E9575|TGO1~TGO ADVI~L^TGP1~TGP ADVI~L^LDH1~LDH ADVI~L^CK1~CK ADVIA~L^NFG~NF~L^NFF~NF~L^NF100~100%~L^PLA~PLA~L^TROPV~TROPV~L|S||201204281412^20120428||||N|||201204281413||PILO~DR PITO OLIV~L~TESTHP~Cliniq\r\n" +
					"A|ue HP~L|0468638395||||||||F|||||||VBIO\r\n" +
					"OBX|1|NM|OT1~TGO ADVIA~L||16|UI/l|10 - 40|N|||F|||201204281438|BIOCH~80~TGO1~388~0~P\r\n" +
					"C|1|L|Anemie macrocytaire\r\n" +
					"OBX|2|NM|HT~  Hematocrite~L||38.2|%|35 - 48|N|||F|||201204281504|HEMAT~20~NFG~15~2~P\r\n" +
					"OBX|3|FIC|TEXTE~~L||GALAXIE~AL213202.j1~TXT\r\n" +
					"L|1\r\n";
;
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
