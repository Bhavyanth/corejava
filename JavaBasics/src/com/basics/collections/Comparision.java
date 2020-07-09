package com.basics.collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Comparision {
	public static void main(String[] args) {
		long n = (long)1E7 ; // 10 ^ 7 elements
		ArrayList<Integer> arrayList = new ArrayList<>();
		long milis = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			arrayList.add(i);
		}
		System.out.println("Array List insertion takes: "+(System.currentTimeMillis()-milis)+" ms");
	
		LinkedList<Integer> linkedList = new LinkedList<>();
		 milis = System.currentTimeMillis();
		for (int i = 0; i < n; i++) {
			linkedList.add(i);
		}
		System.out.println("Linked List insertion takes: "+(System.currentTimeMillis()-milis)+" ms");
		
		milis= System.currentTimeMillis();
		arrayList.remove(0);
		System.out.println("Delete front Array List takes: "+(System.currentTimeMillis()-milis)+" ms");
		
		milis= System.currentTimeMillis();
		linkedList.remove(0);
		System.out.println("Delete front Linked List takes: "+(System.currentTimeMillis()-milis)+" ms");
		
		milis= System.currentTimeMillis();
		arrayList.get((int)n/2);
		System.out.println("Get front Array List takes: "+(System.currentTimeMillis()-milis)+" ms");
		
		milis= System.currentTimeMillis();
		linkedList.get((int)n/2);
		System.out.println("Get front Linked List takes: "+(System.currentTimeMillis()-milis)+" ms");
		
	}
}
