package org.aider.hprim.parser;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe avec des facilitateurs de lecture pour HPRIMSTokenSource
 * @author delabre
 * @version $Revision: 1022 $
 */
public class HPRIMSInputStreamReader implements Closeable, Readable {

	/**
	 * Logger Log4J
	 */
	private static final Logger logger = Logger.getLogger(HPRIMSInputStreamReader.class.getCanonicalName());
	
	/**
	 * Pattern matching précompilée pour reconnaitre les charactères imprimables
	 */
	private static final Pattern patternPrintable = Pattern.compile("\\p{Print}");
	
	/**
	 * Garde en mémoire le numéro de ligne
	 */
	private int lineNumber = 1;
	
	/**
	 * Garde en mémoire le numéro de caractère
	 */
	private int charNumber = 0;
	
	/**
	 * Etat de lecture :
	 * <ul>
	 *  <li>STD_CHAR : caractère avant \r (carriage return)</li>
	 *  <li>POST_CR : caractère après \r (carriage return)</li>
	 * </ul>
	 * @author delabre
	 *
	 */
	public enum StateReader {
		STD_CHAR,
		POST_CR
	}
	
	/**
	 * Garde l'état de la lecture pour ce flux
	 */
	private StateReader stateReader;
	
	/**
	 * Reader utilisé
	 */
	private Reader reader = null;
	
	/**
	 * Indicateur définissant si le reader a été créé par cette classe ou non
	 */
	boolean readerCreated = false;
	
	/**
	 * Constructino à partir d'un inputstream. NB : hprim encode en ISO8859_1
	 * @param input
	 * @throws IOException
	 */
	public HPRIMSInputStreamReader(InputStream input)
			throws IOException {
		reader = new InputStreamReader(input, "ISO8859_1");
		readerCreated = true;
	}

	/**
	 * Constrution avec un encoding. attention, hprim ne devrait encoder qu'en ISO8859_1
	 * @param input Flux d'entrée
	 * @param encoding (NB : hprim encode en ISO)
	 */
	public HPRIMSInputStreamReader(InputStream input, String encoding)
			throws IOException {
		reader = new InputStreamReader(input, "ISO8859_1");
		readerCreated = true;
	}

	/**
	 * Construction à partir d'un reader. Attention, ce reader ne sera pas détruit par cette classe
	 * @param input Flux d'entrée
	 * @param encoding (NB : hprim encode en ISO)
	 */
	public HPRIMSInputStreamReader(Reader reader)
			throws IOException {
		this.reader = reader;
		readerCreated = false;
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
	public int getCharNumber() {
		return charNumber;
	}

	/**
	 * Récupère l'état du reader
	 * @return
	 */
	public StateReader getStateReader() {
		return stateReader;
	}
	
	/**
	 * Remplissage du charBuffer à partir du flux d'entrée. Le nombre de caractères qui a
	 * été effectivement lus est retourné. Si on est à la fin du flux, on retourne -1
	 * @param charBuffer
	 * @return
	 */
	public int read(char[] charBuffer, int offset, int length) throws IOException {
		// Lecture du flux
		int charsread = reader.read(charBuffer, offset, length);
		
		// On parse ce flux pour mettre à jour charNumber,
		// lineNumber et stateReader.
		for (int i = 0 ; i < charsread ; i++)
			processState(charBuffer[i + offset]);
		
		return charsread;
	}
	
	/**
	 * Lit le flux en remplissant simplement un buffer
	 */
	public int read(char[] charBuffer) throws IOException {
		return read(charBuffer, 0, charBuffer.length);
	}

	/**
	 * Ecriture dans un CharBuffer
	 */
	public int read(CharBuffer cb) throws IOException {
		// Récupération de la place restante dans le buffer
		int length = cb.remaining();
		char[] charBuffer = new char[length];
		
		// Lecture des caractères
		int charsread = read(charBuffer, 0, length);
		if (charsread > 0)
			cb.put(charBuffer, 0, charsread);
		return charsread;
	}


	/**
	 * Lit un seul caractère dans le flux
	 */
	public int read() throws IOException {
		
		// Lecture du flux
		int charread = reader.read();

		if (charread != -1)
			processState((char) charread);
		else
			logger.log(Level.FINEST, "Fin de stream");
		
		return charread;
	}

	/**
	 * Prend un caractère et modifie l'état du lecteur en fonction
	 * @param character
	 */
	private void processState(char character) {
		if (stateReader == StateReader.STD_CHAR) {
			if (character == '\r')
				// CR, on change l'état du reader
				stateReader = StateReader.POST_CR;
			charNumber++;
		} else {
			// On est après un CR
			Matcher m = patternPrintable.matcher(Character.toString(character));
			if (m.matches())
				// On a un caractère non imprimable
				charNumber++;
			else {
				// On a de nouveau un caractère imprimable
				stateReader = StateReader.STD_CHAR;
				// reset charNumber et mise à jour LineNumber
				charNumber = 0;
				lineNumber++;
			}
		}
	}

	@Override
	public void close() throws IOException {
		if (reader != null && readerCreated) {
			reader.close();
			reader = null;
		} else {
			reader = null;
		}
	}
}
