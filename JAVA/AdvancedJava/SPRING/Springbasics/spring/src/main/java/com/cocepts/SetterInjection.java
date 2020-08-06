package com.cocepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Employee;
import com.pojo.Question;

public class SetterInjection {
	
	static BeanFactory factory = null;

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(resource);
		/*
		 * primitive(); dependentObj(); list(); listDepObj(); map(); mapdepobj();
		 */
		//primitive();
		//dependentObj();
		//list();
		//listDepObj();
		//map();
		mapdepobj();
	}

	public static void primitive() {

		Employee emp1 = (Employee) factory.getBean("emps1");
		emp1.show();

		
	}

	public static void dependentObj() {
		Employee emp1 = (Employee) factory.getBean("emps2");
		emp1.show();
	}
	
	public static void list() {
		Question q1 = (Question) factory.getBean("qs1");
		q1.displayInfo();
	}
	
	public static void listDepObj() {
		Question q1 = (Question) factory.getBean("qs2");
		q1.displayInfoobj();
	}
	
	public static void map() {
		Question q1 = (Question) factory.getBean("qs3");
		q1.displayInfoMap();
	}
	

	public static void mapdepobj() {
		Question q1 = (Question) factory.getBean("qs4");
		q1.displayInfoMapoj();
	}


}
