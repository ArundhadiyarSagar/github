package com.arrayPrograms;

import java.util.Scanner;

public class CopyAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s=0;
		System.out.print("Enter The Number of Elements in 1st Array : ");
		s = input.nextInt();
		int[] arr1 = new int[s];
		int[] arr2 = new int[arr1.length];
		for(int i=0;i<arr1.length;i++){
			System.out.print("Enter The Value for Element[" + i + "] : ");
			arr1[i] = input.nextInt();
		}
		for(int i=0;i<arr1.length;i++){
			arr2[i] = arr1[i];
		}
		System.out.println("Elements in 1st Array");
		for(int i=0;i<arr1.length;i++){
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("Elements in 2nd Array");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i] + " ");
		}
		input.close();
	}

}
