package com.oops.abstract_class;

public class MainClass {
	
	public static void main(String[] args) {
		// Bank a = new Bank(); // we cannot create an object from abstract class
		/**
		 * But we can create object with its sub classes
		 */
		Bank bank = new Bank_A();
		
	}
}
