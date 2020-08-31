package com.matrixprograms;

public class SubMatrix {

	public static void main(String[] args) {
		int a[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int b[][] = new int[][] {{9,8,7},{6,5,4},{3,2,1}};
		System.out.println("Elements of 1st Matrix");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("Elements of 2nd Matrix");
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b.length; j++) {
				System.out.print(b[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println("Matrix Substraction");
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]-b[i][j] + "   ");
			}
			System.out.println();
		}
	}

}
