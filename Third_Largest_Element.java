package com.app;

import java.util.Arrays;

public class Third_Largest_Element {

	public static void main(String[] args) {
		int[] arr = { 6, 8, 1, 9, 2, 1, 10 };
		thirdLarge(arr);

	}

	private static void thirdLarge(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		int max = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 0; i--) {
			if (count < 2 && max > arr[i]) {
				max = arr[i];
				count++;
			}
		}
		if (arr.length < 3)
			System.out.println("Invalid Input, array size is less than 3");
		else
			System.out.println("Third largest element : " + max);
	}

}
