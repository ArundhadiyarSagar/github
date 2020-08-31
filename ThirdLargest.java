package com.arrayPrograms;

import java.util.*;
public class ThirdLargest {

	static int thirdlg(int[] a,int size) {
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		return a[size-2];
	}
	
	static int thirdlgcollection(Integer[] a,int size) {
		List<Integer> list = Arrays.asList(a);
		Collections.sort(list);
		int el = list.get(size-3);
		return el;
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {9,8,99,2,56,78,34,53};
		Integer[] arr1 = {9,8,99,2,56,78,34,53};
		System.out.print("Third Largest : " + thirdlg(arr,arr.length));
		System.out.print("\nThird Largest : " + thirdlgcollection(arr1,arr1.length));
	}

}
