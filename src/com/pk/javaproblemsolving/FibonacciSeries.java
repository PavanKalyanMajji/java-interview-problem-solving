package com.pk.javaproblemsolving;
/**
 * 
 *Example:- print fibonacci Series up to 10
 *output:- 0,1,1,2,3,5,8,13,21...
 */
public class FibonacciSeries {
	static int n1=0,n2=1,i=2,n3;
	public static void printFibonacciSeries(int upTo) {
		int n1=0,n2=1,n3,z=2;
		System.out.print(n1+","+n2+",");
		for(;z<=upTo;z++) {
			n3=n2+n1;
			System.out.print(n3+",");
			n1=n2;
			n2=n3;
		}
	}
	public static void printFibonacciSeriesByUsingRecursion(int upTo) {
		if(upTo>=0) {
			n3=n2+n1;
			System.out.print(n3+",");
			n1=n2;
			n2=n3;
			printFibonacciSeriesByUsingRecursion(upTo-1);
		}
	}
	public static void main(String[] args) {
		printFibonacciSeries(10);
		System.out.println();
		System.out.print(n1+","+n2+",");
		printFibonacciSeriesByUsingRecursion(10-2);
	}
}
