package com.basics.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenerics {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		Employee emp1 = new Employee(1,"Alex",45000);
		Employee emp2 = new Employee(2,"Tom",68000);
		Employee emp3 = new Employee(3,"Regina",33000);
		Employee emp4 = new Employee(4,"Bob",76000);
		Employee emp5 = new Employee(5,"Alice",50000);
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		for (Employee e : empList) {
			System.out.println(e);
		}
	}
}
