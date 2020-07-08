package com.designpatterns.transferobjectpattern;

public class TransferObjectPatternDemo { 
	public static void main(String[] args) { 
		StudentBO studentBusinessObject = new StudentBO(); 
		//print all students 
		for (StudentVO student : studentBusinessObject.getAllStudents()) { 
			System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]"); } 
		
		//update student 
		StudentVO student =studentBusinessObject.getStudent(0); 
		student.setName("Michael"); 
		studentBusinessObject.updateStudent(student); 
		
		//get the student 
		studentBusinessObject.getStudent(0); 
		System.out.println("Student: [RollNo : " +student.getRollNo()+", Name : "+student.getName()+" ]");
		
		//deleting from the database
		studentBusinessObject.deleteStudent(student);
		} 
	}
