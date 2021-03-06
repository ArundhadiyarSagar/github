package com.mathPrograms;

public class QuadraticEquation {

	public static void main(String[] args) {
		double a = 2.3, b = 4, c = 5.6;
		double root1, root2;
		double realPart, imaginaryPart;
		double determinant = b * b - 4 * a * c;
		if(determinant > 0) {
			root1 = (-b + Math.sqrt(determinant)) / (2 * a);
			root2 = (-b - Math.sqrt(determinant)) / (2 * a);
			System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
		}else if(determinant == 0) {
			root1 = root2 = -b / (2 * a);
			System.out.format("root1 = root2 = %.2f;", root1);
		}else {
			realPart = -b / (2 * a);
			imaginaryPart = Math.sqrt(-determinant) / (2 * a);
			System.out.format("root1 = %.2f + %.2fi and root2 = %.2f - %.2fi", realPart,imaginaryPart,realPart,imaginaryPart);
		}
	}

}
