package com.stringPrograms;

public class Permutation {
	public static void main(String[] args) {
		String str = "AB";
		int n = str.length();
		System.out.print("Permutation of String " + str + " : \n");
		generatePermutation(str,0,n);
	}
	public static void generatePermutation(String str, int start, int end) {
		if(start == end-1) {
			System.out.println(str);
		}else {
			for(int i = start; i < end; i++) {
				str = swapString(str, start, i);
				generatePermutation(str, start+1,end);
				str = swapString(str, start, i);
			}
		}
	}
	public static String swapString(String s, int i, int j) {
		char[] arr = s.toCharArray();
		char ch = arr[i];
		arr[i] = arr[j];
		arr[j] = ch;
		return String.valueOf(arr);
	}
}
