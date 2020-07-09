package com.basics.collections;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetGenerics {
	/**
	 * need to implement comparable for sorting 
	 * Else throws ClassCastException
	 */
	public static void main(String[] args) {
		Set<Employee> empList = new TreeSet<Employee>();
		Employee emp1 = new Employee(1, "Alex", 45000);
		Employee emp4 = new Employee(4, "Bob", 76000);
		Employee emp2 = new Employee(2, "Tom", 68000);
		Employee emp3 = new Employee(3, "Regina", 33000);
		Employee emp5 = new Employee(5, "Alice", 50000);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		Employee emp6 = new Employee(5, "Alice", 50000); 
		Employee emp7 = emp1;
		empList.add(emp6);
		empList.add(emp7);
		
		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}
}
