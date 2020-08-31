package com.matrixprograms;

public class IdentityMatrix {

	public static void checkIdentity(int arr[][],int rows,int cols) {
		boolean ans = true;
		if(rows != cols) {
			System.out.print("The Matrix Should be a Square Matrix");
		}else {
			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < cols; j++) {
					if(i==j && arr[i][j] != 1) {
						ans = false;
						break;
					} 
					if(i!=j && arr[i][j] != 0) {
						ans = false;
						break;
					}
				}
			}
		}
		if(ans) {
			System.out.print("The Matrix Given is Identity Matrix");
		}else {
			System.out.print("The Matrix Given is not a Identity Matrix");
		}
	}
	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int[][] {{1,0,0},{0,1,0},{0,0,1}};
		checkIdentity(a,a.length,a[0].length);
		System.out.println();
		checkIdentity(b,b.length,b[0].length);
	}
}
