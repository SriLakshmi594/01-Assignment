package com.app;

public class Duplicate_Elements_In_Array {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5, 5, 6, 6, 7, 2 };
		duplicateEle(arr);
	}

	private static void duplicateEle(int[] arr) {
		int[] b = new int[arr.length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					b[k] = arr[j];
					k = k + 1;
				}
			}

		}
		for (int i = 0; i < k; i++) {
			if(i<k-1)
			System.out.print(b[i]+",");
			else
				System.out.println(b[i]);
		}

	}
}
