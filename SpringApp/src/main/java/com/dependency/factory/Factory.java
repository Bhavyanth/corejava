package com.dependency.factory;

public class Factory {
	/**
	 * factory-method: represents the factory method that will be invoked to inject the bean.
	 * factory-bean: represents the reference of the bean by which factory method will be invoked. It is used if factory method is non-static.
	 * 
	 * A method that returns instance of a class is called factory method.
	 */
	public static final Factory object = new Factory();
	private Factory() {
		System.out.println("Private constructor");
	}
	public static Factory getFactory(){
		System.out.println("Factory method");
		return object;
	}
	public void msg(){
		System.out.println("Hello user");
	}
}
