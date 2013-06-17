package com.github.aiderpmsi.hprim.parser.xml;

import java.io.IOException;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.XMLFilterImpl;

import com.github.aiderpmsi.hprim.parser.HPRIMSScanner;
import com.github.aiderpmsi.hprim.parser.HPRIMSTokenSource;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;


/**
 * @author delabre
 *
 */
public class HprimReader extends XMLFilterImpl {

	private int strictness = 3;
	
	@Override
	public void parse(InputSource input) throws IOException, SAXException {

		// Définition des flux matériels (à fermer en fin d'utilisation)
		HPRIMSScanner inputreader = null;
		
		try {
			// Création de la source des tokens
			inputreader = new HPRIMSScanner(input.getCharacterStream());
			HPRIMSTokenSource toksce = new HPRIMSTokenSource(inputreader, true);
	
			// Création du flux de tokens
			TokenStream tokenstream = new CommonTokenStream (toksce);
	
			// Création du parser de tokens provenant de input et réalisant dans
			// la classe collecteur l'export des données
			HPRIMSParser parser = new HPRIMSParser(tokenstream, getContentHandler());
	
			// Parsing hprim oru
			parser.hprim();
		} catch (RecognitionException e) {
			throw new SAXException(e);
		} catch (IllegalArgumentException e) {
			throw new SAXException(e);
		} finally {
			// Fermeture propre des ressources allouées
			if (inputreader != null)
				inputreader.close();
		}
	}



	public int getStrictness() {
		return strictness;
	}



	public void setStrictness(int strictness) {
		this.strictness = strictness;
	}

}
