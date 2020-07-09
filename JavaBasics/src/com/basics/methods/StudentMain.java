package com.basics.methods;

public class StudentMain {
	public static void main(String[] args) {
		Student student = new Student();
		
		student.setId(1);
		student.setName("Tom");
		student.setAge(23);
		System.out.println(student.getName()+" is of age " +student.getAge());
		
	}
}
