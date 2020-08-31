package com.HackerRank;
import java.util.*;
public class TripletSum {

	public static int tripletSum(int[] arr1, int[] arr2, int[] arr3) {
		int count = 0; 
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		int[] noDuplicateA = removeDuplicates(arr1);
		int[] noDuplicateB = removeDuplicates(arr2);
		int[] noDuplicateC = removeDuplicates(arr3);
		
		for(int i : noDuplicateB) {
			int c1 = findIndex(noDuplicateA, i) + 1;
			int c3 = findIndex(noDuplicateC, i) + 1;
			count += c1 * c3;
		}
		return count;
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int temp = 0;
		Set<Integer> sample = new HashSet<>();
		for(int i : arr) {
			sample.add(i);
		}
		int[] result = new int[sample.size()];
		for(int i : sample) {
			result[temp++] = i;
		}
		return result;
	}
	
	public static int findIndex(int[] arr, int key) {
		int low = 0;
		int high = arr.length - 1;
		int index = -1;
		while(low <= high) {
			int mid = low + (high - low) / 2;
			if(arr[mid] <= key) {
				index = mid;
				low = low + 1;
			}else {
				high = mid - 1;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int in[] = new int[3];
		for(int i = 0; i < in.length; i++) {
			in[i] = input.nextInt();
		}
		int arr1[] = new int[in[0]];
		int arr2[] = new int[in[1]];
		int arr3[] = new int[in[2]];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = input.nextInt();
		}
		for(int i = 0; i < arr2.length; i++) {
			arr2[i] = input.nextInt();
		}
		for(int i = 0; i < arr3.length; i++) {
			arr3[i] = input.nextInt();
		}
		int result = tripletSum(arr1, arr2, arr3);
		System.out.print(result);
		input.close();
		
	}

}
