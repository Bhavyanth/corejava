package com.basics.arrays;

import java.util.Scanner;

public class OneDimensionalArray {
	/**
	 * Array is a reference data type
	 * Store multiple elements with same kind of data type
	 * data_type[] var_name = { , , , };
	 * data_type[] var_name = new data_type[3];
	 * data_type[] var_name = new data_type[]{ , , , };
	 * 
	 * int a[], c  -> a is array & c is variable
	 * int []b,x   -> both are array variables
	 */
	
	  /* Declaration of arrays in different ways
	    int [] arr = {1,2,3,4,5}; size is based on values given
		int [] arr1 = new int[3]; size initialized to default value in heap
		int [] arr2 = new int[]{1,2,3,4,5}; size is based on values given
	*/
	
	 /*public static void main(String[] args) {
		int [] arr = {77,35,48,93,27}; // index starts from 0
		System.out.println(arr[2]);
		
		//To print all values of unknown array size
		int i =0;
		while(i < arr.length){
			System.out.println(arr[i]);
			i++;
		}
	}*/
	
	/*public static void main(String[] args) {
		String names[] = new String[3];
		names[0] = new String("Tom");
		names[1]= "Alex";
		names[0] = new String("Teena");
		
		for(int x :names){
		System.out.println(names[i]);
		}
	}*/
	
	public static void main(String[] args) {
		int a[] = new int [5];
		System.out.println("Enter numbers");
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<a.length;i++)
			a[i]=scanner.nextInt();
		for(int i=0;i<a.length;i++)
			System.out.println(i+1 + " number is: "+a[i]);
		int sum = 0;
		for(int x : a)
			sum = sum + x;
			System.out.println("Sum is: "+ sum);
			scanner.close();
	}
	
	/**
	 * if printing array index is greater than length of array then
	 * java.lang.ArrayIndexOutOfBoundsException is thrown
	 */
}
