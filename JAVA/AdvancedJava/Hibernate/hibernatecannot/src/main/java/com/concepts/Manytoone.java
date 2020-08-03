package com.concepts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Address;
import com.pojo.Answer;
import com.pojo.Employee;
import com.pojo.Question;

import hibernateutil.HibernateUtilAnnotation;

public class Manytoone {
	
	public static void main(String[] args) {
		//save();
		load();
	}
	
	public static void save() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();	
	      
	    Transaction t=session.beginTransaction();    
	        
	    Employee e1=new Employee();    
	    e1.setName("Ravi Malik");    
	    e1.setEmail("ravi@gmail.com");    
	      
	    Employee e2=new Employee();  
	    e2.setName("Anuj Verma");  
	    e2.setEmail("anuj@gmail.com");  
	        
	    Address address1=new Address();    
	    address1.setAddressLine1("G-13,Sector 3");    
	    address1.setCity("Noida");    
	    address1.setState("UP");    
	    address1.setCountry("India");    
	    address1.setPincode(201301);    
	        
	    e1.setAddress(address1);    
	    e2.setAddress(address1);  
	  
	    session.persist(e1);    
	    session.persist(e2);  
	    t.commit();    
	        
	    session.close();    
	    HibernateUtilAnnotation.shutdown();
	}
	
	public static void load() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();
		Query query = session.createQuery("from Employee e");
		List l = query.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			Employee p = (Employee) o;
			System.out.println("Question email : " + p.getEmail());
			System.out.println("Question id : " + p.getEmployeeId());
			System.out.println("----------------------");
			Address address=p.getAddress();    
		     System.out.println(address.getAddressLine1()+" "+address.getCity()+" "+    
		        address.getState()+" "+address.getCountry()+" "+address.getPincode());    
		}
		
		    session.close();    
		    HibernateUtilAnnotation.shutdown();
	}

}
