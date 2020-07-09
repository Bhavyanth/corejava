package com.basics.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.omg.CORBA.PUBLIC_MEMBER;

public class Exceptions {
	public static void main(String[] args) {
		int a = 10, b = 0, c = 0;
		int result = divide(100, 10);
		result = divide(100, 0);
		int arr[] = new int[5];
		try {
			FileInputStream fis = new FileInputStream(new File(args[0]));
			try { // nested try block
				c = a / b; // posibility of arithmetic exception
				System.out.println("The result is: " + c);
			} catch (ArithmeticException e) {
				e.printStackTrace();
				System.out.println("Divide by zero");
			}
		} catch (FileNotFoundException fne) {
			System.out.println("File not found");
		} catch (ArrayIndexOutOfBoundsException f) {
			System.out.println("Array index out of bound");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
		/**
		 * Throwing exception manually
		 */
	public static int divide(int sum, int number) throws ArithmeticException{
		int quotient = -1;
		System.out.println("Division");
		try{
			if(number == 0){
				throw new ArithmeticException("Division attempt by 0");
			}
			quotient = sum/number;
		}
		finally{
			if(quotient != -1){
				System.out.println("In finally block");
				System.out.println("Result: "+ quotient);
			}else{
				System.out.println("Exception in finally block");
			}
		}
		return quotient;
	}
}
