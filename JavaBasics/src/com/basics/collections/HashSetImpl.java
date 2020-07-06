package com.basics.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetImpl {
	/*public static void main(String[] args) {
		Set list = new HashSet();
		list.add("Tom");
		list.add("Alex");
		list.add("Mark");
		list.add("John");
		for (Object o : list) {
			System.out.println(o);
		}
	}*/
	
	public static void main(String[] args) {
		Set list = new TreeSet();
		list.add("Tom");
		list.add("Alex");
		list.add("Mark");
		list.add("John");
		for (Object o : list) {
			System.out.println(o); // prints in ascending order
		}
	}
	
}
