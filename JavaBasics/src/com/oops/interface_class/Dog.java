package com.oops.interface_class;

public class Dog implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Dogs barks");
	}

	@Override
	public void sleep() {
		
		System.out.println("Dog sleeps");
	}

}
