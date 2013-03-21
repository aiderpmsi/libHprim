package aider.org.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import aider.org.hprim.parser.antlr.HPRIMSParser;
import aider.org.hprim.parser.xml.XmlContentHandler;

public class HPRIMSParserTest {

	@Test
	public void testHprim_2_1() throws IOException, RecognitionException {
		// Chaine de caractères à tester
		String testString = 
		"H|~^\\&|Test1.HPR||PO~LABM||ORU|||HPRIM~TESTE||P|H2.1~C|201204292059\r\n" +
		"P|1|398|B1042100871||GAULLE~MARECHAL|PIT|19370325|F||28 RUE DE LA PAIX~~PARIS~~75000|||||||||||||||~~TEST\r\n" +
		"OBR|1|idechantillo~|~20428E9575|TGO1~TGO ADVI~L^TGP1~TGP ADVI~L^LDH1~LDH ADVI~L^CK1~CK ADVIA~L^NFG~NF~L^NFF~NF~L^NF100~100%~L^PLA~PLA~L^TROPV~TROPV~L|S||201204281412^20120428||||N|||201204281413||PILO~DR PITO OLIV~L~TESTHP~Cliniq\r\n" +
		"A|ue HP~L|0468638395||||||||F|||||||VBIO\r\n" +
		"OBX|1|NM|OT1~TGO ADVIA~L||16|UI/l|10 - 40|N|||F|||201204281438|BIOCH~80~TGO1~388~0~P\r\n" +
		"C|1|L|Anemie macrocytaire\r\n" +
		"OBX|2|NM|HT~  Hematocrite~L||38.2|%|35 - 48|N|||F|||201204281504|HEMAT~20~NFG~15~2~P\r\n" +
		"OBX|3|FIC|TEXTE~~L||GALAXIE~AL213202.j1~TXT\r\n" +
		"L|1\r\n";

		// Création de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859-1"));
		
		// Récupère ce qui est écrit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractères
		parser.hprim();

		// Tests des résultats
		assertEquals("Erreur de resultat de parsing",
			"<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><message nom=\"hprim_oru_2_1\"><ligne nom=\"H\">" +
			"<champ nom=\"delimiteurs\">|~^\\&amp;</champ><champ nom=\"H_7.3\">Test1.HPR</champ><champ nom=\"H_7.4\">" +
			"</champ><champ nom=\"H_7.5\"><champ nom=\"H_7.5.1\">PO</champ><champ nom=\"H_7.5.2\">LABM</champ></champ>" +
			"<champ nom=\"H_7.6\"><champ nom=\"H_7.6.1\"></champ></champ><champ nom=\"H_7.7\">ORU</champ>" +
			"<champ nom=\"H_7.8\"><champ nom=\"H_7.8.1\"></champ></champ><champ nom=\"H_7.9\"></champ>" +
			"<champ nom=\"H_7.10\"><champ nom=\"H_7.10.1\">HPRIM</champ><champ nom=\"H_7.10.2\">TESTE</champ>" +
			"</champ><champ nom=\"H_7.11\"></champ><champ nom=\"H_7.12\">P</champ><champ nom=\"H_7.13\">" +
			"<champ nom=\"H_7.13.1\">H2.1</champ><champ nom=\"H_7.13.2\">C</champ></champ>" +
			"<champ nom=\"H_7.14\">201204292059</champ></ligne><body nom=\"P\"><ligne nom=\"P\">" +
			"<champ nom=\"P_8.2\">1</champ><champ nom=\"P_8.3\"><champ nom=\"P_8.3.1\">398</champ></champ>" +
			"<champ nom=\"P_8.4\">B1042100871</champ><champ nom=\"P_8.5\"></champ><champ nom=\"P_8.6\">" +
			"<champ nom=\"P_8.6.1\">GAULLE</champ><champ nom=\"P_8.6.2\">MARECHAL</champ></champ>" +
			"<champ nom=\"P_8.7\">PIT</champ><champ nom=\"P_8.8\">19370325</champ><champ nom=\"P_8.9\">F</champ>" +
			"<champ nom=\"P_8.11\"><champ nom=\"P_8.11.1\">28 RUE DE LA PAIX</champ><champ nom=\"P_8.11.2\">" +
			"</champ><champ nom=\"P_8.11.3\">PARIS</champ><champ nom=\"P_8.11.4\"></champ><champ nom=\"P_8.11.5\">75000</champ>" +
			"</champ><champ nom=\"P_8.12\"></champ><champ nom=\"P_8.13\"><champ nom=\"P_8.13.1\"></champ></champ>" +
			"<champ nom=\"P_8.14\"><champ nom=\"P_8.14.1\"></champ></champ><champ nom=\"P_8.15\"></champ>" +
			"<champ nom=\"P_8.16\"></champ><champ nom=\"P_8.17\"></champ><champ nom=\"P_8.18\"></champ>" +
			"<champ nom=\"P_8.19\"><champ nom=\"P_8.19.1\"></champ></champ><champ nom=\"P_8.20\"></champ>" +
			"<champ nom=\"P_8.21\"></champ><champ nom=\"P_8.22\"></champ><champ nom=\"P_8.23\"></champ>" +
			"<champ nom=\"P_8.24\"></champ><champ nom=\"P_8.25\"></champ><champ nom=\"P_8.26\">" +
			"<champ nom=\"P_8.26.1\"></champ><champ nom=\"P_8.26.2\"></champ><champ nom=\"P_8.26.3\">TEST</champ>" +
			"</champ></ligne><body nom=\"OBR\"><ligne nom=\"OBR\"><champ nom=\"OBR_9.2\">1</champ><champ nom=\"OBR_9.3\">" +
			"<champ nom=\"OBR_9.3.1\">idechantillo</champ><champ nom=\"OBR_9.3.2\"></champ></champ><champ nom=\"OBR_9.4\">" +
			"<champ nom=\"OBR_9.4.1\"></champ><champ nom=\"OBR_9.4.2\">20428E9575</champ></champ>" +
			"<champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">TGO1</champ><champ nom=\"OBR_9.5.2\">TGO ADVI</champ>" +
			"<champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">TGP1</champ>" +
			"<champ nom=\"OBR_9.5.2\">TGP ADVI</champ><champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\">" +
			"<champ nom=\"OBR_9.5.1\">LDH1</champ><champ nom=\"OBR_9.5.2\">LDH ADVI</champ><champ nom=\"OBR_9.5.3\">L</champ>" +
			"</champ><champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">CK1</champ><champ nom=\"OBR_9.5.2\">CK ADVIA</champ>" +
			"<champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">NFG</champ>" +
			"<champ nom=\"OBR_9.5.2\">NF</champ><champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\">" +
			"<champ nom=\"OBR_9.5.1\">NFF</champ><champ nom=\"OBR_9.5.2\">NF</champ><champ nom=\"OBR_9.5.3\">L</champ>" +
			"</champ><champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">NF100</champ><champ nom=\"OBR_9.5.2\">100%</champ>" +
			"<champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\"><champ nom=\"OBR_9.5.1\">PLA</champ>" +
			"<champ nom=\"OBR_9.5.2\">PLA</champ><champ nom=\"OBR_9.5.3\">L</champ></champ><champ nom=\"OBR_9.5\">" +
			"<champ nom=\"OBR_9.5.1\">TROPV</champ><champ nom=\"OBR_9.5.2\">TROPV</champ><champ nom=\"OBR_9.5.3\">L</champ>" +
			"</champ><champ nom=\"OBR_9.6\">S</champ><champ nom=\"OBR_9.7\"></champ><champ nom=\"OBR_9.8\">" +
			"<champ nom=\"OBR_9.8.1\">201204281412</champ><champ nom=\"OBR_9.8.2\">20120428</champ></champ>" +
			"<champ nom=\"OBR_9.9\"></champ><champ nom=\"OBR_9.10\"></champ><champ nom=\"OBR_9.11\"><champ nom=\"OBR_9.11.1\">" +
			"</champ></champ><champ nom=\"OBR_9.12\">N</champ><champ nom=\"OBR_9.13\"><champ nom=\"OBR_9.13.1\">" +
			"</champ></champ><champ nom=\"OBR_9.14\"></champ><champ nom=\"OBR_9.15\">201204281413</champ>" +
			"<champ nom=\"OBR_9_16\"><champ nom=\"OBR_9_16.2\"><champ nom=\"OBR_9_16.2.1\"></champ></champ></champ>" +
			"<champ nom=\"OBR_9.17\"><champ nom=\"OBR_9.17.1\">PILO</champ><champ nom=\"OBR_9.17.2\">DR PITO OLIV</champ>" +
			"<champ nom=\"OBR_9.17.3\">L</champ><champ nom=\"OBR_9.17.4\">TESTHP</champ><champ nom=\"OBR_9.17.5\">Clinique HP</champ>" +
			"<champ nom=\"OBR_9.17.6\">L</champ></champ><champ nom=\"OBR_9.18\"><champ nom=\"OBR_9.18.1\">0468638395</champ>" +
			"</champ><champ nom=\"OBR_9.19\"></champ><champ nom=\"OBR_9.20\"></champ><champ nom=\"OBR_9.21\"></champ>" +
			"<champ nom=\"OBR_9.22\"></champ><champ nom=\"OBR_9.23\"></champ><champ nom=\"OBR_9.25\"><champ nom=\"OBR_9.25.1\">" +
			"</champ></champ><champ nom=\"OBR_9.26\">F</champ><champ nom=\"OBR_9.29\"><champ nom=\"OBR_9.29.1\"></champ>" +
			"</champ><champ nom=\"OBR_9.30\"><champ nom=\"OBR_9.30.1\"></champ></champ><champ nom=\"OBR_9.31\"></champ>" +
			"<champ nom=\"OBR_9.32\"></champ><champ nom=\"OBR_9.33\"><champ nom=\"OBR_9.33.1\">VBIO</champ></champ>" +
			"</ligne><body nom=\"OBX\"><ligne nom=\"OBX\"><champ nom=\"OBX_10.2\">1</champ><champ nom=\"OBX_10.3\">NM</champ>" +
			"<champ nom=\"OBX_10.4\"><champ nom=\"OBX_10.4.1\">OT1</champ><champ nom=\"OBX_10.4.2\">TGO ADVIA</champ>" +
			"<champ nom=\"OBX_10.4.3\">L</champ></champ><champ nom=\"OBX_10.5\"></champ><champ nom=\"OBX_10.6\">16</champ>" +
			"<champ nom=\"OBX_10.7\">UI/l</champ><champ nom=\"OBX_10.8\">10 - 40</champ><champ nom=\"OBX_10.9\">N</champ>" +
			"<champ nom=\"OBX_10.10\"></champ><champ nom=\"OBX_10.11\"></champ><champ nom=\"OBX_10.12\">F</champ>" +
			"<champ nom=\"OBX_10.13\"></champ><champ nom=\"OBX_10.14\"></champ><champ nom=\"OBX_10.15\">201204281438</champ>" +
			"<champ nom=\"OBX_10.16\"><champ nom=\"OBX_10.16.1\">BIOCH</champ><champ nom=\"OBX_10.16.2\">80</champ>" +
			"<champ nom=\"OBX_10.16.3\">TGO1</champ><champ nom=\"OBX_10.16.4\">388</champ><champ nom=\"OBX_10.16.5\">0</champ>" +
			"<champ nom=\"OBX_10.16.6\">P</champ></champ></ligne><ligne nom=\"C\"><champ nom=\"C_12.2\">1</champ>" +
			"<champ nom=\"C_12.3\">L</champ><champ nom=\"C_12.4\">Anemie macrocytaire</champ></ligne></body>" +
			"<body nom=\"OBX\"><ligne nom=\"OBX\"><champ nom=\"OBX_10.2\">2</champ><champ nom=\"OBX_10.3\">NM</champ>" +
			"<champ nom=\"OBX_10.4\"><champ nom=\"OBX_10.4.1\">HT</champ><champ nom=\"OBX_10.4.2\">  Hematocrite</champ>" +
			"<champ nom=\"OBX_10.4.3\">L</champ></champ><champ nom=\"OBX_10.5\"></champ><champ nom=\"OBX_10.6\">38.2</champ>" +
			"<champ nom=\"OBX_10.7\">%</champ><champ nom=\"OBX_10.8\">35 - 48</champ><champ nom=\"OBX_10.9\">N</champ>" +
			"<champ nom=\"OBX_10.10\"></champ><champ nom=\"OBX_10.11\"></champ><champ nom=\"OBX_10.12\">F</champ>" +
			"<champ nom=\"OBX_10.13\"></champ><champ nom=\"OBX_10.14\"></champ><champ nom=\"OBX_10.15\">201204281504</champ>" +
			"<champ nom=\"OBX_10.16\"><champ nom=\"OBX_10.16.1\">HEMAT</champ><champ nom=\"OBX_10.16.2\">20</champ>" +
			"<champ nom=\"OBX_10.16.3\">NFG</champ><champ nom=\"OBX_10.16.4\">15</champ><champ nom=\"OBX_10.16.5\">2</champ>" +
			"<champ nom=\"OBX_10.16.6\">P</champ></champ></ligne></body><body nom=\"OBX\"><ligne nom=\"OBX\">" +
			"<champ nom=\"OBX_10.2\">3</champ><champ nom=\"OBX_10.3\">FIC</champ><champ nom=\"OBX_10.4\">" +
			"<champ nom=\"OBX_10.4.1\">TEXTE</champ><champ nom=\"OBX_10.4.2\"></champ><champ nom=\"OBX_10.4.3\">L</champ>" +
			"</champ><champ nom=\"OBX_10.5\"></champ><champ nom=\"OBX_10.6\"><champ nom=\"OBX_10.6.1\">GALAXIE</champ>" +
			"<champ nom=\"OBX_10.6.2\">AL213202.j1</champ><champ nom=\"OBX_10.6.3\">TXT</champ></champ></ligne>" +
			"</body></body></body><ligne nom=\"L\"><champ nom=\"L_14.2\">1</champ></ligne></message>",
				baos.toString());	
	}
	
	/**
	 * Teste le matching des chiffres (sgt_nm_long)
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	@Test
	public void testSgt_nm_long() throws IOException, RecognitionException {
		// Chaine de caractères à tester
		String testString = "H|~^\\&-1.60";
		
		// Création de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859_1"));
		
		// Récupère ce qui est écrit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractères
		parser.delimiters();
		parser.nm_sized_optionnal("SimpleExample", 15);

		// Tests des résultats
		assertEquals("Erreur de resultat de parsing",
				"<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><champ nom=\"delimiteurs\">|~^\\&amp;</champ>" +
				"<champ nom=\"SimpleExample\">-1.60</champ>",
				baos.toString());	
		assertTrue(parser.getNumberOfSyntaxErrors() == 0);
	}
	
	/**
	 * SimpleExample la possibilité qu'il y ait un segment 9.3 avec :
	 * DELIMITER1 (vide) DELIMITER2 (vide) DELIMITER1
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	@Test
	public void testSgt_cm_9_3_Case_1() throws IOException, RecognitionException {
		// Chaine de caractères à tester
		String testString = "H|~^\\&toto~";
		
		// Création de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859_1"));
		
		// Récupère ce qui est écrit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractères
		parser.delimiters();
		parser.spec_sized_9_3("OBR_9.3", 23);

		// Tests des résultats
		assertEquals("Erreur de resultat de parsing",
				"<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><champ nom=\"delimiteurs\">|~^\\&amp;</champ>" +
				"<champ nom=\"OBR_9.3\"><champ nom=\"OBR_9.3.1\">toto</champ><champ nom=\"OBR_9.3.2\"></champ></champ>",
				baos.toString());	
	}
	
	/**
	 * SimpleExample la réaction devant une erreur de matchRegexp
	 */
	@Test
	public void testError_Case_1() throws IOException, RecognitionException {
		// Chaine de caractères à tester
		String testString = "H|~^\\&123";
		
		// Création de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859_1"));
		
		// Récupère ce qui est écrit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Destiné à recevoir l'erreur émise
		String error = null;
		
		// Parsing de la chaine de caractères
		parser.delimiters();
		try {
			parser.st_sized_optionnal("SimpleExample", 2);
		} catch (IllegalArgumentException e) {
			error = e.getMessage();
		}
		assertEquals("Reader line 1:7 Malformed message : 123 does not match ^.{0,2}$", error);
	}

}
