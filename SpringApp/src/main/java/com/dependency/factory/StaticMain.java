package com.dependency.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticMain {
	/**
	 *  inject the dependency by static factory method that returns the instance of another class
	 * @param args
	 */
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("AppContext.xml");  
		    Printable p=(Printable)context.getBean("p");  
		    p.print();  
	}
}
