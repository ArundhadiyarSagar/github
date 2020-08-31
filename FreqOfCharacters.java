package com.stringPrograms;

public class FreqOfCharacters {

	public static void main(String[] args) {
		String str = "Sagar is a good boy";
		str = str.toLowerCase();
		int[] count = new int[str.length()];
		char[] string = str.toCharArray();
		for(int i = 0; i < string.length; i++) {
			count[i] = 1;
			for(int j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[j] != ' ' && string[j] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
			if(string[i] != '0' && string[i] != ' ') {
				System.out.println("'" + string[i] + "' has been repeated for '" + count[i] + "' times");
			}
		}
	}

}
