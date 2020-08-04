package com.dependency.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class EmployeeMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext1.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee)factory.getBean("e");
		employee.show();
	}
}
