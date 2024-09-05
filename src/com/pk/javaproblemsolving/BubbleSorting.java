package com.pk.javaproblemsolving;

import java.util.Arrays;

public class BubbleSorting {
	public static int[] arraySorting(int[] array) {

		if (array.length <= 1)
			return array;

		for (int i = 0; i < array.length - 1; i++) {
			int x = array[i];
			for (int y = i + 1; y < array.length; y++) {
				if (array[y] < x) {
					x = array[y] ^ x;
					array[y] = array[y] ^ x;
					x = array[y] ^ x;
				}
			}
			array[i] = x;
		}
		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, 89, 2, 96, 45 };
		arraySorting(array);
		System.out.println(Arrays.toString(array));
	}
}
