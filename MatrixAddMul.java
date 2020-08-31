package com.matrixprograms;

public class MatrixAddMul {

	public static void main(String[] args) {
		int[][] arr1 = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2 = new int[][] {{9,8,7},{6,5,4},{3,2,1}};
		int[][] arr3 = new int[3][3];
		int[][][][] arr4 = new int[3][6][9][12];
		System.out.println("Length : " + arr4.length + " " + arr4[0].length + " " + arr4[0][0].length + " " + arr4[0][0][0].length);
		
		System.out.println("First Matrix : ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Second Matrix : ");
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2[0].length; j++) {
				System.out.print(arr2[i][j] + " ");
			}
			System.out.println();
		}
		//Addition
		System.out.println("Addition of Matrix : ");
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[0].length; j++) {
				System.out.print(arr1[i][j]+arr2[i][j] + " ");
			}
			System.out.println();
		}
		//Multiplication
		System.out.println("Multiplication of Matrix : ");
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[0].length; j++) {
				arr3[i][j] = 0;
				for(int k = 0; k < arr1.length; k++) {
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
