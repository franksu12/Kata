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
}
