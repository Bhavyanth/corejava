package com.basics.static_key;

public class StaticMain {
	/**
	 * Static member belong to the class instead of a specific instance
	 */
	public static void main(String[] args) {
		StaticClass class1 = new StaticClass();
	/**
	 * Being a static method, we cannot call a method with instance
	 * Instead call it by class name.
	 */
	//	class1.DoSomething("Static method"); // shows warning, as its a static method
		StaticClass.DoSomething("Static method"); // calling by class name
		class1.DoSomethingElse("Non Static method"); // called by instance of a class
	}

}
