package com.github.aiderpmsi.libhprim.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsLexer;
import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsParser;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ANTLRInputStream input = new ANTLRInputStream("H|~^\\&|COUCOU\r\nA|RORO|");
		HprimsLexer lex = new HprimsLexer(input);
		CommonTokenStream cs = new CommonTokenStream(lex);
		HprimsParser pars = new HprimsParser(cs);

		pars.line_h();

		ANTLRInputStream input2 = new ANTLRInputStream("H|~^\\&|COUCOU\r\nA|RORO|");
		HprimsLexer lex2 = new HprimsLexer(input2);
		
		Token currentToken;
		while (true) {
			currentToken = lex2.nextToken();
			System.out.println(currentToken.toString());
			if (currentToken.getType() == HprimsLexer.EOF)
				break;
		}
	}

}
