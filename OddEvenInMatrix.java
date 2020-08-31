package com.matrixprograms;

public class OddEvenInMatrix {
	
	public static void oddEvenFrequency(int arr[][], int rows, int cols) {
		int even,odd;
		even = odd = 0;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(arr[i][j] % 2 == 0) {
					even++;
				}else {
					odd++;
				}
			}
		}
		System.out.print("Count of Odd Numbers in Matrix : " + odd);
		System.out.print("\nCount of Even Numbers in Matrix : " + even);
	}

	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		oddEvenFrequency(a,a.length,a[0].length);
	}

}
