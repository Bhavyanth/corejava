package com.basics.threads;

class MyClass1 implements Runnable{

	@Override
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

public class RunnableThread {
	/*public static void main(String[] args) {
		Thread t1 = new Thread(new MyClass1());
		Thread t2 = new Thread(new MyClass1());
		t1.start();
		t2.start();
	}*/
	
	/**
	 * Another way of creating thread
	 */
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable(){

			@Override
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
			
		} );
		t1.start();
	}
}
