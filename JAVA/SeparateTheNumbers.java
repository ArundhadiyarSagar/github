package com.HackerRank;
import java.util.Scanner;
public class SeparateTheNumbers {

	public static void separateTheNumbers(String s) {
		boolean valid = false;
		String substring = "";
		for(int i = 1; i < s.length() / 2; i++) {
			substring = s.substring(0, i);
			Long n = Long.parseLong(substring);
			String validstring = substring;
			while(validstring.length() < s.length()) {
				validstring += Long.toString(++n);
			}
			if(s.equals(validstring)) {
				valid = true;
				break;
			}
		}
		System.out.print(valid ? "Yes " + substring : "No");
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			String s = input.next();
			separateTheNumbers(s);
		}
		input.close();
	}
}
