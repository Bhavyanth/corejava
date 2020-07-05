package com.basics.methods;

import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		/**
		 * access_modifier return_type method_name (){} 
		 */
		//Scanner scanner = new Scanner(System.in);
		int sum =  Add(10,20); // type should be same as return type
		System.out.println(sum);
	}
	public static int Add (int a, int b){ // methods outside the main method
		//System.out.println(a+b);
		return (a+b); // return statement
	}
}
