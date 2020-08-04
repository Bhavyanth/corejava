package com.inherit.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class InheritMain {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("ApplicationContext3.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		Employee employee = (Employee) factory.getBean("e2");
		employee.show();

	}

}
