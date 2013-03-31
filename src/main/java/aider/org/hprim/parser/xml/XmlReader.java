package aider.org.hprim.parser.xml;

import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.PrintWriter;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

import aider.org.hprim.parser.HPRIMSInputStreamReader;
import aider.org.hprim.parser.HPRIMSTokenSource;
import aider.org.hprim.parser.antlr.HPRIMSParser;

/**
 * @author delabre
 *
 */
public class XmlReader extends PipedReader implements Runnable {

	private PrintWriter pipedPrintWriter;
	
	private HPRIMSParser hprimsParser;
	
	private Exception endException = null;
	
	private Thread childThread = null;
	
	private final Object lock = new Object();
	
	private Boolean threadFinished = false; 
		
	public XmlReader(InputStream input) throws IOException {
		// Création de la classe parente
		super();

		// Création du pipedWriter sur lequel on va écrire et de son équivalent
		// PrintWriter permettant d'utiliser les fonctions de formattage avancées
		PipedWriter pipedWriter = new PipedWriter();
		pipedPrintWriter = new PrintWriter(pipedWriter);

		// Association du pipedWriter avec l'objet actuel.
		super.connect(pipedWriter);

		// Création de la source des tokens. Elle est obligatoirement de type ISO 8859 1
		HPRIMSInputStreamReader inputreader = new HPRIMSInputStreamReader(input, "ISO8859_1");
		HPRIMSTokenSource toksce = new HPRIMSTokenSource(inputreader);

		// Création du flux de tokens à partir de la source de tokens
		TokenStream tokenstream = new CommonTokenStream(toksce);
		
		// Création du gestionnaire de contenu de type Xml avec le flux de sortie
		// pipedPrintWriter
		XmlContentHandler contentHandler = new XmlContentHandler(pipedPrintWriter);
		
		// Création du parser de tokens avec le content Handler de XmlContentHandler
		hprimsParser = new HPRIMSParser(tokenstream, contentHandler);

		// Lancement de l'écriture sur le pipedPrintWriter
		childThread = new Thread(this);
		childThread.start();
	}
	
	@Override
	/**
	 * A la fin du flux de lecture, on vérifie s'il y a une
	 * erreur dans le thread d'écriture
	 */
	public int read() throws IOException {
		// récupération de ce qu'il y a à lire
		int toRead = super.read();
		// Si la fin du flux est rencontrée, il faut renvoyer une erreur
		// si la tâche fille a rencontré une erreur
		if (toRead == -1)
			checkChildTask();
		return toRead;
	}
	
	@Override
	/**
	 * A la fin du flux de lecture, on vérifie s'il y a une
	 * erreur dans le thread d'écriture
	 */
	public int read(char[] cbuf, int off, int len) throws IOException {
		// Récupération de ce qu'il y a à lire
		int toRead = super.read(cbuf, off, len);
		// Si la fin du flux est rencontrée, il faut renvoyer une erreur
		// si la tâche fille a rencontré une erreur
		if (toRead == -1)
			checkChildTask();
		return toRead;
	}

	private void checkChildTask() throws IOException {
		synchronized (lock) {
			try {
			if (endException != null)
				throw new IOException(endException);
			} finally {
				endException = null;
			}
		}
	}

	@Override
	/**
	 * Lors de la fermeture de ce flux, il y a 2 solutions :
	 *  - Le processus fils est encore actif, il faut :
	 *    . fermer le flux de sortie
	 *    . attendre que la tâche fille se finisse
	 *  - Le processus fils n'est plus actif, il faut ne rien faire
	 */
	public void close() throws IOException {
		synchronized (lock) {
			if (threadFinished == false) {
				// Le thread enfant fonctionne encore, il faut l'arrêter
				childThread.interrupt();
			}
		}
		// On attend que le thread enfant finisse
		try {
			childThread.join();
		} catch (InterruptedException e) {
			throw new IOException(e);
		}
		// On se ferme
		super.close();
		// On récupère les erreurs existantes si besoin
		checkChildTask();
	}

	@Override
	public void run() {
			// First, parse
			try {
				hprimsParser.hprim();
			} catch (Exception e) {
				synchronized (lock) {
					if (e.getCause() instanceof RecognitionException) {
						endException = (RecognitionException)e.getCause();
					} else
						endException = e;
				}
			} finally {
				// Closes the writer whatever happens
				pipedPrintWriter.close();
				synchronized (lock) {
					threadFinished = true;
				}
			}
	}
	
}
