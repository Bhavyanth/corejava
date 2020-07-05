package com.basics.static_key;

public class StaticClass {
	public static String DoSomething(String msg) { // static
		System.out.println(msg);
		return msg;
	}
	
	public  String DoSomethingElse(String msg) { // non static
		System.out.println(msg);
		return msg;
	}
}
