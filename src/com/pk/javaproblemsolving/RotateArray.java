package com.pk.javaproblemsolving;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Rotate Array By Number of times.
 * 1. Approach by using Temporary Array.
 * 2. Approach by using ArrayList.
 * 
 */
public class RotateArray {
	public static int[] rotateArray(int[] array, int times) {
		if (array.length <= 1)
			return array;
		int[] temp = new int[array.length];
		int j = 0;
		for (int i = times; i < array.length; i++) {
			temp[j++] = array[i];
		}

		for (int k = 0; k < times; k++) {
			temp[j++] = array[k];
		}

		for (int i = 0; i < array.length; i++)
			array[i] = temp[i];
		return array;
	}

	public static int[] rotateArray_2(int[] array, int times) {
		if (array.length <= 1)
			return array;
		List<Integer> list = new ArrayList<Integer>();
		
		for (int i = times; i < array.length; i++)
			list.add(array[i]);
		
		for (int i = 0; i < times; i++)
			list.add(array[i]);
		
		int i=0;
		for(Integer obj : list)
			array[i++] = obj;
		
		return array;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 10, 20, 30, 40, 50, 60 };
//		rotateArray(array, 2);
		rotateArray_2(array, 2);
		System.out.println(Arrays.toString(array));
	}
}
