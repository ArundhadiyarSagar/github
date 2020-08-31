package com.stringPrograms;

public class NoOfVowelsConsoSpaces {

	public static void main(String[] args) {
		String str = "abcd efgh ijkl mnop qrst uvw xyz";
		str = str.toUpperCase();
		int vowels = 0, consonants = 0,spaces = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				vowels++;
			}else if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
				consonants++;
			}else if(str.charAt(i) == ' ') {
				spaces++;
			}
		}
		System.out.print("Vowels : " + vowels + " Consonants : " + consonants + " Spaces : " + spaces);
	}
}
