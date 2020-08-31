package com.HackerRank;
import java.util.Scanner;
public class PalindromeIndex {

	public static int palindromeIndex(String s) {
		int index = -1;
		int len = s.length();
		for(int i = 0; i < len / 2; i++) {
			if(s.charAt(i) != s.charAt(len - i - 1)) {
				if(i + 1 < len) {
					boolean valid = isValidPalindrome(s.substring(i + 1, len - i));
					if(valid) {
						return i;
					}
					return(len - i - 1);
				}
			}
		}
		return index;
	}
	
	public static boolean isValidPalindrome(String str) {
		int len = str.length();
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		for(int i = 0; i < no; i++) {
			String s1 = input.next();
			int index = palindromeIndex(s1);
			System.out.print(index);
		}
		input.close();
	}

}
