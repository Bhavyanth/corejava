package com.basics.basic;

public class Increment {
	public static void main(String[] args) {
		int x = 20;
		/* post-increment operation (Increase value of x after operation */
		System.out.println(x++);
		System.out.println(x);
		/* pre-increment operation (increase value of x first and then add) */
		System.out.println(++x);
		System.out.println(x);
	}
}
