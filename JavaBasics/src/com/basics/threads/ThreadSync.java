package com.basics.threads;

public class ThreadSync {
	private static int count = 0;
	public static void main(String[] args) {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 10000; i++) {
					count++; // this operation is time taking, as count = count + 1
				}
				
			}
		});
		
		// Both the threads will share the count value (from t1 and t2)
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 0; i <= 10000; i++) {
					count++;
				}
			}
		});
		
		// T1 will start and print value of count before looping, similarly t2, but wont wait for other threads.
		
		t1.start();
		t2.start();
		
		try {
		// this join is used to pause the current thread execution until and unless the specified thread is dead
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		/**
		 * So when the two threads are executed, then only this statement will be executed
		 * 
		 * Output will be in order of closely to 10000.
		 * 
		 * But overall output should be close to 20000, as both threads are running upto 10000
		*/
		
		System.out.println("Value : "+ count); // printing from t1 and t2
	}
}
