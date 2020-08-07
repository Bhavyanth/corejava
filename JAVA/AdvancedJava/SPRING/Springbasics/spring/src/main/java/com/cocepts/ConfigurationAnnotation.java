package com.cocepts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.pojo.Employee;

public class ConfigurationAnnotation {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		   
		   Employee emp1 = ctx.getBean(Employee.class);
		 System.out.println(emp1.get());
	}

}
