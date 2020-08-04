package com.basics.strings;

public class Strings {
	public static void main(String[] args) {
		String string = "Hello World"; // declaring as a literal
		String s2 = new String("Hell World"); // declaring as an object
		
		// string.intern() points to the same reference of the string
		System.out.println("Length: "+string.length()); // gives length of string
		System.out.println("Char at: "+string.charAt(2)); // getting a particular character at index
		System.out.println("Equals: "+string.equals(s2)); // comparing two strings
		System.out.println("IgnoreCase: "+string.equalsIgnoreCase("Hello world")); // ignore case
		System.out.println("Index: "+string.indexOf('e')); // position of a character
		System.out.println("Index of: "+string.indexOf("loW")); // index of string
		System.out.println("Concat: "+string.concat(" Java")); // concatenating a string
		System.out.println("Substr: "+string.substring(3)); // take a part of the string
		System.out.println("Substr at index: "+string.substring(3,6)); // print from 3rd position to 6th position (6 is excluded)
		System.out.println("Replace: "+string.replace('l', 'x')); // replaces l with x
		System.out.println("ReplaceAll: "+string.replaceAll("Hello", "d"));
		System.out.println("Replace at index: "+string.replace("ll", "xx")); // replaces ll with xx
		System.out.println("Lower case: "+string.toLowerCase()); // converts to lower case
		System.out.println("Upper case: "+string.toUpperCase()); // converts to upper case
		
		
	}
}
