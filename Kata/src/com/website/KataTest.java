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
}
