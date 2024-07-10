package com.pk.javaproblemsolving;
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
	static int input;
	static int temp=0;
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
/**
 * By Using Recursion.	
 * @param target
 * @return
 */
	public static boolean checkGivenNumberIsPalindromeRecursion(int target) {
		if(target>0) {
			temp=temp*10+target%10;
			checkGivenNumberIsPalindromeRecursion(target/10);
		}
		if(input==temp)
			return true;
		return false;
	}
	public static void main(String[] args) {
		int target =121;
		System.out.println("Is "+target+" value is Palindrome.. "+checkGivenNumberIsPalindrome(target));
		input=target;
		System.out.println("Is "+target+" value is Palindrome.. "+checkGivenNumberIsPalindromeRecursion(target));
	}
}
