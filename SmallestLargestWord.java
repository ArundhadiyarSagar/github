package com.stringPrograms;

public class SmallestLargestWord {

	public static void main(String[] args) {
		String str = "Hardships often prepare ordinary people for an extraordinary destiny";
		String word = "", small = "", large = "";
		String words[] = new String[str.length()];
		int length = 0;
		str = str + " ";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				word = word + str.charAt(i);
			}else {
				words[length] = word;
				word = "";
				length++;
			}
		}
		small = large = words[0];
		for(int i = 0; i < length; i++) {
			if(small.length() > words[i].length()) {
				small = words[i];
			}
			if(large.length() < words[i].length()) {
				large = words[i];
			}
		}
		System.out.println("Smallest Word in the String : " + small);
		System.out.print("Largest Word in the String : " + large);
	}

}
