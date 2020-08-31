package com.arrayPrograms;

import java.util.*;

public class RemoveDuplicates {

	static int removeAllDuplicates(int[] arr,int n) {
		if(n == 0 || n == 1) {
			return n;
		}
		int j = 0;
		for(int i = 0; i < n-1; i++) {
			if(arr[i] != arr[i+1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n-1];
		return j;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The Size of The Array : ");
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<arr.length;i++) {
			System.out.print("Enter the " + i + "th Element of the Array : ");
			arr[i] = input.nextInt();
		}
		Arrays.sort(arr);
		int length = removeAllDuplicates(arr,arr.length);
		System.out.println("Elements in The Array : ");
		for(int i=0;i<length;i++) {
			System.out.print(arr[i] + " ");
		}
		input.close();

	}

}
