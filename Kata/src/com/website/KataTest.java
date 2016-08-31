package com.website;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class KataTest {
	
	Kata romanNumeral;
	
	@Before
	public void setUp() {
		romanNumeral = new Kata();
	}
	
	@Test
	public void toRoman_Enter1ReturnsI() {
		assertEquals("I", romanNumeral.toRoman(1));
	}

	@Test
	public void toRoman_Enter3ReturnsIII() {
		assertEquals("III", romanNumeral.toRoman(3));
	}
	
	@Test
	public void toRoman_Enter4ReturnsIV() {
		assertEquals("IV", romanNumeral.toRoman(4));
	}
	
	@Test
	public void toRoman_Enter5ReturnsV() {
		assertEquals("V", romanNumeral.toRoman(5));
	}
	
	@Test
	public void toRoman_Enter7ReturnsVII() {
		assertEquals("VII", romanNumeral.toRoman(7));
	}
	
	@Test
	public void toRoman_Enter9ReturnsIX() {
		assertEquals("IX", romanNumeral.toRoman(9));
	}
	
	@Test
	public void toRoman_Enter16ReturnsXVI() {
		assertEquals("XVI", romanNumeral.toRoman(16));
	}
	
	@Test
	public void toRoman_Enter29ReturnsXXIX() {
		assertEquals("XXIX", romanNumeral.toRoman(29));
	}
	
	@Test
	public void toRoman_Enter40ReturnsXL() {
		assertEquals("XL", romanNumeral.toRoman(40));
	}
	
	@Test
	public void toRoman_Enter66ReturnsLXVI() {
		assertEquals("LXVI", romanNumeral.toRoman(66));
	}
	
	@Test
	public void toRoman_Enter99ReturnsXCIX() {
		assertEquals("XCIX", romanNumeral.toRoman(99));
	}
	
	@Test
	public void toRoman_Enter140ReturnsC() {
		assertEquals("CXL", romanNumeral.toRoman(140));
	}
	
}
