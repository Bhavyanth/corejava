package com.basics.exceptions;

import java.io.IOException;

public class CheckException {
	public static void main(String[] args) throws IOException {
		m1();
	}
	public static void m1() throws IOException {
		m2();
	}
	public static void m2() throws IOException {
		m3();
	}
	public static void m3() throws IOException {
		throw new IOException();
	}
}
