package com.stringPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String str = "sagar", revStr = "";
		for(int i = str.length() - 1; i >= 0; i--) {
			revStr = revStr + str.charAt(i); 
		}
		str = str.toUpperCase();
		revStr = revStr.toUpperCase();
		System.out.print("Reverse of String '" + str + "' is '" + revStr + "'");
	}

}
