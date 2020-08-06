package com.cocepts;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.pojo.Address;
import com.pojo.Employee;
import com.pojo.Question;

public class ConstructorInjection {

	static BeanFactory factory = null;

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		factory = new XmlBeanFactory(resource);
		/*
		 * primitive(); dependentObj(); list(); listDepObj(); map(); mapdepobj();
		 */
		inheritence();
	}

	public static void primitive() {

		Employee emp1 = (Employee) factory.getBean("emp1");
		emp1.show();

		Employee emp2 = (Employee) factory.getBean("emp2");
		emp2.show();

		Employee emp3 = (Employee) factory.getBean("emp3");
		emp3.show();
	}

	public static void dependentObj() {
		Address add1 = (Address) factory.getBean("add1");
		// System.out.println(add1.toString());

		Employee emp1 = (Employee) factory.getBean("emp5");
		emp1.show();
	}

	public static void list() {

		Question q1 = (Question) factory.getBean("q1");
		q1.displayInfo();
	}

	public static void listDepObj() {

		Question q1 = (Question) factory.getBean("q2");
		q1.displayInfoobj();
	}

	public static void map() {

		Question q1 = (Question) factory.getBean("q3");
		q1.displayInfoMap();
	}

	public static void mapdepobj() {

		Question q1 = (Question) factory.getBean("q4");
		q1.displayInfoMapoj();
	}
	
	public static void inheritence() {

		Employee q1 = (Employee) factory.getBean("emp7");
		q1.show();
	}

}
