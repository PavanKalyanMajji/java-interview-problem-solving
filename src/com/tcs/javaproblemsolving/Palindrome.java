package com.tcs.javaproblemsolving;
/**
 * 
 *check given number is palindrome or not
 *example : 121 outPut: True
 *Explanation if you reverse the number which is equal to same as input number.
 *if you reverse the 121 output is 121 only.
 *if you reverse the 143 output is 341 not a palindrome.
 *
 */
public class Palindrome {
	public static boolean checkGivenNumberIsPalindrome(int target) {
		int input=target;
		int temp=0;
		while(target>0) {
			temp = temp*10+target%10;
			target/=10;
		}
		if(input==temp)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int target =121;
		System.out.println("Is "+target+" value is Palindrome.. "+checkGivenNumberIsPalindrome(target));
	}
}
