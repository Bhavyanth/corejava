package com.cocepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.EmployeeResource;

public class ResourceAnnotation {
	static BeanFactory factory = null;
	public static void main(String[] args) {
		ApplicationContext context =   
			    new ClassPathXmlApplicationContext("applicationContext.xml");  
		EmployeeResource a1 =(EmployeeResource) context.getBean("myemployee");
		//Byname
		System.out.println(a1.toString());
		
		
	}


}
