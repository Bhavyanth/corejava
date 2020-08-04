package com.dependency.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SetterMain {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext4.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee)factory.getBean("obj");
		employee.display();
	}
}
