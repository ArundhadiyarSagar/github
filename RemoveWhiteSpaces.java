package com.stringPrograms;

public class RemoveWhiteSpaces {
	public static void main(String[] args) {
		String str = "Sagar is a good boy";
		str = str.replace(" ", "");
		System.out.println(str);
		
		String str1 = "Sagar is a good boy";
		str1 = str1.replace(" ","-");
		System.out.print(str1);
	}
}
