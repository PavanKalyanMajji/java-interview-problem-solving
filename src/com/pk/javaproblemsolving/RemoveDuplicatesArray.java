package com.pk.javaproblemsolving;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/**
 * 
 * Remove Duplicates from Sorted Array
 *
 */
public class RemoveDuplicatesArray {
	public static int[] removeDuplicate(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1 - i; j++)
				if (array[j] > array[j + 1]) {
					array[j] = array[j] ^ array[j + 1];
					array[j + 1] = array[j] ^ array[j + 1];
					array[j] = array[j] ^ array[j + 1];
				}
		}

//		return approach_1(array);
		return approach_2(array);
	}
	public static int[] approach_2(int[] sortedArray) {
		int[] temp = new int[sortedArray.length];
		int j=0;
		for(int i=0; i<sortedArray.length-1;i++)
			if(sortedArray[i] != sortedArray[i+1])
				temp[j++] = sortedArray[i];
		temp[j++] = sortedArray[sortedArray.length-1];
		
		sortedArray = new int [j];
		for(int i=0; i<j; i++)
			sortedArray[i] = temp[i];
		
		return sortedArray;
			
	}
	public static int[] approach_1(int[] sortedArray) {
		Set<Integer> set = new HashSet<>();
		for (int obj : sortedArray)
			set.add(obj);

		sortedArray = new int[set.size()];
		int j = 0;
		for (Integer obj : set)
			sortedArray[j++] = obj;

		return sortedArray;
	}

	public static void main(String[] args) {
		int[] array = new int[] { 45, 18, 25, 1, 7, 93, 10, 17, 25, 0, 45};
		int[] finalArray=removeDuplicate(array);
		System.out.println(Arrays.toString(finalArray));
	}
	
//	input:- [ 45, 18, 25, 1, 7, 93, 10, 17, 25, 0, 45 ]
//	output:- [0, 1, 7, 10, 17, 18, 25, 45, 93]
}
