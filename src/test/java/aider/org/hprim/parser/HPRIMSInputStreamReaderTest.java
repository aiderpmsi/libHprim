/**
 * 
 */
package aider.org.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.aider.hprim.parser.HPRIMSInputStreamReader;
import org.junit.Test;

/**
 * @author delabre
 *
 */
public class HPRIMSInputStreamReaderTest {

	/**
	 * SimpleExample method for {@link org.aider.hprim.parser.HPRIMSInputStreamReader#read()}.
	 * @throws IOException 
	 */
	@Test
	public void testRead() throws IOException {
		// === SimpleExample 1 ===
		ByteArrayInputStream test1 = new ByteArrayInputStream(new byte[]{'L', 'i', 'g', ',', 'n', 'e', '1', '\r',
				'\n', '\t', 'L', 'i', 'g', 'n', 'e', '2', '\r', '\n', '\n', '\t'});
		
		// SimpleExample de la cr�ation d'un flux en UTF-8 (NB, les flux HPRIM devraient �tre en ASCII
		HPRIMSInputStreamReader ins1 = new HPRIMSInputStreamReader(test1, "UTF-8");

		// test lecture initial
		assertEquals('L', ins1.read());
		
		// === SimpleExample 2 ===
		ByteArrayInputStream test2 = new ByteArrayInputStream(new byte[]{'L'});
		
		// SimpleExample de la cr�ation d'un flux en UTF-8 (NB, les flux HPRIM devraient �tre en ASCII
		HPRIMSInputStreamReader ins2 = new HPRIMSInputStreamReader(test2, "ISO8859_1");

		// test lecture initial
		assertEquals('L', ins2.read());
		// test de lecture fin de flux
		assertEquals(-1, ins2.read());

	}
}
