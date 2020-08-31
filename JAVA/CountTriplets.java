package com.HackerRank;
import java.util.*;
public class CountTriplets {

	public static long countTriplets(long[] arr, long r) {
		long count = 0;
		Map<Long, Long> rightmap = new HashMap<>();
		Map<Long, Long> leftmap = new HashMap<>();
		for(long i : arr) {
			rightmap.put(i, rightmap.getOrDefault(i, 0L) + 1);
		}
		for(int i = 0; i < arr.length; i++) {
			long a = arr[i];
			long c1 = 0, c3 = 0;
			rightmap.put(a, rightmap.getOrDefault(a, 0L) - 1);
			if(leftmap.containsKey(a / r) && a % r == 0) {
				c1 = leftmap.get(a / r);
			}
			if(rightmap.containsKey(a * r)) {
				c3 = rightmap.get(a * r);
			}
			count += c1 * c3;
			leftmap.put(a, leftmap.getOrDefault(a, 0L) + 1);
		}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		long n = input.nextLong();
		long r = input.nextLong();
		long[] arr = new long[(int)n];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = input.nextLong();
		}
		long result = countTriplets(arr, r);
		System.out.print(result);
		input.close();
	}
}
