package com.github.aiderpmsi.libhprim.parser;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.LexerNoViableAltException;


/**
 * Creates the base code for Hprims Lexer.
 * 
 * @author jpc
 *
 */
public abstract class AbstractHprimsLexer
    extends Lexer {

	/**
	 * Defines if we use strict header (H with delimiters), or any header ([A-Z]* followed by delimiters)
	 */
	private boolean strict = true;
	
	/**
	 * Delimiters (order in array : Delim 1 / Delim 2 / Repet / Esc / Delim 3
	 */
	protected char[] delimiters = new char[]{'|', '~', '^', '\\', '&'};
	
	/**
     * Default constructor for the lexer, when you do not yet know what
     * the character stream to be provided is.
     */
    public AbstractHprimsLexer() {
    }

    /**
     * Internal constructor for ANTLR - do not use.
     *
     * @param input The character stream we are going to lex
     * @param state The shared state object, shared between all lexer comonents
     */
    public AbstractHprimsLexer(CharStream input) {
        super(input);
        findDelimiters();
    }
    
    /**
     * Returns if the lexer is strict
     * @return
     */
    public boolean isStrict() {
		return strict;
	}

    /**
     * Sets if the lexer is strict
     * @param strict
     */
	public void setStrict(boolean strict) {
		this.strict = strict;
	}

	/**
     * Intercepts calls to setInputStream in order to find delimiters
     * @param input
     */
    public void setInputStream(IntStream input) {
    	super.setInputStream(input);
    	findDelimiters();
    }

    /**
     * Finds and set the delimiters from the head of the file.
     */
    private void findDelimiters() {
    	// gets the stream we are reading
    	CharStream input = getInputStream();
    	// stores the character we are reading
    	int i = 1;
    	// stores the head of the file (H or anything else depending on strict)
    	StringBuilder head = new StringBuilder();
    	// stores the caracter currently readed
    	int readed;
    	
    	// Get the line header (if possible)
    	while ((readed = input.LA(i)) != -1) {
    		i++;
    		if (readed >= 'A' && readed <= 'Z')
    			head.append((char)readed);
    		else
    			break;
    		// If we are in strict mode, just escape after first char
    		if (strict)
    			break;
    			
    	}
    	   	
    	// Now, get 5 chars more (delimiters) if possible
    	for (int j = 0 ; j < 5 ; j++) {
    		if ((readed = input.LA(i + j)) == -1)
    			break;
    		else
    			head.append((char)readed);
    	}
    	
    	// Check what is in head : use a regex for that
        Pattern p;
        if (strict)
        	p = Pattern.compile("^(H)((?!\\1)[^\\r\\n])((?!\\1)(?!\\2)[^\\r\\n])((?!\\1)(?!\\2)(?!\\3)[^\\r\\n])" +
        			"((?!\\1)(?!\\2)(?!\\3)(?!\\4)[^\\r\\n])((?!\\1)(?!\\2)(?!\\3)(?!\\4)(?!\\5)[^\\r\\n])(\\2)$");
        else
        	p = Pattern.compile("^([A-Z]*)([^A-Z])((?!\\2)[^A-Z])((?!\\2)(?!\\3)[^A-Z])" +
        			"((?!\\2)(?!\\3)(?!\\4)[^A-Z])((?!\\2)(?!\\3)(?!\\4)(?!\\5)[^A-Z])(\\2)$");

        // Check if it matches
        Matcher m = p.matcher(head);
        if (m.matches()) {
        	// 1 - Délimiter 1
        	delimiters[0] = m.group(2).charAt(0);
        	// 2 - Délimiter 2
        	delimiters[1] = m.group(3).charAt(0);
        	// 3 - Répétitor
        	delimiters[2] = m.group(4).charAt(0);
        	// 4 Escape char
        	delimiters[3] = m.group(5).charAt(0);
        	// 4 - Délimiter 3
        	delimiters[5] = m.group(6).charAt(0);
        } else {
        	LexerNoViableAltException e = new LexerNoViableAltException(this, input, getCharIndex(), null);
        	notifyListeners(e);
        	recover(e);
        }
    }
    
    /***
     * Finds if the next char is this char
     * @param character
     * @return
     */
    protected boolean tryToken(char character) {
    	if (getInputStream().LA(1) == character) {
    		getInputStream().seek(getInputStream().index());
    		return true;
    	} else {
    		return false;
    	}
    		
    }
    
}

