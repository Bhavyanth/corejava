package com.cocepts.factorymethod;

public class PrintableFactory {
		public static Printable getPrintable(){  
		    //return new B();  
		          return new PrintableA();//return any one instance, either A or B  
		}  
		
		public Printable getPrintableObj(){  
		    return new PrintableB();//return any one instance, either A or B  
		}  
}
