package com.app;

public class Unique_Ele_Sum {

	public static void main(String[] args) {
		int[] arr = { 1, 1, 3, 2, 2, 3 };
		uniqueSum(arr);

	}

	private static void uniqueSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				sum = sum + arr[i];
			}

		}
		System.out.println(sum);
	}

}
