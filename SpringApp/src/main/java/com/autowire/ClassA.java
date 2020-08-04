package com.autowire;

public class ClassA {
	ClassB classB;

	public ClassA() {
		System.out.println("ClassA is created");
	}

	public ClassB getB() {
		return classB;
	}

	public void setB(ClassB classB) {
		this.classB = classB;
	}

	void print() {
		System.out.println("Hello ClassA");
	}

	void display() {
		print();
		classB.print();
	}
}
