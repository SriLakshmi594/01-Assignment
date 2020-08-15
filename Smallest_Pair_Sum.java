package com.app;

import java.util.Arrays;

public class Smallest_Pair_Sum {

	public static void main(String[] args) {
		int[] arr = { 1, 7, 2, 9, 6 };
		sum(arr);

	}

	private static void sum(int[] arr) {
		Arrays.sort(arr);
		System.out.println(arr[0] + arr[1]);
	}

}
