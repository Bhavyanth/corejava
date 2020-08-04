package com.dependency.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext7.xml");
		Factory factory = (Factory)context.getBean("a");
		factory.msg();
	}
}
