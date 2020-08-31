package com.stringPrograms;

public class RotationOfString {

	public static void main(String[] args) {
		String str1 = "abcde", str2 = "deabc";
		if(str1.length() != str2.length()) {
			System.out.print("Second String is not Rotation of First String");
		}else {
			str1 = str1.concat(str1);
			if(str1.indexOf(str2) != 1) {
				System.out.print("Second String is Rotation of First String");
			}else {
				System.out.print("Second String is not Rotation of First String");
			}
		}
		System.out.print("\n" + str1);
	}

}
