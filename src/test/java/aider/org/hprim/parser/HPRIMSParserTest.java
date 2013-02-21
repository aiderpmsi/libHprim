package aider.org.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import aider.org.hprim.parser.HPRIMSTokenSource;
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
		
		// Rï¿½cupï¿½re ce qui est ï¿½crit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractères
		parser.hprim();

		assertTrue(parser.getNumberOfSyntaxErrors() == 0);

		// Tests des résultats
		assertEquals("Erreur de resultat de parsing",
				"<message nom = hprim_2_1>\n<ligne nom = H>\n<champ nom = delimiteurs>\n" +
				"|~^\\&\n<\\champ>\n<champ nom = H_7.3>\nTest1.HPR\n<\\champ>\n" +
				"<champ nom = H_7.4>\n<\\champ>\n" +
				"<champ nom = H_7.5>\n<champ nom = H_7.5.1>\nPO\n<\\champ>\n<champ nom = H_7.5.2>\n" +
				"LABM\n<\\champ>\n<\\champ>\n<champ nom = H_7.6>\n<champ nom = H_7.6.1>\n<\\champ>\n" +
				"<\\champ>\n<champ nom = H_7.7>\n" +
				"ORU\n<\\champ>\n<champ nom = H_7.8>\n<champ nom = H_7.8.1>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = H_7.9>\n<\\champ>\n" +
				"<champ nom = H_7.10>\n<champ nom = H_7.10.1>\nHPRIM\n<\\champ>\n" +
				"<champ nom = H_7.10.2>\nTESTE\n<\\champ>\n<\\champ>\n<champ nom = H_7.11>" +
				"\n<\\champ>\n<champ nom = H_7.12>\n" +
				"P\n<\\champ>\n<champ nom = H_7.13>\n<champ nom = H_7.13.1>\nH2.1\n" +
				"<\\champ>\n<champ nom = H_7.13.2>\nC\n<\\champ>\n<\\champ>\n<champ nom = H_7.14>\n" +
				"201204292059\n<\\champ>\n<\\ligne>\n<body nom = P>\n<ligne nom = P>\n" +
				"<champ nom = P_8.2>\n1\n<\\champ>\n<champ nom = P_8.3>\n<champ nom = P_8.3.1>\n398\n<\\champ>\n" +
				"<\\champ>\n<champ nom = P_8.4>\nB1042100871\n" +
				"<\\champ>\n<champ nom = P_8.5>\n<\\champ>\n<champ nom = P_8.6>\n" +
				"<champ nom = P_8.6.1>" +
				"\nGAULLE\n" +
				"<\\champ>\n<champ nom = P_8.6.2>\nMARECHAL\n<\\champ>\n<\\champ>\n" +
				"<champ nom = P_8.7>\nPIT\n<\\champ>\n<champ nom = P_8.8>\n19370325\n" +
				"<\\champ>\n<champ nom = P_8.9>\nF\n<\\champ>\n<champ nom = P_8.11>\n" +
				"<champ nom = P_8.11.1>\n28 RUE DE LA PAIX\n<\\champ>\n<champ nom = P_8.11.2>\n" +
				"<\\champ>\n<champ nom = P_8.11.3>\n" +
				"PARIS\n<\\champ>\n<champ nom = P_8.11.4>\n<\\champ>\n<champ nom = P_8.11.5>" +
				"\n75000\n<\\champ>\n<\\champ>\n<champ nom = P_8.12>\n<\\champ>\n" +
				"<champ nom = P_8.13>\n<champ nom = P_8.13.1>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = P_8.14>\n<champ nom = P_8.14.1>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = P_8.15>\n<\\champ>\n<champ nom = P_8.16>\n<\\champ>\n" +
				"<champ nom = P_8.17>\n<\\champ>\n<champ nom = P_8.18>\n<\\champ>\n" +
				"<champ nom = P_8.19>\n<champ nom = P_8.19.1>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = P_8.20>\n<\\champ>\n<champ nom = P_8.21>\n<\\champ>\n" +
				"<champ nom = P_8.22>\n<\\champ>\n<champ nom = P_8.23>\n<\\champ>\n" +
				"<champ nom = P_8.24>\n<\\champ>\n<champ nom = P_8.25>\n<\\champ>\n" +
				"<champ nom = P_8.26>\n<champ nom = P_8.26.1>\n<\\champ>\n" +
				"<champ nom = P_8.26.2>\n<\\champ>\n<champ nom = P_8.26.3>\nTEST\n<\\champ>\n<\\champ>\n" +
				"<\\ligne>\n<body nom = OBR>\n<ligne nom = OBR>\n<champ nom = OBR_9.2>\n" +
				"1\n<\\champ>\n<champ nom = OBR_9.3>\n<champ nom = OBR_9.3.1>\n" +
				"idechantillo\n<\\champ>\n<champ nom = OBR_9.3.2>\n<\\champ>\n" +
				"<\\champ>\n<champ nom = OBR_9.4>\n<champ nom = OBR_9.4.1>\n<\\champ>\n" +
				"<champ nom = OBR_9.4.2>\n20428E9575\n" +
				"<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\n" +
				"TGO1\n<\\champ>\n<champ nom = OBR_9.5.2>\nTGO ADVI\n<\\champ>\n" +
				"<champ nom = OBR_9.5.3>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n" +
				"<champ nom = OBR_9.5.1>\nTGP1\n<\\champ>\n<champ nom = OBR_9.5.2>\n" +
				"TGP ADVI\n<\\champ>\n<champ nom = OBR_9.5.3>\nL\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\nLDH1\n<\\champ>\n" +
				"<champ nom = OBR_9.5.2>\nLDH ADVI\n<\\champ>\n<champ nom = OBR_9.5.3>\n" +
				"L\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\n" +
				"CK1\n<\\champ>\n<champ nom = OBR_9.5.2>\nCK ADVIA\n<\\champ>\n" +
				"<champ nom = OBR_9.5.3>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n" +
				"<champ nom = OBR_9.5.1>\nNFG\n<\\champ>\n<champ nom = OBR_9.5.2>\n" +
				"NF\n<\\champ>\n<champ nom = OBR_9.5.3>\nL\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\nNFF\n<\\champ>\n" +
				"<champ nom = OBR_9.5.2>\nNF\n<\\champ>\n<champ nom = OBR_9.5.3>\n" +
				"L\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\n" +
				"NF100\n<\\champ>\n<champ nom = OBR_9.5.2>\n100%\n<\\champ>\n<champ nom = OBR_9.5.3>\n" +
				"L\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\n" +
				"PLA\n<\\champ>\n<champ nom = OBR_9.5.2>\nPLA\n<\\champ>\n<champ nom = OBR_9.5.3>\n" +
				"L\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.5>\n<champ nom = OBR_9.5.1>\n" +
				"TROPV\n<\\champ>\n<champ nom = OBR_9.5.2>\nTROPV\n<\\champ>\n<champ nom = OBR_9.5.3>\n" +
				"L\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.6>" +
				"\nS\n<\\champ>\n<champ nom = OBR_9.7>\n<\\champ>\n" +
				"<champ nom = OBR_9.8>\n<champ nom = OBR_9.8.1>\n201204281412\n" +
				"<\\champ>\n<champ nom = OBR_9.8.2>\n20120428\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.9>\n<\\champ>\n<champ nom = OBR_9.10>\n<\\champ>\n" +
				"<champ nom = OBR_9.11>\n<champ nom = OBR_9.11.1>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.12>\nN\n<\\champ>\n<champ nom = OBR_9.13>\n" +
				"<champ nom = OBR_9.13.1>\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.14>\n" +
				"<\\champ>\n<champ nom = OBR_9.15>\n" +
				"201204281413\n<\\champ>\n<champ nom = OBR_9_16>\n<champ nom = OBR_9_16.2>\n" +
				"<champ nom = OBR_9_16.2.1>\n<\\champ>\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.17>\n<champ nom = OBR_9.17.1>\n" +
				"PILO\n<\\champ>\n<champ nom = OBR_9.17.2>\nDR PITO OLIV\n<\\champ>\n" +
				"<champ nom = OBR_9.17.3>\nL\n<\\champ>\n<champ nom = OBR_9.17.4>\n" +
				"TESTHP\n<\\champ>\n<champ nom = OBR_9.17.5>\nClinique HP\n<\\champ>\n" +
				"<champ nom = OBR_9.17.6>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.18>\n" +
				"<champ nom = OBR_9.18.1>\n0468638395\n<\\champ>\n<\\champ>\n" +
				"<champ nom = OBR_9.19>\n<\\champ>\n<champ nom = OBR_9.20>\n<\\champ>\n" +
				"<champ nom = OBR_9.21>\n<\\champ>\n<champ nom = OBR_9.22>\n<\\champ>\n" +
				"<champ nom = OBR_9.23>\n<\\champ>\n<champ nom = OBR_9.25>\n" +
				"<champ nom = OBR_9.25.1>\n<\\champ>\n<\\champ>\n<champ nom = OBR_9.26>\n" +
				"F\n<\\champ>\n<champ nom = OBR_9.29>\n<champ nom = OBR_9.29.1>\n<\\champ>\n" +
				"<\\champ>\n<champ nom = OBR_9.30>\n<champ nom = OBR_9.30.1>\n<\\champ>\n" +
				"<\\champ>\n<champ nom = OBR_9.31>\n<\\champ>\n<champ nom = OBR_9.32>\n<\\champ>\n" +
				"<champ nom = OBR_9.33>\n<champ nom = OBR_9.33.1>\n" +
				"VBIO\n<\\champ>\n<\\champ>\n<\\ligne>\n<body nom = OBX>\n<ligne nom = OBX>\n" +
				"<champ nom = OBX_10.2>\n1\n<\\champ>\n<champ nom = OBX_10.3>\n" +
				"NM\n<\\champ>\n<champ nom = OBX_10.4>\n<champ nom = OBX_10.4.1>\n" +
				"OT1\n<\\champ>\n<champ nom = OBX_10.4.2>\nTGO ADVIA\n<\\champ>\n" +
				"<champ nom = OBX_10.4.3>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBX_10.5>\n" +
				"<\\champ>\n<champ nom = OBX_10.6>\n" +
				"16\n<\\champ>\n<champ nom = OBX_10.7>\nUI/l\n<\\champ>\n<champ nom = OBX_10.8>\n" +
				"10 - 40\n<\\champ>\n<champ nom = OBX_10.9>\nN\n<\\champ>\n<champ nom = OBX_10.10>\n" +
				"<\\champ>\n<champ nom = OBX_10.11>\n<\\champ>\n<champ nom = OBX_10.12>\n" +
				"F\n<\\champ>\n<champ nom = OBX_10.13>\n<\\champ>\n<champ nom = OBX_10.14>\n" +
				"<\\champ>\n<champ nom = OBX_10.15>\n201204281438\n<\\champ>\n" +
				"<champ nom = OBX_10.16>\n<champ nom = OBX_10.16.1>\nBIOCH\n<\\champ>\n" +
				"<champ nom = OBX_10.16.2>\n80\n<\\champ>\n<champ nom = OBX_10.16.3>\n" +
				"TGO1\n<\\champ>\n<champ nom = OBX_10.16.4>\n388\n<\\champ>\n<champ nom = OBX_10.16.5>\n" +
				"0\n<\\champ>\n<champ nom = OBX_10.16.6>\nP\n<\\champ>\n<\\champ>\n" +
				"<\\ligne>\n<ligne nom = C>\n<champ nom = C_12.2>\n1\n<\\champ>\n" +
				"<champ nom = C_12.3>\nL\n<\\champ>\n<champ nom = C_12.4>\nAnemie macrocytaire\n" +
				"<\\champ>\n<\\ligne>\n<\\body>\n<body nom = OBX>\n<ligne nom = OBX>\n" +
				"<champ nom = OBX_10.2>\n2\n<\\champ>\n<champ nom = OBX_10.3>\n" +
				"NM\n<\\champ>\n<champ nom = OBX_10.4>\n<champ nom = OBX_10.4.1>\n" +
				"HT\n<\\champ>\n<champ nom = OBX_10.4.2>\n  Hematocrite\n<\\champ>\n" +
				"<champ nom = OBX_10.4.3>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBX_10.5>\n" +
				"<\\champ>\n<champ nom = OBX_10.6>\n" +
				"38.2\n<\\champ>\n<champ nom = OBX_10.7>\n%\n<\\champ>\n<champ nom = OBX_10.8>\n" +
				"35 - 48\n<\\champ>\n<champ nom = OBX_10.9>\nN\n<\\champ>\n<champ nom = OBX_10.10>" +
				"\n<\\champ>\n<champ nom = OBX_10.11>\n<\\champ>\n<champ nom = OBX_10.12>\n" +
				"F\n<\\champ>\n<champ nom = OBX_10.13>\n<\\champ>\n<champ nom = OBX_10.14>\n" +
				"<\\champ>\n<champ nom = OBX_10.15>\n201204281504\n<\\champ>\n" +
				"<champ nom = OBX_10.16>\n<champ nom = OBX_10.16.1>\nHEMAT\n<\\champ>\n" +
				"<champ nom = OBX_10.16.2>\n20\n<\\champ>\n<champ nom = OBX_10.16.3>\n" +
				"NFG\n<\\champ>\n<champ nom = OBX_10.16.4>\n15\n<\\champ>\n<champ nom = OBX_10.16.5>\n" +
				"2\n<\\champ>\n<champ nom = OBX_10.16.6>\nP\n<\\champ>\n<\\champ>\n" +
				"<\\ligne>\n<\\body>\n<body nom = OBX>\n<ligne nom = OBX>\n" +
				"<champ nom = OBX_10.2>\n3\n<\\champ>\n<champ nom = OBX_10.3>\nFIC\n<\\champ>\n" +
				"<champ nom = OBX_10.4>\n<champ nom = OBX_10.4.1>\nTEXTE\n<\\champ>\n<champ nom = OBX_10.4.2>\n" +
				"<\\champ>\n<champ nom = OBX_10.4.3>\nL\n<\\champ>\n<\\champ>\n<champ nom = OBX_10.5>\n" +
				"<\\champ>\n<champ nom = OBX_10.6>\n<champ nom = OBX_10.6.1>\nGALAXIE\n<\\champ>\n<champ nom = OBX_10.6.2>\n" +
				"AL213202.j1\n<\\champ>\n<champ nom = OBX_10.6.3>\nTXT\n<\\champ>\n<\\champ>\n" +
				"<\\ligne>\n<\\body>\n<\\body>\n<\\body>\n<ligne nom = L>\n<champ nom = L_14.2>\n" +
				"1\n<\\champ>\n<\\ligne>\n<\\message>\n",
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
		
		// Crï¿½ation de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859_1"));
		
		// Récupàre ce qui est écrit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractï¿½res
		parser.delimiters();
		parser.nm_sized_optionnal("SimpleExample", 15);

		// Tests des rï¿½sultats
		assertEquals("Erreur de resultat de parsing",
				"<champ nom = delimiteurs>\n" +
				"|~^\\&\n" +
				"<\\champ>\n" +
				"<champ nom = SimpleExample>\n" +
				"-1.60\n" +
				"<\\champ>\n",
				baos.toString());	
		assertTrue(parser.getNumberOfSyntaxErrors() == 0);
	}
	
	/**
	 * SimpleExample la possibilitï¿½ qu'il y ait un segment 9.3 avec :
	 * DELIMITER1 (vide) DELIMITER2 (vide) DELIMITER1
	 * @throws IOException 
	 * @throws RecognitionException 
	 */
	@Test
	public void testSgt_cm_9_3_Case_1() throws IOException, RecognitionException {
		// Chaine de caractï¿½res ï¿½ tester
		String testString = "H|~^\\&toto~";
		
		// Crï¿½ation de la source de tokens
		HPRIMSTokenSource tks = new HPRIMSTokenSource(
				new HPRIMSInputStreamReader(
						new ByteArrayInputStream(testString.getBytes()), "ISO8859_1"));
		
		// Rï¿½cupï¿½re ce qui est ï¿½crit pas le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractï¿½res
		parser.delimiters();
		parser.spec_sized_9_3("OBR_9.3", 23);

		// Tests des rï¿½sultats
		assertEquals("Erreur de resultat de parsing",
				"<champ nom = delimiteurs>\n" +
				"|~^\\&\n" +
				"<\\champ>\n" +
				"<champ nom = OBR_9.3>\n" +
				"<champ nom = OBR_9.3.1>\n" +
				"toto\n" +
				"<\\champ>\n" +
				"<champ nom = OBR_9.3.2>\n" +
				"<\\champ>\n" +
				"<\\champ>\n",
				baos.toString());	
		assertTrue(parser.getNumberOfSyntaxErrors() == 0);
	}
	
	/**
	 * SimpleExample la rï¿½action devant une erreur de matchRegexp
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
		
		// Parsing de la chaine de caractères
		parser.delimiters();
		parser.st_sized_optionnal("SimpleExample", 2);
	}

}
