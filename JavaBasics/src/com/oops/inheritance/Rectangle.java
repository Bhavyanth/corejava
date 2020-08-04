package com.oops.inheritance;

public class Rectangle extends Polygon { // we are inheriting properties of polygon
	/**
	 * Since this a sub class, all protected members of 
	 * parent class can be accessible
	 * 
	 * but when they are private, we cannot access in subclass
	 */
	
	public double area() {
		return (height*width);
	}
	/*public double area() {
		return (height*width);
*/	//}
}
