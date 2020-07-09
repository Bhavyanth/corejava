package com.basics.collections;

public class Employee implements Comparable{
	private int id;
	private String name;
	private float salary;
	
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
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
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [Id=" + id + ", Name=" + name + ", Salary=" + salary + "]";
	}
	
	public int hashCode() {
		return id%3;
	}
	public boolean equals(Object o) {
		Employee e = (Employee) o; // downcasting the object
		if(this.id == e.id)
			return true;
		else 
			return false;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if(this.id == emp.id)
		return 0;
		else if (this.id>emp.id)
			return 1;
		else 
			return -1;
	}
	
}
