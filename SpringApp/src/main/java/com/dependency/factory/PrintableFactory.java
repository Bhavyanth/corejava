package com.dependency.factory;

public class PrintableFactory {
	public static Printable getPrintable(){
		return new ClassA();
	}
}
