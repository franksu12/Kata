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
	
	//Begin tests for Arabic number conversion to Roman numeral
	
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
	
	//End tests for Arabic number conversion to Roman numeral
	
	//Begin tests for Roman numeral conversion to Arabic number
	
	@Test
	public void toArabic_EnterIReturns1() {
		assertEquals(1, romanNumeral.toArabic("I"));
	}
	
	@Test
	public void toArabic_EnterIIIReturns3() {
		assertEquals(3, romanNumeral.toArabic("III"));
	}
	
	@Test
	public void toArabic_EnterIVReturns4() {
		assertEquals(4, romanNumeral.toArabic("IV"));
	}
	
	@Test
	public void toArabic_EnterVIIReturns7() {
		assertEquals(7, romanNumeral.toArabic("VII"));
	}
	
	@Test
	public void toArabic_EnterIXReturns9() {
		assertEquals(9, romanNumeral.toArabic("IX"));
	}
	
	@Test
	public void toArabic_EnterXXVIReturns26() {
		assertEquals(26, romanNumeral.toArabic("XXVI"));
	}
	
	//End tests for Roman numeral conversion to Arabic number
	
}
