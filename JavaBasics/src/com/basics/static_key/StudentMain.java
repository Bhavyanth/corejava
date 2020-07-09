package com.basics.static_key;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		System.out.println(Student.noOfStudents); // can be called by class name
	}
}
