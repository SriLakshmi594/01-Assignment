package com.app;

public class Element_Pairs {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 8, -8, 10, 8 };
		int sum = 16;
		sumEqualToGiven(arr, sum);

	}

	private static void sumEqualToGiven(int[] arr, int sum) {
		System.out.print("The pairs with sum 16 are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum == arr[i] + arr[j]) {
					System.out.print("(" + arr[i] + "," + arr[j] + ")" + "and");
				}
			}
		}
	}

}
