package com.github.aiderpmsi.libhprim.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsLexer;
import com.github.aiderpmsi.libhprim.parser.antlr4.HprimsParser;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ANTLRInputStream input = new ANTLRInputStream("H|~^\\&|COUCOU\r\nA|CACONTINUE|");
		HprimsLexer lex = new HprimsLexer(input);
		CommonTokenStream cs = new CommonTokenStream(lex);
		HprimsParser pars = new HprimsParser(cs);

		pars.line_h();
	}

}
