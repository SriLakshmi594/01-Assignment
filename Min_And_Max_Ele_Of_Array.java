package com.app;

import java.util.Arrays;

public class Min_And_Max_Ele_Of_Array {

	public static void main(String[] args) {
		int[] arr= {1, 2, 5, 5, 6, 6, 7, 2};
		minAndMax(arr);
	}

	private static void minAndMax(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Min : "+arr[0]+" "+"Max : "+arr[arr.length-1]);
	}

}
