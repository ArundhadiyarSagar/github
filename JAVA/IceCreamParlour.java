package com.HackerRank;
import java.util.Arrays;
import java.util.Scanner;
public class IceCreamParlour {

	public static void iceCream(int arr[], int m) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] + arr[j] == m) {
					System.out.print((i+1) + " " + (j+1));
					break;
				}
			}
		}
	}
	
	public static int[] iceCreamA1(int[] arr, int m) {
		int[] result = new int[2];
		int[] freq = new int[10001];
		Arrays.fill(freq, -1);
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];
			int y = m - x;
			if(y >= 0) {
				int j = freq[y];
				if(j != -1) {
					result[0] = j + 1;
					result[1] = i + 1;
					break;
				}
			}
			freq[x] = i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0; i < n; i++) {
			int money = input.nextInt();
			int num = input.nextInt();
			int[] arr = new int[num];
			for(int j = 0; j < num; j++) {
				arr[j] = input.nextInt();
				//iceCream(arr,money);
				int[] arr1 = iceCreamA1(arr,money);
				for(int k = 0; k < arr1.length; k++) {
					System.out.print(arr[k] + " ");
				}
			}
		}
		input.close();
	}
}
