package com.app;

public class Common_Elements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 10, 20, 40, 80 };
		int[] arr2 = { 6, 7, 20, 80, 100 };
		int[] arr3 = { 3, 4, 15, 20, 30, 70, 80, 120 };
		common(arr1, arr2, arr3);

	}

	private static void common(int[] arr1, int[] arr2, int[] arr3) {
		int[] res = new int[10000];
		int c = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					for (int k = 0; k < arr3.length; k++) {
						if (arr1[i] == arr3[k]) {
							res[c] = arr1[i];
							c = c + 1;
						}
					}
				}
			}
		}
		for (int i = 0; i < c; i++) {
			if (i < c - 1)
				System.out.print(res[i] + ",");
			else
				System.out.println(res[i]);
		}

	}

}
