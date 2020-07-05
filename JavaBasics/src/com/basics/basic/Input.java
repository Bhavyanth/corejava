package com.basics.basic;

import java.util.Scanner;

public class Input {
	/**
	 * Scanner class
	 * 
	 * .nextByte()
	 * .nextInt()
	 * .next(Pattern pattern)
	 * .next(String pattern)
	 * .nextBigDecimal()
	 * .nextBigInteger()
	 * .nextBigInteger(int radix)
	 * .nextBoolean()
	 * .nextByte(int radix)
	 * .nextDouble()
	 * .nextLine()
	 * .nextLong()
	 * .nextShort()
	 * .remove()
	 * .radix()
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter integer");
		int x = scanner.nextInt();
		System.out.println("Entered integer is " + x);
		System.out.println("Enter double");
		double y = scanner.nextDouble();
		System.out.println("Entered double is " + y);
		System.out.println("Enter String");
		String z = scanner.nextLine();
		System.out.println("Entered String is "+z );
		scanner.close();
		
	}
}
