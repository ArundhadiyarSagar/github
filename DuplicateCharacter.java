package com.stringPrograms;

public class DuplicateCharacter {

	public static void main(String[] args) {
		String str = "Great Responsibility";
		str = str.toLowerCase();
		int count;
		char[] string = str.toCharArray();
		for(int i = 0; i < string.length; i++) {
			count = 1;
			for(int j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					count++;
					string[j] = '0';
				}
			}
			if(count > 1 && string[i] != '0' && string[i] != ' ') {
				System.out.println(string[i]);
			}
		}
	}

}
