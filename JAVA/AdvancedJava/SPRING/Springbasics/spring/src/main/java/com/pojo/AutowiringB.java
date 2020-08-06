package com.pojo;

public class AutowiringB {
	
	AutowiringA  b; 
	
	public AutowiringB() {
		System.out.println("B create");
	}

	
	public AutowiringA getB() {
		return b;
	}


	public void setB(AutowiringA b) {
		this.b = b;
	}


	void print(){System.out.println("hello a");}  
	public void display(){  
	    print();  
	    b.print();  
	}  
}
