package com.oops.inheritance;

public class PolygonMain {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Triangle triangle = new Triangle();
		
		rectangle.setValues(10, 45);
		triangle.setValues(10, 20);
		System.out.println("Area of rectangle: "+rectangle.area());
		System.out.println("Area of triangle: "+triangle.area());
	}
}
