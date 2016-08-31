package com.website;

public class Kata {
	
	public String toRoman(int number) {
		
		/* Stopping at this point in Arabic to Roman conversion
		 * for this Kata's purposes.
		 */
		
		if (number >= 100)
			return "C" + toRoman(number - 100);
		else if (number >= 90)
			return "XC" + toRoman(number - 90);
		else if (number >= 50)
			return "L" + toRoman(number - 50);
		else if (number >= 40)
			return "XL" + toRoman(number - 40);
		else if (number >= 10)
			return "X" + toRoman(number - 10);
		else if (number == 9)
			return "IX";
		else if (number >= 5)
			return "V" + toRoman(number - 5);
		else if (number == 4)
			return "IV";
		else if (number >= 1)
			return "I" + toRoman(number - 1);
		
		return "";
	}
	
	public int toArabic(String numeral) {
		
		int number = 0;
		
		for (int i = 0; i < numeral.length(); i++) {
			switch (numeral.charAt(i)) {
				case 'I':
					if (i+1 < numeral.length() && (numeral.charAt(i+1) == 'V' || numeral.charAt(i+1) == 'X'))
						number -= 1;
					else
						number += 1;
					break;
				case 'V':
					number += 5;
					break;
				case 'X':
					if (i+1 < numeral.length() && (numeral.charAt(i+1) == 'L' || numeral.charAt(i+1) == 'C'))
						number -= 10;
					else
						number += 10;
					break;
				case 'L':
					number += 50;
					break;
				case 'C':
					number += 100;
					break;
					
				/* Stopping at this point in Roman to Arabic conversion
				 * for this Kata's purposes.
				 */
					
				default:
					break;
			}
		}
		
		return number;
		
	}
	
}
