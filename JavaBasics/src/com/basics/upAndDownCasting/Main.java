package com.basics.upAndDownCasting;

public class Main {
	public static void main(String[] args) {

	Parent p = new Parent();
	Child c = new Child();
	Parent pc = new Child(); // upcasting
	
	Child cp = (Child) new Parent();
	}
}
