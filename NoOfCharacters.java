package com.stringPrograms;

public class NoOfCharacters {

	public static void main(String[] args) {
		String str = "The best of both worlds";
		int count = 0,count1 = 1;
		for(int i = 0; i < str.length(); i++) {
			count1++;
			if(str.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.print("Total No. of Characters Excluding Spaces : " + count);
		System.out.print("\nTotal No. of Characters Including Spaces : " + count1);
	}

}
