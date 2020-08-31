package com.arrayPrograms;

public class LargestElement {

	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5,0,2,3,6,9,1,7,8};
		int max,min,sum=0;
		max = min = arr[0];
		System.out.println("Elements in the Array");
		for(int i=0;i<arr.length;i++) {
			System.out.print(" " + arr[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max = arr[i];
			if(arr[i]<min)
				min = arr[i];
			sum+=arr[i];
		}
		System.out.println("\nLargest Element in the Array : " + max);
		System.out.println("Smallest Element in the Array : " + min);
		System.out.println("Number of Elements in the Array : " + arr.length);
		System.out.println("Sum of All Element in the Array : " + sum);
	}
}
