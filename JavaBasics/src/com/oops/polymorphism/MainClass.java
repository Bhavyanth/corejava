package com.oops.polymorphism;

public class MainClass {
	/**
	 * Ability of an object to have different forms
	 * Point the reference of a base class to any sub class called as upcasting
	 * 
	 * Objects are from same class, but exhibiting different forms
	 * Reference of Bank class is pointing to object of different Banks
	 */
	public static void main(String[] args) {
		Bank a = new Bank_A(); // object a of Bank class is having form of Bank_A
		Bank b = new Bank_B(); // object b of Bank class is having form of Bank_B
		Bank c = new Bank_C(); // object c of Bank class is having form of Bank_C
		
		System.out.println("Bank_A rate of interest is: "+a.getRateOfInterest()); 
		System.out.println("Bank_B rate of interest is: "+b.getRateOfInterest());
		System.out.println("Bank_C rate of interest is: "+c.getRateOfInterest());
	}
}
