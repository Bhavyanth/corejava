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
		/*Bank a = new Bank_A(); // object a of Bank class is having form of Bank_A
		Bank b = new Bank_B(); // object b of Bank class is having form of Bank_B
		Bank c = new Bank_C(); // object c of Bank class is having form of Bank_C
*/		
		Bank bank1 = new Bank_A();
		Bank bank2 = new Bank_B();
		Bank bank3 = new Bank_C();
		
		System.out.println("Bank_A rate of interest is: "+bank1.getRateOfInterest()); 
		System.out.println("Bank_B rate of interest is: "+bank2.getRateOfInterest());
		System.out.println("Bank_C rate of interest is: "+bank3.getRateOfInterest());
	}
}
