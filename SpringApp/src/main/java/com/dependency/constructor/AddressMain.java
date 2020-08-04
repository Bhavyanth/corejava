package com.dependency.constructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AddressMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext2.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee)factory.getBean("e");
		employee.show();

	}

}
