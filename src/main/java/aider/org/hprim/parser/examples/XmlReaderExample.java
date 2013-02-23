package aider.org.hprim.parser.examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.logging.Logger;

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

		InputStream is = null;
		XmlReader reader = null;

		try {
			// Création de l'inputstream en entrée
			is = new FileInputStream(args[0]);

			// Transformation de cet inputstream hprim en reader xml
			reader = new XmlReader(is);
		
			// Lecture du reader et écriture sur la sortie standard
			char[] buffer = new char[256];
			int size;
			while ((size = reader.read(buffer)) != -1) {
				char[] toprint = Arrays.copyOf(buffer, size);
				System.out.print(toprint);
			}
		} finally {
			// Fermeture propre des flux d'entrée
			if (reader != null)
				reader.close();
			else if (is != null)
				is.close();
		}
		
	}
}
