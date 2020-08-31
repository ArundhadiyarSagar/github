package com.stringPrograms;

public class SubsetOfString {
	public static void main(String[] args) {
		String str = "FUN";
		int temp = 0, len = str.length();
		//Combination of all Subset = n*(n+1)/2
		String subset[] = new String[len*(len + 1)/2];
		for(int i = 0; i < len; i++) {
			for(int j = i; j < len; j++) {
				subset[temp] = str.substring(i, j+1);
				temp++;
			}
		}
		System.out.print("Subset of String : " + str + "\n");
		for(int i = 0; i < subset.length; i++) {
			System.out.println(subset[i]);
		}
	}
}
