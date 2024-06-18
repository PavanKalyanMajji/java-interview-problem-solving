package com.tcs.javaproblemsolving;
/**
 * 
 *Swap Two numbers 
 *Example: x=10 , y=20
 *OutPut: x=20 , y=10
 *
 */
public class SwapTwoNumbers {
	public static void swapTwoNumbersByUsingTemp(int x, int y) {
		System.out.println("x value before swap: " + x + " and y value before swap: " + y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x value after swap: " + x + " and y value after swap: " + y);
	}

	public static void swapTwoNumbersByUsingArithmeticOperators(int x, int y) {
		System.out.println("x value before swap: " + x + " and y value before swap: " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x value after swap: " + x + " and y value after swap: " + y);
	}
	public static void swapTwoNumbersByUsingArithmeticOperator(int x, int y) {
		System.out.println("x value before swap: " + x + " and y value before swap: " + y);
		x = x * y;
		y = x / y;
		x = x / y;
		System.out.println("x value after swap: " + x + " and y value after swap: " + y);
	}
	public static void swapTwoNumbersByUsingXorOperator(int x, int y) {
		System.out.println("x value before swap: " + x + " and y value before swap: " + y);
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("x value after swap: " + x + " and y value after swap: " + y);
	}
	public static void main(String[] args) {
//		Input values
		int x = 10, y = 20;

		// By using temp variable
		swapTwoNumbersByUsingTemp(x, y);

		// By using Arithmetic Operator's
		swapTwoNumbersByUsingArithmeticOperators(x, y);
		
		// By using Arithmetic Operator
		swapTwoNumbersByUsingArithmeticOperator(x, y);
		
		// By using X-or(^) Operator
		swapTwoNumbersByUsingXorOperator(x, y);
	}
}
