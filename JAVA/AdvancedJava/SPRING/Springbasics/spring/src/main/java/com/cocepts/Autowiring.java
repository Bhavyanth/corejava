package com.cocepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.AutowiringB;
import com.pojo.Employee;

public class Autowiring {
	
	static BeanFactory factory = null;
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(resource);
		//Byname
		AutowiringB a1 = (AutowiringB) factory.getBean("a");
		a1.display();
		
		System.out.println("by Type");
		//by Type
		AutowiringB a2 = (AutowiringB) factory.getBean("a1");
		a2.display();
		
		
		System.out.println("No Autowire");
		AutowiringB a3 = (AutowiringB) factory.getBean("a2");
		a3.display();
	}

}
