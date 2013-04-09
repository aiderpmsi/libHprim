package com.github.aiderpmsi.hprim.parser;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.github.aiderpmsi.hprim.parser.HPRIMSDelimiters;

public class HPRIMSDelimitersTest {

	@Test
	public void testSetGetDelimitersTrue() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertArrayEquals(toTest, testdel.getDelimiters());
	}

	@Test
	public void testSetGetDelimitersFalse() {
		char[] toTest = new char[]{'a', 'b', 'b', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		boolean error = false;
		try {
			testdel.setDelimiters(toTest);
		} catch (IOException e) {
			error = true;
		}
		assertTrue(error);
	}

	@Test
	public void testGetDelimiter1() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertEquals('a', testdel.getDelimiter1());
	}

	@Test
	public void testGetDelimiter2() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertEquals('b', testdel.getDelimiter2());
	}

	@Test
	public void testGetDelimiter3() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertEquals('e', testdel.getDelimiter3());
	}

	@Test
	public void testGetRepet() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertEquals('c', testdel.getRepet());
	}

	@Test
	public void testGetEchap() throws IOException {
		char[] toTest = new char[]{'a', 'b', 'c', 'd', 'e'}; 
		HPRIMSDelimiters testdel = new HPRIMSDelimiters();
		testdel.setDelimiters(toTest);
		assertEquals('d', testdel.getEchap());
	}

}
