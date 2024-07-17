package com.pk.javaproblemsolving;
/**
 * 
 * Check is given Number(target) is prime or Not. 
 *
 */
public class CheckGivenNumPrimeOrNot {
	public static boolean checkPrimeNumberOrNot(int target) {
		for(int j=2; j<= target/2 ; j++) {
			if(target%j ==0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int target = 37;
		boolean isPrimeNumber= checkPrimeNumberOrNot(target);
		
		if(isPrimeNumber)
			System.out.println(target +" is a prime number");
		else 
			System.out.println(target+" is not a prime number");
	}
}
