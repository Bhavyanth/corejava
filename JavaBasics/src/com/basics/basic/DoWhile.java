package com.basics.basic;

public class DoWhile {
	public static void main(String[] args) {
		int a = 0;
		int b = 00;
		// evaluates the condition & then executes the statement
		//System.out.println("in while loop");
		while (a <= -1) {
			System.out.println(a);
			a++;
		}
		System.out.println("in do-while loop");
	/* 	first executes the statement and then checks the condition
		Hence statement is executed atleast once*/
		do {
			System.out.println(b);
			b++;
		} while (b <= -1);
	}
}
