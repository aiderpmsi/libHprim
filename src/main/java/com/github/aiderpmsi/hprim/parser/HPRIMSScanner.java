package com.github.aiderpmsi.hprim.parser;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Hashtable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe avec des facilitateurs de lecture pour HPRIMSTokenSource
 * @author delabre
 * @version $Revision: 1022 $
 */
public class HPRIMSScanner<T> implements Closeable {

	public class MatcherType {
		public T type;
		public Matcher matcher;
	}
	
	public class PatternType {
		public T type;
		public Pattern pattern;
	}

	/**
	 * Logger Log4J
	 */
	private static final Logger logger = Logger.getLogger(HPRIMSScanner.class.getCanonicalName());

	private CharBuffer charBuffer = CharBuffer.allocate(0);
	
	private static final int BUFFER_SIZE = 1024;
	
	/**
	 * Garde en mémoire le numéro de ligne
	 */
	private int lineNumber = 1;
	
	/**
	 * Garde en mémoire le numéro de caractère
	 */
	private int charNumberInLine = 0;
	
	/**
	 * Reader utilisé
	 */
	private Reader reader = null;
	
	/**
	 * Liste des patterns à appliquer
	 */
	private List<PatternType> patterns = null;
	
	/**
	 * Constructino à partir d'un inputstream. NB : hprim encode en ISO8859_1
	 * @param input
	 * @throws IOException
	 */
	public HPRIMSScanner(InputStream input)
			throws IOException {
		reader = new InputStreamReader(input, "ISO8859_1");
	}

	/**
	 * Constrution avec un encoding. attention, hprim ne devrait encoder qu'en ISO8859_1
	 * @param input Flux d'entrée
	 * @param encoding (NB : hprim encode en ISO)
	 */
	public HPRIMSScanner(InputStream input, String encoding)
			throws IOException {
		reader = new InputStreamReader(input, encoding);
	}

	/**
	 * Construction à partir d'un reader. Attention, ce reader ne sera pas détruit par cette classe
	 * @param input Flux d'entrée
	 */
	public HPRIMSScanner(Reader reader)
			throws IOException {
		this.reader = reader;
	}

	/**
	 * Définit les patterns applicables à 
	 * @param patterns
	 */
	public void setPatterns(List<PatternType> patterns) {
		this.patterns = patterns;
	}
	
	/**
	 * Récupère le numéro de ligne
	 * @return numéro de ligne
	 */
	public int getLineNumber() {
		return lineNumber;
	}

	/**
	 * Récupère le numéro de caractère
	 * @return
	 */
	public int getCharNumberInLine() {
		return charNumberInLine;
	}

	public int fillBuffer() throws IOException {
		CharBuffer buffer = CharBuffer.allocate(BUFFER_SIZE);
		int readed = reader.read(charBuffer);
		if (readed == -1)
			return -1;
		else {
			charBuffer.append(buffer, 0, readed);
			return readed;
		}
	}
	
	public MatcherType tryPatterns() {
		if (patterns == null || patterns.size() == 0)
			throw new IllegalArgumentException("Pas de pattern défini");
		
		// Donnée à retourner
		MatcherType matcherType = null;
		
		while (matcherType == null) {
			for (PatternType pattern : patterns) {
				Matcher m = pattern.pattern.matcher(charBuffer.toString());
				if (m.matches()) {
					matcherType = new MatcherType();
					matcherType.type = pattern.type;
					matcherType.matcher = m;
					charBuffer.
					return matcherType;
				}
			}
			if (fillBuffer() == -1)
				return null;
		}
		
		
	}
	
	@Override
	public void close() throws IOException {
		reader.close();
	}
}
