package com.basics.static_key;

public class Student {
	/** Access Levels
	 * Modifier		Class		Package		SubClass	  World
	 * 
	 * public		 	Y			Y			Y			Y
	 * protected		Y			Y			Y			N
	 * private			Y			N			N			N
	 * no modifier		Y			Y			N			N
	 */

	
	String name;
	int age;
	static int noOfStudents = 0; // this can be shared by instances
	
	Student() {
	noOfStudents++; // for incrementing student count
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
