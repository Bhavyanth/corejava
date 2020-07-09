package com.basics.threads;

class MyClass extends Thread{ // for creating thread, it is necessary to extend thread class
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getId()+" Value "+i);
		}
		try {
			Thread.sleep(100); // pausing the thread
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} 
	}
}

public class Threads {
	public static void main(String[] args) {
		MyClass myClass = new MyClass(); // create an instance of thread
		myClass.start(); // this will call run method after creating a thread
		MyClass class1 = new MyClass();
		class1.start();
	}
}
