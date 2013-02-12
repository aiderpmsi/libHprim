package aider.org.hprim.parser;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Classe avec des facilitateurs de lecture pour HPRIMSTokenSource
 * @author delabre
 * @version $Revision: 1022 $
 */
public class HPRIMSInputStreamReader extends InputStreamReader {

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
	 * Surcharge du contructeur
	 * @param input
	 * @throws IOException
	 */
	public HPRIMSInputStreamReader(InputStream input)
			throws IOException {
		super(input);
	}

	/**
	 * Redirection du constructeur
	 * @param input Flux d'entrée
	 * @param encoding (NB : hprim encode en ISO)
	 */
	public HPRIMSInputStreamReader(InputStream input, String encoding)
			throws IOException {
		super(input, encoding);
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
	@Override
	public int read(char[] charBuffer, int offset, int length) throws IOException {
		// Lecture du flux
		int charsread = super.read(charBuffer, offset, length);
		
		// On parse ce flux pour mettre à jour charNumber,
		// lineNumber et stateReader.
		for (int i = 0 ; i < charsread ; i++)
			processState(charBuffer[i + offset]);
		
		return charsread;
	}
	
	/**
	 * Lit le flux en remplissant simplement un buffer
	 */
	@Override
	public int read(char[] charBuffer) throws IOException {
		return this.read(charBuffer, 0, charBuffer.length);
	}

	/**
	 * Lit un seul caractère dans le flux
	 */
	@Override
	public int read() throws IOException {
		
		// Lecture du flux
		int charread = super.read();

		if (charread != -1)
			processState((char) charread);
		else
			logger.log(Level.FINEST, "Fin de stream");
		
		return charread;
	}

	/**
	 * Prend un caractèe et modifie l'état du lecteur en fonction
	 * @param character
	 */
	private void processState(char character) {
		if (stateReader == StateReader.STD_CHAR) {
			if (character == '\r')
				// CR, on change l'�tat du reader
				stateReader = StateReader.POST_CR;
			charNumber++;
		} else {
			// On est apr�s un CR
			Matcher m = patternPrintable.matcher(Character.toString(character));
			if (m.matches())
				// On a un caract�re non imprimable
				charNumber++;
			else {
				// On a de nouveau un caract�re imprimable
				stateReader = StateReader.STD_CHAR;
				// reset charNumber et mise � jour LineNumber
				charNumber = 0;
				lineNumber++;
			}
		}
	}
}
