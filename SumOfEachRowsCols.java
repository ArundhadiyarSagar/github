package com.matrixprograms;

public class SumOfEachRowsCols {

	public static void sumOfRowsCols(int arr[][], int rows, int cols) {
		int sumRow = 0,sumCol = 0;
		for(int i = 0; i < rows; i++) {
			sumRow = 0;
			for(int j = 0; j < cols; j++) {
				sumRow += arr[i][j];
			}
			System.out.print("Sum of Row-" + (i+1) + " : " + sumRow + "\n");
		}
		for(int i = 0; i < cols; i++) {
			sumCol = 0;
			for(int j = 0; j < rows; j++) {
				sumCol += arr[j][i];
			}
			System.out.print("\nSum of Column-" + (i+1) + " : " + sumCol);
		}
	}
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		sumOfRowsCols(a,a.length,a[0].length);
	}
}
