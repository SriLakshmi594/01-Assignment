package com.app;

import java.util.Arrays;

public class Second_Min_Second_Max {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 5, 9, 6, 4, 7, 2 };
		secMinMax(arr);

	}

	private static void secMinMax(int[] arr) {
		Arrays.sort(arr);
		int min = arr[0];
		int max = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > min) {
		        min=arr[i];
				break;
			}

		}
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i] < max) {
				max=arr[i];
				break;
			}
		}
		System.out.println("Second Min - "+min+" "+"Second Max - "+max);
	}

}
