package com.basics.basic;

public class WhileLoop {
	public static void main(String[] args) {
		/**
		 * while (condition){
		 *  execute
		 * }
		 * 
		 * Used when number of iterations are not known
		 * 
		 */
		int a = 0;
		int b = 10;
		
	while ( a < 10){
		System.out.println(a); // executes until the condition is false
		a++;
	}
	while (b >=0){
		System.out.println(b);
		b--;
	}
	}
}
