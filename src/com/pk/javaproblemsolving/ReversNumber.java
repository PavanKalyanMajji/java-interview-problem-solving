package com.pk.javaproblemsolving;
/**
 * 
 * Reverse Given Number
 * example1 :- 341
 * output :- 143
 * 
 * example2 :- 421
 * output :- 124
 */
public class ReversNumber {
	public static int reversNumber(int value) {
		int temp=0;
		while(value%10>0) {
			temp = temp*10 + value%10;
			value = value/10;
		}
		return temp;
	}
	public static void main(String[] args) {
		int value =341;
		System.out.println(reversNumber(value));
	}
}
