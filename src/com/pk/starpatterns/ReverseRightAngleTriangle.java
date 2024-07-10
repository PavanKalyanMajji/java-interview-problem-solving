package com.pk.starpatterns;
/**
 * 
 * printing Reverse Right angel triangle.
 *
 */
public class ReverseRightAngleTriangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--)
				System.out.print("* ");
			System.out.println();
		}
		
//		Alternate Approach.
		
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print("* ");
			System.out.println();
		}
	}
//	OutPut:-
	
//	* * * * * 
//	* * * * 
//	* * * 
//	* * 
//	*
}
