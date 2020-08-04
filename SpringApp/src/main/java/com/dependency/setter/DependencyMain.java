package com.dependency.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class DependencyMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext5.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		EmployeeD employee = (EmployeeD)factory.getBean("obj");
		employee.displayInfo();

	}

}
