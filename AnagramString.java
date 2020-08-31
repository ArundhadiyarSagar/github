package com.stringPrograms;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		// ANAGRAM means whether they contain the same characters but in different order like GRAB and BRAG
		String str1 = "BRAG", str2 = "GRAB";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		if(str1.length() != str2.length()) {
			System.out.print("Both have different lengths");
		}else {
			char[] chr1 = str1.toCharArray();
			char[] chr2 = str2.toCharArray();
			Arrays.sort(chr1);
			Arrays.sort(chr2);
			if(Arrays.equals(chr1, chr2) == true) {
				System.out.print("Both the Strings are Anagram");
			}else {
				System.out.print("Both the Strings are not Anagram");
			}
		}

	}

}
