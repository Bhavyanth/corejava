package com.basics.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetGenerics {
	public static void main(String[] args) {
		Set<Employee> empList = new HashSet<Employee>();
		Employee emp1 = new Employee(1, "Alex", 45000);
		Employee emp2 = new Employee(2, "Tom", 68000);
		Employee emp3 = new Employee(3, "Regina", 33000);
		Employee emp4 = new Employee(4, "Bob", 76000);
		Employee emp5 = new Employee(5, "Alice", 50000);

		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);

		Employee emp6 = new Employee(5, "Alice", 50000); // override hashCode method for not adding this id

		Employee emp7 = emp1;
		empList.add(emp6);
		empList.add(emp7);

		for (Employee e : empList) {
			System.out.println(e);
		}
	}
}
