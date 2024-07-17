package com.pk.javaproblemsolving;
/**
 * 
 *Print Prime Numbers from 1 to n ( n is range up-to you want ) 
 *
 */
public class PrintPrimeNumbers {
	
	public static void printPrimrNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			int count =0;
			for (int j = 2; j <= i/2; j++) {
				if ((i % j == 0)) {
					count ++;
					break;
				}
			}
			if(count == 0)
				System.out.println(i + " is prime number");
		}
	}
	public static void main(String[] args) {
		printPrimrNumbers(20);
	}
}
