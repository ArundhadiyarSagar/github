package com.stringPrograms;

public class FreqOfMinMaxCharcaters {

	public static void main(String[] args) {
		String str = "Sagar is a very gooood boy";
		char[] string = str.toCharArray();
		int[] freq = new int[str.length()];
		int i,j,min,max;
		char minChar = str.charAt(0), maxChar = str.charAt(0);
		
		for(i = 0; i < string.length; i++) {
			freq[i] = 1;
			for(j = i+1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != 0) {
					freq[i]++;
					string[j] = 0;
				}
			}
		}
		
		min = max = freq[0];
		
		for(i = 0; i < freq.length; i++) {
			if(min > freq[i] && freq[i] != '0') {
				min = freq[i];
				minChar = string[i];
			}
			if(max < freq[i]) {
				max = freq[i];
				maxChar = string[i];
			}
		}
		System.out.print("Maximum Number of Character in String is " + maxChar + " and Repeated for " + max + " time");
		System.out.print("\nMinimum Number of Character in String is " + minChar + " and Repeated for " + min + " time");
	}

}
