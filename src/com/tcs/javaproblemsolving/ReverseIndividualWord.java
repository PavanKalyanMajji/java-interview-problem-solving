package com.tcs.javaproblemsolving;

import java.util.Stack;
/**
 * 
 *Reverse Individual Word
 *example1: Hi Good Morning
 *output: iH dooG gninroM
 *
 */
public class ReverseIndividualWord {
//	Hi MyName is pavan kalyan
	public static void reverseIndividualWord(String word) {
		Stack<Character> stack =new Stack<>();
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i) !=' ') {
				stack.push(word.charAt(i));
			} else {
				if(word.charAt(i)==' ')
					stack.push(word.charAt(i));
				while (stack.empty()==false) {
					System.out.print(stack.pop());	
				}
			}
		}
		
		while (stack.empty()==false) {
			System.out.print(stack.pop());	
		}
	}
	
	public static void reverseIndividualWordSecondApproch(String word) { 
		int temp=-1,firstIndex=0,lastIndex=0,firstSpace=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)==' ' || word.length()-1==i) {
				firstSpace+=1;
				lastIndex=i;
				firstIndex=temp;
				temp = lastIndex;
				if(firstSpace ==1) {
					lastIndex-=1;
				}
				while(lastIndex>firstIndex) {
					if(word.length()-1==lastIndex) {
						System.out.print(" ");
					}
					System.out.print(word.charAt(lastIndex));
					lastIndex-=1;
				}
			}
		}
	}
	public static void main(String[] args) {
//		reverseIndividualWord("Hi My Name is Pavan kalyan");
//		System.out.println();
		reverseIndividualWordSecondApproch("Hi Good Morning have a nice day");
	}
}
