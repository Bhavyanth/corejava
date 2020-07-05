package com.basics.methods;

public class Student {
		private int id;
		private String name;
		private int age;
		
	/**
	 * getters and setters are used for variables that are 
	 * not to be accessed directly
	 * 
	 * This is called encapsulation
	 * 
	 * alt + shift + s and type r -> to generate getters and setters
	 */
	 
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
