package com.github.aiderpmsi.libhprim.parser;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Lexer;


/**
 * Creates the base code for Hprims Lexer.
 * 
 * @author jpc
 *
 */
public abstract class AbstractTLexer
    extends Lexer {

	/**
	 * Defines if we use strict header (H with delimiters), or any header ([A-Z]* followed by delimiters)
	 */
	private boolean strict = true;
	
	/**
     * Default constructor for the lexer, when you do not yet know what
     * the character stream to be provided is.
     */
    public AbstractTLexer(boolean strict) {
    	this.setStrict(strict);  
    }

    /**
     * Internal constructor for ANTLR - do not use.
     *
     * @param input The character stream we are going to lex
     * @param state The shared state object, shared between all lexer comonents
     */
    public AbstractTLexer(CharStream input, boolean strict) {
        super(input);
        this.setStrict(strict);
    }
    
    public boolean isStrict() {
		return strict;
	}

	public void setStrict(boolean strict) {
		this.strict = strict;
	}

	/**
     * Intercepts calls to setInputStream in order to find delimiters
     * @param input
     */
    public void setInputStream(IntStream input) {
    	super.setInputStream(input);
    }

    private void findDelimiters() {
    	// gets the strem we are reading
    	CharStream input = getInputStream();
    	// stores the character we are reading
    	int i = 1;
    	// stores the head of the file (H or anything else depending on strict)
    	StringBuilder head = new StringBuilder();
    	// stores the caracter currently readed
    	int readed;
    	
    	while ((readed = input.LA(i)) != -1) {
    		if (readed >= 'A' && readed <= 'Z')
    			head.append((char)readed);
    		else
    			break;
    		// If we are in strict mode, just escape after first char
    		if (strict)
    			break;
    			
    	}
    	
    	// Now, verify that 

    }
    
}

