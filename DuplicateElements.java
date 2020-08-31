package com.arrayPrograms;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,1,2,3,6};
		System.out.println("Elements in the Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println("\nDuplicate Elements in the Array");
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.print(" " + arr[i]);
				}
			}
		}	
	}
}
