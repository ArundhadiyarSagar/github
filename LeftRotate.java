package com.arrayPrograms;

public class LeftRotate {

	public static void main(String[] args) {
		int arr[] = new int[] {1,2,3,4,5};
		System.out.println("Elements of The Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
		int n=1; //Times of LEFT Rotation
		for(int i=0;i<n;i++) {
			int j,first;
			first = arr[0];
			for(j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=first;
		}
		System.out.println("\nLeft Rotate of The Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
	}

}
