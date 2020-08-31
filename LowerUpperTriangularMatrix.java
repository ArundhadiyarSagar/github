package com.matrixprograms;

public class LowerUpperTriangularMatrix {

	public static void lowerTriangular(int arr[][],int rows,int cols) {
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		if(rows != cols) {
			System.out.print("The Rows and Columns of the Matrix must be Equal");
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(i < j) {
					arr[i][j] = 0;
				}
			}
		}
		System.out.print("Lower Triangular Matrix");
		System.out.println();	
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void upperTriangular(int arr[][],int rows,int cols) {
		if(rows != cols) {
			System.out.print("The Rows and Columns of the Matrix must be Equal");
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(i > j) {
					arr[i][j] = 0;
				}
			}
		}
		System.out.print("Upper Triangular Matrix");
		System.out.println();	
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		lowerTriangular(a,a.length,a[0].length);
		upperTriangular(a,a.length,a[0].length);
	}

}
