package com.stringPrograms;

public class BiggestSmallestPalindrome {

	public static boolean isPalindrome(String s) {
		boolean flag = true;
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		String str = "Huh you know malayalam wow";
		String words[] = new String[str.length()];
		String word = "", smallPali = "", bigPali = "";
		int temp = 0, count = 0;
		str = str + " ";
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				word = word + str.charAt(i);
			}else {
				words[temp] = word;
				temp++;
				word = "";
			}
		}
		for(int i = 0; i < temp; i++) {
			if(isPalindrome(words[i])) {
				count += 1;
				if(count == 1) {
					smallPali = bigPali = words[i];
				}else {
					if(smallPali.length() > words[i].length()) {
						smallPali = words[i];
					}
					if(bigPali.length() < words[i].length()) {
						bigPali = words[i];
					}
				}
			}
		}
		System.out.println("Small Palindrome : " + smallPali);
		System.out.print("Big Palindrome : " + bigPali);
	}
}
