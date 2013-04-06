package aider.org.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.aider.hprim.parser.HPRIMSInputStreamReader;
import org.aider.hprim.parser.HPRIMSTokenSource;
import org.aider.hprim.parser.antlr.HPRIMSParser;
import org.junit.Test;


public class HPRIMSTokenSourceTest {

	@Test
	public void testGetCharTokenClass() throws IOException {
		String tt1 = ".";
		HPRIMSInputStreamReader isr = new HPRIMSInputStreamReader(new ByteArrayInputStream(tt1.getBytes()));
		HPRIMSTokenSource tok = new HPRIMSTokenSource(isr);
		assertEquals(HPRIMSParser.POINT, tok.getCharTokenClass('.'));
	}

}
