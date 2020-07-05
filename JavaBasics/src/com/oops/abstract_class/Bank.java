package com.oops.abstract_class;

abstract public class Bank {
	/**
	 * Super class
	 * Bank is serving its functionalities to its sub classes.
	 * When we don't want a make an instance of a class, we declare it abstract
	 * 
	 * If we want to make method abstract, make the class also abstract, and remove instantiator
	 * from the method
	 * 
	 * Then we need to give implementation of this method in sub classes
	 * 
	 * Opposite of Abstract class is Concrete
	 */
	abstract int getRateOfInterest();
}
