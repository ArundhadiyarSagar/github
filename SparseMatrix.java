package com.matrixprograms;

public class SparseMatrix {

	public static void checkSparse(int arr[][],int rows,int cols) {
		int count=0;
		int size = rows * cols;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				if(arr[i][j] == 0) {
					count++;
				}
			}
		}
		if(count > size/2) {
			System.out.print("The Matrix is Sparse Matrix");
		}else {
			System.out.print("The Matrix is not a Sparse Matrix");
		}
	}
	
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
		checkSparse(a,a.length,a[0].length);
		System.out.println();
		checkSparse(b,b.length,b[0].length);
	}

}
