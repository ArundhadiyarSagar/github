package com.stringPrograms;

public class Palindrome {

	public static void main(String[] args) {
		String str  = "Sagar";
		boolean flag = true;
		str = str.toLowerCase();
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				flag = false;
				break;
			}
		}
		str = str.toUpperCase();
		if(flag) {
			System.out.print(str + " is a Palindrome String");
		}else {
			System.out.print(str + " is Not a Palindrome String");
		}
	}

}
