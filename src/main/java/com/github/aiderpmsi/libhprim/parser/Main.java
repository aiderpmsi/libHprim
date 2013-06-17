package com.github.aiderpmsi.libhprim.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;

import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsLexer;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ANTLRInputStream input = new ANTLRInputStream("H|~^\\&|COUCOU\r\n");
		HprimsLexer lex = new HprimsLexer(input);
		
		Token currentToken;
		while (true) {
			currentToken = lex.nextToken();
			System.out.println(currentToken.toString());
			if (currentToken.getType() == HprimsLexer.EOF)
				break;
		}
	}

}
