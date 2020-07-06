package com.basics.collections;

import java.util.ArrayList;

public class ArrayListImpl {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<>(5);
		arrayList.add(1);
		arrayList.add(4); // addition of element
		arrayList.add(34);
		arrayList.add(87);
		
		for (Integer i : arrayList) {
			System.out.println(i);
		}
		
		arrayList.size(); // size of array (Number of elements contained in the array not initialized size)
		arrayList.remove(2); // remove element based on index
		arrayList.clear(); // removes all the elements from list
		arrayList.set(2, 99); // setting value based on index
		arrayList.trimToSize(); // prints to size of array (Number of elements in array)
	}

}
