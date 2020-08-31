package com.HackerRank;
import java.util.Scanner;
public class ArrayManipulation {

	static long arrayManipulation(int n, int[][] val) {
		long[] ans = new long[n + 2];
		for(int i = 0; i < val.length; i++) {
			int a = val[i][0];
			int b = val[i][1];
			int k = val[i][2];
			ans[a] += k;
			ans[b + 1] -= k;
		}
		long max = getMax(ans);
		return max;
	}
	
	static long getMax(long[] arr) {
		long max = Long.MIN_VALUE;
		long sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			max = Math.max(max, sum);
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		int[][] val = new int[m][3];
		for(int i = 0; i < m; i++) {
			val[i][0] = input.nextInt();
			val[i][1] = input.nextInt();
			val[i][2] = input.nextInt();
		}
		long max = arrayManipulation(n, val);
		System.out.print(max);
		input.close();
	}
}
