package com.stringPrograms;

public class ToggleCaseString {

	public static void main(String[] args) {
		String str = "Hey There Fellas!!!";
		StringBuffer newStr = new StringBuffer(str);
		for(int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))){
				newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}else if(Character.isUpperCase(str.charAt(i))) {
				newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
			}
		}
		System.out.println("String before Case Conversion : " + str);
		System.out.print("String after Case Conversion : " + newStr);
	}

}
