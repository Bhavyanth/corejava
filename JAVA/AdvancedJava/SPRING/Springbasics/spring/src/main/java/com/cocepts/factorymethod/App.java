package com.cocepts.factorymethod;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.AutowiringB;

public class App {
	
	static BeanFactory factory = null;
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(resource);
		A a1 = (A) factory.getBean("af");
		
		PrintableA p = (PrintableA) factory.getBean("p");
		p.print();
		
		PrintableB p2 = (PrintableB) factory.getBean("pns");
		p2.print();
	}
}
