package com.basics.strings;

public class Strings {
	public static void main(String[] args) {
		String string = "Hello World"; // declaring as a literal
		String s2 = new String("Hello World"); // declaring as an object
		
		
		System.out.println("Length: "+string.length()); // gives length of string
		System.out.println("Char at: "+string.charAt(2)); // getting a particular character at index
		System.out.println("Equals: "+string.equals(s2)); // comparing two strings
		System.out.println("IgnoreCase: "+string.equalsIgnoreCase("hello world")); // ignore case
		System.out.println("Index: "+string.indexOf('l')); // position of a character
		System.out.println("Index of: "+string.indexOf("lo")); // index of string
		System.out.println("Concat: "+string.concat(" Java")); // concatenating a string
		System.out.println("Substr: "+string.substring(3)); // take a part of the string
		System.out.println("Substr at index: "+string.substring(3,7)); // print from 3rd position to 7th position (7 is excluded)
		System.out.println("Replace: "+string.replace('l', 'x')); // replaces l with x
		System.out.println("Replace at index: "+string.replace("ll", "xx")); // replaces ll with xx
		System.out.println("Lower case: "+string.toLowerCase()); // converts to lower case
		System.out.println("Upper case: "+string.toUpperCase()); // converts to upper case
		
		
	}
}
