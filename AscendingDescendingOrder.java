package com.arrayPrograms;

public class AscendingDescendingOrder {

	public static void main(String[] args) {
		int arr[] = new int[] {4,5,1,3,2};
		System.out.println("Elements of The Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
		//Ascending Order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("\nAscending Order of The Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
		
		//Descending Order
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		System.out.println("\nDescending Order of The Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
	}
}
