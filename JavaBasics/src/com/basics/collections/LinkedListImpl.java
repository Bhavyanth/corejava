package com.basics.collections;

import java.util.LinkedList;

public class LinkedListImpl {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Tom");
		linkedList.add("Alex"); // adding element to list
		linkedList.add("Mark");
		linkedList.add("John");
		linkedList.addFirst("Sony"); // add first element	
		linkedList.addLast("Jio"); // add last element
		linkedList.removeFirst();  // remove first element
		linkedList.removeLast();  // remove last element
		linkedList.size();  // gets size of list
		linkedList.clear();  // clears the list
		linkedList.add(2, "Index2"); // adding element at index
		linkedList.remove(4);   // removing element at index
		linkedList.set(3, "Tina"); // setting or replacing values  based on index
		
		for (String x : linkedList) {
			System.out.println(x);
		}
	}
}
