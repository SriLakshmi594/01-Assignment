package com.app;

public class RemovingDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		removeDuplicate(arr);

	}

	private static void removeDuplicate(int[] arr) {
		int[] b = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				b[k] = arr[i];
				k = k + 1;
			}

		}
		for (int i = 0; i < k; i++) {
			if (i < k - 1)
				System.out.print(b[i] + ",");
			else
				System.out.println(b[i]);
		}

	}

}
