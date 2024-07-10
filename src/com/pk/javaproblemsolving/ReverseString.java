package com.pk.javaproblemsolving;
/**
 * 
 *Reverse the given String 
 *example:- "PavanKalyan" output:-naylaKnavap
 *
 */
public class ReverseString {
	public static void reverseTheString(String value) {
		for(int i=value.length()-1;i>=0;i--)
			System.out.print(value.charAt(i));
	}
	public static void main(String[] args) {
		reverseTheString("PavanKalyan");
	}
}
