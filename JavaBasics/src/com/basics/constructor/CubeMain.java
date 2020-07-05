package com.basics.constructor;

public class CubeMain {
	public static void main(String[] args) {

		// Upon initializing, first method called is the default constructor
		Cube cube = new Cube();
		System.out.println(cube.getVolume());
		
		Cube cube1 = new Cube(20,30,40);
		System.out.println(cube1.getVolume());
	}
}
