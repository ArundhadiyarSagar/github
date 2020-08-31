package com.HackerRank;
import java.util.Scanner;
public class CommonChildSolution {
	
	static int commonChild(String s1, String s2) {
		return LCS(s1.toCharArray(), s2.toCharArray(), s1.length(), s2.length());
	}
	
	public static int LCS(char X[], char Y[], int m, int n) {
		// A B C D
		// A B D C
		int[] memo = new int[n + 1];
		for(int i = 1; i <= m; i++) {
			int prev = 0;
			for(int j = 1; j <= n; j++) {
				int temp = memo[j];
				if(X[i - 1] == Y[j - 1]) {
					memo[j] = prev + 1;
				} else {
					memo[j] = Math.max(memo[j], memo[j - 1]);
				}
				prev = temp;
			}

			for(int k = 0; k < memo.length; k++)
				System.out.print(memo[k] + " ");
			System.out.println();
		}
		return memo[n];
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s1 = input.next();
		String s2 = input.next();
		int result = commonChild(s1, s2);
		System.out.print(result);
		input.close();
	}

}
