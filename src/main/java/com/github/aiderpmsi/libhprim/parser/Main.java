package com.github.aiderpmsi.libhprim.parser;

import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.xml.sax.ContentHandler;

import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsLexer;
import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsParser;
import com.github.aiderpmsi.libhprim.parser.examples.ContentHandlerExample;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ANTLRInputStream input = new ANTLRInputStream(
				"MSH|~^\\&|COUCOU|RORO|RRO^CADO|TT|O\r" +
				"A|\r" +
				"A|R\r" +
				"A|U|EE|TT|ZZ|PP|AQ|H2.1\r" +
				"OBR|HELLP");
		HprimsLexer lex = new HprimsLexer(input);
		lex.setStrict(false);
		lex.findDelimiters();
		CommonTokenStream cs = new CommonTokenStream(lex);
		HprimsParser pars = new HprimsParser(cs);
		ContentHandler ch = new ContentHandlerExample(new PrintWriter(System.out)); 
		pars.setContentHandler(ch);
		
		pars.hprim();

		ANTLRInputStream input2 = new ANTLRInputStream(
				"MSH|~^\\&|COUCOU|RORO|RRO|TT|ORU|EE|TT|ZZ|PP|AQ|H2.1\r" +
				"OBR|HELLP");
		HprimsLexer lex2 = new HprimsLexer(input2);
		lex2.setStrict(false);
		lex2.findDelimiters();
		
		Token currentToken;
		while (true) {
			currentToken = lex2.nextToken();
			System.out.println(currentToken.toString());
			if (currentToken.getType() == HprimsLexer.EOF)
				break;
		}
	}

}
