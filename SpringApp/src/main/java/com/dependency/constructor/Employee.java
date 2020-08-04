package com.dependency.constructor;

public class Employee {
	private int id;
	private String name;
	private Address address; // this is aggregation

	public Employee() {
		System.out.println("dependency injection using construct");
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id) {
		this.id = id;
	}

	public Employee(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void show(){
		System.out.println(id+" "+name);
		System.out.println(address.toString());
	}

}
