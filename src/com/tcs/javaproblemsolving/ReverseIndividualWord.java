package com.tcs.javaproblemsolving;

import java.util.Stack;

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
	public static void main(String[] args) {
		reverseIndividualWord("Hi My Name is Pavan kalyan");
	}
}
