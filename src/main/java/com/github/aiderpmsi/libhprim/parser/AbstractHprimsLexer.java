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
	 * Pattern in order to unescape strings
	 */
	private Pattern unescapePattern;
	
	/**
	 * Indicates if the delimiters for this stream has been found
	 */
	private boolean delimitersFound = false;
	
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
    	delimitersFound = false;
    }

    /**
     * Finds and set the delimiters from the head of the file.
     */
    public void findDelimiters() {
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
    		else {
    			// go back one character ago
    			i--;
    			break;
    		}
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
        			"((?!\\1)(?!\\2)(?!\\3)(?!\\4)[^\\r\\n])((?!\\1)(?!\\2)(?!\\3)(?!\\4)(?!\\5)[^\\r\\n])$");
        else
        	p = Pattern.compile("^([A-Z]*)([^A-Z])((?!\\2)[^A-Z])((?!\\2)(?!\\3)[^A-Z])" +
        			"((?!\\2)(?!\\3)(?!\\4)[^A-Z])((?!\\2)(?!\\3)(?!\\4)(?!\\5)[^A-Z])$");

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
        	delimiters[4] = m.group(6).charAt(0);
        } else {
        	LexerNoViableAltException e = new LexerNoViableAltException(this, input, getCharIndex(), null);
        	notifyListeners(e);
        	recover(e);
        }
        
        // Create the unescape pattern
        StringBuilder unescapePatternString =
        		new StringBuilder().
        		append(Pattern.quote(new String(new char[]{delimiters[3]}))).
        		append("(.)");
        unescapePattern = Pattern.compile(unescapePatternString.toString());
        
        // Delimiters have been found
        delimitersFound = true;
    }
    
    /**
     * Finds if the next char is this char
     * @param character
     * @return
     */
    protected boolean tryToken(char character) {
    	if (!delimitersFound)
    		reportDelimitersNotFound();

    	if (getInputStream().LA(1) == character) {
    		return seekNextChar();
    	} else {
    		return false;
    	}		
    }
    
    /**
     * Finds if the next char is a new line
     * @return
     */
    protected boolean isNewLine() {
    	switch (getInputStream().LA(1)) {
    	case '\r':
    		return seekNextChar();
    	case '\n':
    		if (!strict) {
    			return seekNextChar();
    		}
    	default:
    		return false;
    	}
    }
    
    /**
     * Returns if next char is not printable and is not a delimiter
     * @return
     */
    protected boolean isNotPrintable() {
    	if (!delimitersFound)
    		reportDelimitersNotFound();

    	Pattern p = Pattern.compile("^\\p{Print}$");
    	int readed;
    	if ((readed = getInputStream().LA(1)) != -1) {
    		for (int i = 0 ; i < 5 ; i++) {
    			if ((char) readed == delimiters[i])
    				return false;
    		}
    		Matcher m = p.matcher(new String(new char[]{(char)readed}));
    		if (!m.matches()) {
    			return seekNextChar();
    		}
    	}
    	return false;
    }

    /**
     * Returns if next char is printable and is not a delimiter
     * @return
     */
    protected boolean isPrintable() {
    	if (!delimitersFound)
    		reportDelimitersNotFound();
   
    	Pattern p = Pattern.compile("^\\p{Print}$");
    	int readed;
    	if ((readed = getInputStream().LA(1)) != -1) {
    		for (int i = 0 ; i < 5 ; i++) {
    			if ((char) readed == delimiters[i])
    				return false;
    		}
    		Matcher m = p.matcher(new String(new char[]{(char)readed}));
    		if (m.matches()) {
    			return seekNextChar();
    		}
    	}
    	return false;
    }

    /**
     * Consumes one char
     * @return
     */
    private boolean seekNextChar() {
    	getInputStream().seek(getInputStream().index());
    	return true;
    }

    /**
     * Reports error when delimiters have not been set
     */
    private void reportDelimitersNotFound() {
    	LexerNoViableAltException e = new LexerNoViableAltException(this, getInputStream(), getCharIndex(), null);
    	notifyListeners(e);
    	recover(e);
    }
    
    /**
     * Removes the escape chars
     */
    protected String removeEscapes(String origin) {
    	if (!delimitersFound)
    		reportDelimitersNotFound();

    	int lastMatch = 0;
    	StringBuilder dest = new StringBuilder();
    	Matcher matcher = unescapePattern.matcher(origin);
    	
    	// Tries to find the escaped sequence
    	while(matcher.find()) {
    		// copies content between lastMatch ant this match
    		dest.append(origin.substring(lastMatch, matcher.start()));
    		// copies the content of the escaped char
    		dest.append(matcher.group(1));
    		// Upgrade the lastMatch
    		lastMatch = matcher.end();
    	}
    	// Copies the remaining sequence
    	dest.append(origin.substring(lastMatch, origin.length()));
    	
    	return dest.toString();
    }
}

