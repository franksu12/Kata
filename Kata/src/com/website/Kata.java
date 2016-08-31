package com.website;

public class Kata {
	
	public String toRoman(int number) {
		
		if (number >= 10)
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
}
