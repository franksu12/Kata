package com.website;

public class Kata {
	
	public String toRoman(int number) {
		
		if (number >= 5)
			return "V" + toRoman(number - 5);
		else if (number == 4)
			return "IV";
		else if (number >= 1)
			return "I" + toRoman(number - 1);
		
		return "";
	}
}
