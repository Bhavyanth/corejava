package com.basics.basic;

import java.util.Scanner;

@SuppressWarnings("unused")
public class MathAndArithmetic {
 public static void main(String[] args) {
	int x, y, add, subtract, multiply, divide, modulus;
	/*Scanner scanner =  new Scanner(System.in);
	System.out.println("Enter two values: ");
	x=scanner.nextInt();
	y=scanner.nextInt();*/ // For user input
	x=70;
	y=50;
	add= x+ y;
	subtract = x-y;
	multiply = x* y;
	divide = x/y; // gives the quotient
	modulus = x%y; // gives the remainder
	System.out.println("Addition: "+add);
	System.out.println("Subtraction: "+subtract);
	System.out.println("Multiplication: "+multiply);
	System.out.println("Division: "+divide);
	System.out.println("Modulus: "+modulus);
}
}
