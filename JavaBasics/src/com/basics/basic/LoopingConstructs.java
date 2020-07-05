package com.basics.basic;

import java.util.Scanner;

public class LoopingConstructs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for(int i=0;i<=5;i++){
			int num = scanner.nextInt();
			sum += num;  // equivalent to ->1 sum = sum + number
			if(num > 20) 
				// it stops the iteration and comes out of loop
				break; 
				/*Skips rest of the statement which are below the loop and 
					continue the loop with next iteration*/
				//continue;
			System.out.println("Number is "+ num);
		}
		System.out.println("Sum is "+sum);
	scanner.close();
	}
}
