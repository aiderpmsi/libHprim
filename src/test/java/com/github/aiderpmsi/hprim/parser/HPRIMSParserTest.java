package com.github.aiderpmsi.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;
import org.xml.sax.SAXException;

import com.github.aiderpmsi.hprim.parser.HPRIMSInputStreamReader;
import com.github.aiderpmsi.hprim.parser.HPRIMSTokenSource;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;
import com.github.aiderpmsi.hprim.parser.xml.XmlContentHandler;
import org.custommonkey.xmlunit.*;

public class HPRIMSParserTest {

	@Test
	public void testHprim() throws IOException, SAXException, RecognitionException {
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
						new ByteArrayInputStream(testString.getBytes("ISO8859-1")), "ISO8859-1"));
		
		// Récupère ce qui est écrit par le collecteur
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		// Initialisation du parseur
		HPRIMSParser parser = new HPRIMSParser(
				new CommonTokenStream(tks),
				new XmlContentHandler(new PrintWriter(baos)));
		
		// Parsing de la chaine de caractères
		parser.hprim(3);

		// Tests des résultats
		String controlXML =
			"<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><HPRIM.ORU.2_1><H><H.1>H</H.1><H.2>|~^\\&amp;</H.2>" +
			"<H.3>Test1.HPR</H.3><H.4></H.4><H.5><H.5.1>PO</H.5.1><H.5.2>LABM</H.5.2></H.5><H.6><H.6.1>" +
			"</H.6.1></H.6><H.7>ORU</H.7><H.8><H.8.1></H.8.1></H.8><H.9></H.9><H.10><H.10.1>HPRIM</H.10.1>" +
			"<H.10.2>TESTE</H.10.2></H.10><H.11></H.11><H.12>P</H.12><H.13><H.13.1>H2.1</H.13.1><H.13.2>C</H.13.2>" +
			"</H.13><H.14>201204292059</H.14></H><P><P.1>P</P.1><P.2>1</P.2><P.3><P.3.1>398</P.3.1></P.3><P.4>B1042100871</P.4>" +
			"<P.5></P.5><P.6><P.6.1>GAULLE</P.6.1><P.6.2>MARECHAL</P.6.2></P.6><P.7>PIT</P.7><P.8>19370325</P.8><P.9>F</P.9>" +
			"<P.10></P.10><P.11><P.11.1>28 RUE DE LA PAIX</P.11.1><P.11.2></P.11.2><P.11.3>PARIS</P.11.3><P.11.4></P.11.4>" +
			"<P.11.5>75000</P.11.5></P.11><P.12></P.12><P.13><P.13.1></P.13.1></P.13><P.14><P.14.1></P.14.1></P.14><P.15>" +
			"</P.15><P.16></P.16><P.17></P.17><P.18></P.18><P.19><P.19.1></P.19.1></P.19><P.20></P.20><P.21></P.21><P.22>" +
			"</P.22><P.23></P.23><P.24></P.24><P.25></P.25><P.26><P.26.1></P.26.1><P.26.2></P.26.2><P.26.3>TEST</P.26.3>" +
			"</P.26></P><OBR><OBR.1>OBR</OBR.1><OBR.2>1</OBR.2><OBR.3><OBR.3.1>idechantillo</OBR.3.1><OBR.3.2></OBR.3.2></OBR.3>" +
			"<OBR.4><OBR.4.1></OBR.4.1><OBR.4.2>20428E9575</OBR.4.2></OBR.4><OBR.5><OBR.5.1>TGO1</OBR.5.1><OBR.5.2>TGO ADVI</OBR.5.2>" +
			"<OBR.5.3>L</OBR.5.3></OBR.5><OBR.5><OBR.5.1>TGP1</OBR.5.1><OBR.5.2>TGP ADVI</OBR.5.2><OBR.5.3>L</OBR.5.3>" +
			"</OBR.5><OBR.5><OBR.5.1>LDH1</OBR.5.1><OBR.5.2>LDH ADVI</OBR.5.2><OBR.5.3>L</OBR.5.3></OBR.5><OBR.5>" +
			"<OBR.5.1>CK1</OBR.5.1><OBR.5.2>CK ADVIA</OBR.5.2><OBR.5.3>L</OBR.5.3></OBR.5><OBR.5><OBR.5.1>NFG</OBR.5.1>" +
			"<OBR.5.2>NF</OBR.5.2><OBR.5.3>L</OBR.5.3></OBR.5><OBR.5><OBR.5.1>NFF</OBR.5.1><OBR.5.2>NF</OBR.5.2><OBR.5.3>L</OBR.5.3>" +
			"</OBR.5><OBR.5><OBR.5.1>NF100</OBR.5.1><OBR.5.2>100%</OBR.5.2><OBR.5.3>L</OBR.5.3></OBR.5><OBR.5><OBR.5.1>PLA</OBR.5.1>" +
			"<OBR.5.2>PLA</OBR.5.2><OBR.5.3>L</OBR.5.3></OBR.5><OBR.5><OBR.5.1>TROPV</OBR.5.1><OBR.5.2>TROPV</OBR.5.2><OBR.5.3>L</OBR.5.3>" +
			"</OBR.5><OBR.6>S</OBR.6><OBR.7></OBR.7><OBR.8><OBR.8.1>201204281412</OBR.8.1><OBR.8.2>20120428</OBR.8.2></OBR.8><OBR.9>" +
			"</OBR.9><OBR.10></OBR.10><OBR.11><OBR.11.1></OBR.11.1></OBR.11><OBR.12>N</OBR.12><OBR.13><OBR.13.1></OBR.13.1></OBR.13>" +
			"<OBR.14></OBR.14><OBR.15>201204281413</OBR.15><OBR.16><OBR.16.1><OBR.16.1.1></OBR.16.1.1></OBR.16.1></OBR.16><OBR.17>" +
			"<OBR.17.1>PILO</OBR.17.1><OBR.17.2>DR PITO OLIV</OBR.17.2><OBR.17.3>L</OBR.17.3><OBR.17.4>TESTHP</OBR.17.4>" +
			"<OBR.17.5>Clinique HP</OBR.17.5><OBR.17.6>L</OBR.17.6></OBR.17><OBR.18><OBR.18.1>0468638395</OBR.18.1></OBR.18><OBR.19>" +
			"</OBR.19><OBR.20></OBR.20><OBR.21></OBR.21><OBR.22></OBR.22><OBR.23></OBR.23><OBR.24></OBR.24><OBR.25><OBR.25.1>" +
			"</OBR.25.1></OBR.25><OBR.26>F</OBR.26><OBR.27></OBR.27><OBR.28></OBR.28><OBR.29><OBR.29.1></OBR.29.1></OBR.29><OBR.30>" +
			"<OBR.30.1></OBR.30.1></OBR.30><OBR.31></OBR.31><OBR.32></OBR.32><OBR.33><OBR.33.1>VBIO</OBR.33.1></OBR.33></OBR>" +
			"<OBX><OBX.1>OBX</OBX.1><OBX.2>1</OBX.2><OBX.3>NM</OBX.3><OBX.4><OBX.4.1>OT1</OBX.4.1><OBX.4.2>TGO ADVIA</OBX.4.2>" +
			"<OBX.4.3>L</OBX.4.3></OBX.4><OBX.5></OBX.5><OBX.6>16</OBX.6><OBX.7>UI/l</OBX.7><OBX.8>10 - 40</OBX.8><OBX.9>N</OBX.9>" +
			"<OBX.10></OBX.10><OBX.11></OBX.11><OBX.12>F</OBX.12><OBX.13></OBX.13><OBX.14></OBX.14><OBX.15>201204281438</OBX.15>" +
			"<OBX.16><OBX.16.1>BIOCH</OBX.16.1><OBX.16.2>80</OBX.16.2><OBX.16.3>TGO1</OBX.16.3><OBX.16.4>388</OBX.16.4>" +
			"<OBX.16.5>0</OBX.16.5><OBX.16.6>P</OBX.16.6></OBX.16></OBX><C><C.2>1</C.2><C.3>L</C.3><C.4>Anemie macrocytaire</C.4>" +
			"</C><OBX><OBX.1>OBX</OBX.1><OBX.2>2</OBX.2><OBX.3>NM</OBX.3><OBX.4><OBX.4.1>HT</OBX.4.1><OBX.4.2>  Hematocrite</OBX.4.2>" +
			"<OBX.4.3>L</OBX.4.3></OBX.4><OBX.5></OBX.5><OBX.6>38.2</OBX.6><OBX.7>%</OBX.7><OBX.8>35 - 48</OBX.8><OBX.9>N</OBX.9>" +
			"<OBX.10></OBX.10><OBX.11></OBX.11><OBX.12>F</OBX.12><OBX.13></OBX.13><OBX.14></OBX.14><OBX.15>201204281504</OBX.15><OBX.16>" +
			"<OBX.16.1>HEMAT</OBX.16.1><OBX.16.2>20</OBX.16.2><OBX.16.3>NFG</OBX.16.3><OBX.16.4>15</OBX.16.4><OBX.16.5>2</OBX.16.5>" +
			"<OBX.16.6>P</OBX.16.6></OBX.16></OBX><OBX><OBX.1>OBX</OBX.1><OBX.2>3</OBX.2><OBX.3>FIC</OBX.3><OBX.4>" +
			"<OBX.4.1>TEXTE</OBX.4.1><OBX.4.2></OBX.4.2><OBX.4.3>L</OBX.4.3></OBX.4><OBX.5></OBX.5><OBX.6><OBX.6.1>GALAXIE</OBX.6.1>" +
			"<OBX.6.2>AL213202.j1</OBX.6.2><OBX.6.3>TXT</OBX.6.3></OBX.6></OBX><L><L.2>1</L.2></L></HPRIM.ORU.2_1>";
		Diff myDiff = new Diff(controlXML, baos.toString());

		assertTrue("Similar output " + myDiff, myDiff.similar());	
	}

}
