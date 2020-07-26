package com.statics;

public class Derived extends BaseClass {
	 public static void display() { 
	        System.out.println("Non-static method from Derived"); 
	    } 
	      
	    // Static is added here (Causes Compiler Error)  
	    public  void print() { 
	        System.out.println("Static method from Derived"); 
	   } 
}
