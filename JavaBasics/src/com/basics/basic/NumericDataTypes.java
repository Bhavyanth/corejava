package com.basics.basic;

public class NumericDataTypes {
	
 /**
  * byte (number, 1 byte)
  * short (number, 2 byte)
  * int (number, 4 byte)
  * long (number, 8 byte)
  * float (float, 4 byte)
  * double (double, 8 byte)
  * char (character, 2 byte)
  * boolean (true/false, 1 byte)
  */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
	short x= 10;
	
	/**
	 * Lower size data type can be assigned to higher size data type automatically
	 * called as Implicit conversion
	 * 
	 * Casting is the process of converting the value to different type than its source
	 * Explicit conversion
	 * 
	 * 9.8 can be considered as double (as 8 bytes), hence we convert to float
	 */
	float y = (float)9.8;  // Explicit 
	double z = 17.9;
	char a = 'B';
	boolean b = false;
	System.out.println("");
}
}
