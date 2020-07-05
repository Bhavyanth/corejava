package com.basics.constructor;

public class Cube {
	private int length;
	private int breadth;
	private int height;
	
	public int getVolume() {
		return (length*breadth*height);
	}
	
	/**
	 *Constructor with no args 
	 */
	 Cube() {
	System.out.println("In constructor");
	length = 10;
	breadth = 20;
	height = 30;
	}
	 
	/**
	 * Constructor with different args
	 * Name of constructor can be same provided the parameters passed are different
	 */
	 
	 Cube(int l, int b, int h){
		 length = l;
		 breadth = b;
		 height = h;
	 }
}
