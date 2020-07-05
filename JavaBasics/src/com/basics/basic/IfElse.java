package com.basics.basic;

import java.util.Scanner;

public class IfElse {
	/**
	 * if (expression 2){
	 * 		if(expression 2){
	 *    execute if expression is true
	 * }else{
	 * 		false part of condition 2
	 * }
	 * }else{
	 * 		false part of condition 1
	 * }
	 * 
	 * == is equal
	 * != not equal
	 * > greater than
	 * < less than
	 * >= greater than or equal to
	 * <= less than or euqal to
	 */
	public static void main(String[] args) {
		int age = 20;
		if (age <= 19) {
			if (age >= 13) {
				System.out.println("Teen age");
			} else {
				System.out.println("Child");
			}
		} else {
			System.out.println("Adult");
		}
	}
	
	/**
	 * else if block
	 */
	/*public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int mark =0;
		mark = scanner.nextInt();
		char grade = ' ';
		if(mark > 90)
			grade = 'A';
		else if(mark >80)
			grade = 'B';
		else if(mark > 60)
			grade = 'C';
		else if(mark >= 40)
			grade = 'D';
		else (mark < 40)
			grade = 'F';
		System.out.println("Mark is "+mark +" grade is "+grade);
		scanner.close();
	}*/
}
