package com.oops.inheritance;

public class PolygonMain {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Triangle tri = new Triangle();
		
		rect.setValues(10, 20);
		tri.setValues(30, 10);
		System.out.println("Area: "+ rect.area());
		System.out.println("Tri Area: "+ tri.area());
	}
}
