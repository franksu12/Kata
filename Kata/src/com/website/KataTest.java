package com.website;

import static org.junit.Assert.*;

import org.junit.Test;

public class KataTest {

	@Test
	public void toRoman_Enter1ReturnsI() {
		Kata romanNumeral = new Kata();
		assertEquals("I", romanNumeral.toRoman(1));
	}

}
