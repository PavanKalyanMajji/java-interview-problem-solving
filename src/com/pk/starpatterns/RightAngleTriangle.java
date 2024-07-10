package com.pk.starpatterns;
/**
 * 
 * Printing Stars in Right angle triangle.
 *
 */
public class RightAngleTriangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
		
//		Alternative Approach.
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 5; j >= i; j--)
				System.out.print("* ");
			System.out.println();
		}
	}
//	OutPut:-
	
//	* 
//	* * 
//	* * * 
//	* * * * 
//	* * * * *
}
