package com.HackerRank;
import java.util.Scanner;
public class JumpingInClouds {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int count = -1, temp = 0, i;
		int arr[] = new int[n];
		for(i = 0; i < arr.length; i++) {
			temp = input.nextInt();
			if(temp == 1 || temp == 0) {
				arr[i] = temp;
			}else {
				arr[i] = 0;
			}
		}
		//Easy Method
		/*for(i = 0; i < arr.length;) {
			if(i + 2 < arr.length && arr[i + 2] == 0) {
				i += 2;
			}else {
				i += 1;
			}
			count++;
		}*/
		//Medium Method
		/*for(i = 0; i < arr.length; ) {
			if(i + 2 < arr.length && arr[i + 2] == 0) {
				i++;
			}
			i++;
			count++;
		}*/
		//Hard Method
		for(i = 0; i < arr.length; i++, count++) {
			if(i + 2 < arr.length && arr[i + 2] == 0) {
				i++;
			}
		}
		System.out.print(count);
		input.close();
	}

}
