package com.stringPrograms;

public class NEqualParts {

	public static void main(String[] args) {
		String str = "aaabbbcccdddeeefff";
		int len = str.length();
		int n = 6;
		int temp = 0, chars = len / n;
		String newStr[] = new String[n];
		if(len % n != 0) {
			System.out.print("String cannot be divided in " + n + " equal parts");
		}else {
			for(int i = 0; i < len; i += chars) {
				newStr[temp] = str.substring(i,i + chars);
				temp++;
			}
		}
		System.out.println("Equals Divided String into " + n +" parts");
		for(int i = 0; i < newStr.length; i++) {
			System.out.print(newStr[i] + "\n");
		}
		
	}

}
