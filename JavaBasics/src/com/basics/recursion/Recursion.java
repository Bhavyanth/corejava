package com.basics.recursion;

public class Recursion {
	/**
	 * When we a call a method, in the method itself, its called recursion
	 * Method calls itself continuously
	 */
	// For factorial
/*	public static int factorial(int N) {
		if (N <= 1) {
			return 1;
		} else {
			return (N * factorial(N - 1)); // we are using factorial method
											// inside its factorial method
		}
	}*/

	// Fibonacci Series
	static int a = 0, b = 1, c = 0;

	public static void printFibo(int count) {

		if (count > 0) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(" " + c);
			printFibo(count - 1); // method calling itself continuously
		}
	}

	public static void main(String[] args) {
		// System.out.println("Factorial: "+factorial(5));
		int count = 15;
		System.out.print(a + " " + b);// printing 0 and 1
		printFibo(count - 2);// n-2 because 2 numbers are already printed

	}

}
