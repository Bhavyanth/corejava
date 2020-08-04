package com.oops.inheritance;

public class Polygon {
	/**
	 * Classes in java can be extended
	 * We can create new sub classes which can retain the 
	 * characteristics of the base or parent class
	 * 
	 * Subclass should be in same package
	 * 
	 * Classes having is-a relationship
	 * Ex: Rectangle is-a polygon & Triangle is-a polygon
	 * 
	 * Common features of all polygon can be declared here
	 */
	
	// Method :  modifier return type methodName(Paramters)
	protected int height;
	protected int width;
	public void setValues(int a, int b) {
		height =a;
		width = b;
	}
	
}
