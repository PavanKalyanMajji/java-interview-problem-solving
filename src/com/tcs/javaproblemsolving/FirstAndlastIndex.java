package com.tcs.javaproblemsolving;
/**
 *first and last index of given number.
 *example1 :- {10,20,10,30} target :- 10
 *output :- 0,2
 *
 *example1 :- {10,20,20,30} target :- 20
 *output :- 1,2
 */
public class FirstAndlastIndex {
	public static String firstAndLastIndex(int[] array, int target) {
		int firstIndex = -1;
		int lastIndex = -1;

		for (int x = 0; x < array.length; x++) {
			if (array[x] == target) {
				if (firstIndex == -1)
					firstIndex = x;
				lastIndex = x;
			}
		}
		if (firstIndex == -1 && lastIndex == -1)
			return "Target Not found in given array";
		return "firstIdex: " + firstIndex + " lastIndex: " + lastIndex;

	}

	public static void main(String[] args) {
		System.out.println(firstAndLastIndex(new int[] { 45, 12, 93, 45, 18, 1, 10, 45 }, 60));
	}
}
