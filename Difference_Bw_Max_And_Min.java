package com.app;

import java.util.Arrays;

public class Difference_Bw_Max_And_Min {

	public static void main(String[] args) {
		int[] arr = { 9, 2, 12, 5, 4, 7, 3, 19, 5};
		diffMinMax(arr);

	}

	private static void diffMinMax(int[] arr) {
		Arrays.sort(arr);
		int diff = arr[arr.length - 1]-arr[0];
		System.out.println(diff);
	}

}
