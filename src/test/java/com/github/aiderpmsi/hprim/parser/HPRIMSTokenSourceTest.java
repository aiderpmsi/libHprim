package com.github.aiderpmsi.hprim.parser;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import org.junit.Test;

import com.github.aiderpmsi.hprim.parser.HPRIMSInputStreamReader;
import com.github.aiderpmsi.hprim.parser.HPRIMSTokenSource;
import com.github.aiderpmsi.hprim.parser.antlr.HPRIMSParser;


public class HPRIMSTokenSourceTest {

	@Test
	public void testGetCharTokenClass() throws IOException {
		String tt1 = ".";
		HPRIMSInputStreamReader isr = new HPRIMSInputStreamReader(new ByteArrayInputStream(tt1.getBytes()));
		HPRIMSTokenSource tok = new HPRIMSTokenSource(isr);
		assertEquals(HPRIMSParser.POINT, tok.getCharTokenClass('.'));
	}

}
