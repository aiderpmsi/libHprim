/**
 * 
 */
package aider.org.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.Test;

/**
 * @author delabre
 *
 */
public class HPRIMSInputStreamReaderTest {

	/**
	 * MainExample method for {@link aider.org.hprim.parser.HPRIMSInputStreamReader#read()}.
	 * @throws IOException 
	 */
	@Test
	public void testRead() throws IOException {
		// === MainExample 1 ===
		ByteArrayInputStream test1 = new ByteArrayInputStream(new byte[]{'L', 'i', 'g', ',', 'n', 'e', '1', '\r',
				'\n', '\t', 'L', 'i', 'g', 'n', 'e', '2', '\r', '\n', '\n', '\t'});
		
		// MainExample de la cr�ation d'un flux en UTF-8 (NB, les flux HPRIM devraient �tre en ASCII
		HPRIMSInputStreamReader ins1 = new HPRIMSInputStreamReader(test1, "UTF-8");

		// test lecture initial
		assertEquals('L', ins1.read());
		
		// === MainExample 2 ===
		ByteArrayInputStream test2 = new ByteArrayInputStream(new byte[]{'L'});
		
		// MainExample de la cr�ation d'un flux en UTF-8 (NB, les flux HPRIM devraient �tre en ASCII
		HPRIMSInputStreamReader ins2 = new HPRIMSInputStreamReader(test2, "ISO8859_1");

		// test lecture initial
		assertEquals('L', ins2.read());
		// test de lecture fin de flux
		assertEquals(-1, ins2.read());

	}
}
