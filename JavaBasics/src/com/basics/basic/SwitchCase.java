package com.basics.basic;

import java.util.Scanner;


public class SwitchCase {

	public static void main(String[] args) {
		
		/**
		 * switch (parameter){
		 * case 1:
		 * break;
		 * case 2:
		 * break;
		 * default:
		 * }
		 */
		System.out.println("Enter number of day: ");
		Scanner scanner = new Scanner(System.in);
		int day =scanner.nextInt();
		String dayName=null;
		switch(day){
		case 1: dayName="Sunday"; break;
		case 2: dayName="Monday"; break;
		case 3: dayName="Tuesday"; break;
		case 4: dayName="Wednesday"; break;
		case 5: dayName="Thursday"; break;
		case 6: dayName="Friday"; break;
		case 7: dayName="Saturday"; break;
		default: dayName ="Invalid";
		}
		System.out.println("Day is "+day+" & day name is "+ dayName);
		scanner.close();
	}
}
