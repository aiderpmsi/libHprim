package com.github.aiderpmsi.libhprim.parser;

import javax.print.DocFlavor.INPUT_STREAM;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class AbstractHprimsParser extends Parser {

	public AbstractHprimsParser(TokenStream input) {
		super(input);
	}

	/**
	 * Finds if the next char is this char
	 * @param character
	 * @return
	 */
	protected boolean tryToken(String content) {
		if (getInputStream().LT(getInputStream().index()).getText().equals(content)) {getInputStream().
			getInputStream().seek(1);
			return true;
		} else
			return false;
	}
	

}
