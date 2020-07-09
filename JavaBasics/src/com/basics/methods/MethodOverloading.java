package com.basics.methods;

public class MethodOverloading {
	/**
	 * We can define methods with same name but with different data types
	 * Perform same operations logically
	 */
	
	public static void main(String[] args) {
		System.out.println(Add(2,5));
		System.out.println(Add(5.676,34.98));
		System.out.println(Add("hello","world"));
	}
	public static int  Add(int a, int b) {
		return(a+b);
	}
	
	public static double  Add(double a, double b) {
		return(a+b);
	}
	
	public static String  Add(String a, String b) {
		return(a+b);
	}
}
