package hibernate.annotation.concepts;

import org.hibernate.Session;
import org.hibernate.Transaction;

import hibernatepractice.pojo.annotation.AccContract_Employee;
import hibernatepractice.pojo.annotation.AccEmployee;
import hibernatepractice.pojo.annotation.AccRegular_Employee;
import hibernatepractice.pojo.annotation.CngContract_Employee;
import hibernatepractice.pojo.annotation.CngEmployee;
import hibernatepractice.pojo.annotation.CngRegular_Employee;
import hibernatepractice.pojo.annotation.InfContract_Employee;
import hibernatepractice.pojo.annotation.InfEmployee;
import hibernatepractice.pojo.annotation.InfRegular_Employee;
import hibernateutil.HibernateUtilAnnotation;

public class Inheritence {
	
	public static void main(String[] args) {
		//tablperhier();
		//tableperconcrete();
		tablesudclss();
	}
	
	public static void tablperhier() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();
		Transaction t=session.beginTransaction();    
        
        AccEmployee e1=new AccEmployee();    
        e1.setName("Gaurav Chawla");    
            
        AccRegular_Employee e2=new AccRegular_Employee();    
        e2.setName("Vivek Kumar");    
        e2.setSalary(50000);    
        e2.setBonus(5);    
            
        AccContract_Employee e3=new AccContract_Employee();    
        e3.setName("Arjun Kumar");    
        e3.setPay_per_hour(1000);    
        e3.setContract_duration("15 hours");    
            
        session.persist(e1);    
        session.persist(e2);    
        session.persist(e3);    
            
        t.commit();    
        session.close();    
        System.out.println("success");  
		
	}
	
	public static void tableperconcrete() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();  
          
	        Transaction t=session.beginTransaction();  
	          
	        CngEmployee e1=new CngEmployee();  
	        e1.setName("Gaurav Chawla");  
	          
	        CngRegular_Employee e2=new CngRegular_Employee();  
	        e2.setName("Vivek Kumar");  
	        e2.setSalary(50000);  
	        e2.setBonus(5);  
	          
	        CngContract_Employee e3=new CngContract_Employee();  
	        e3.setName("Arjun Kumar");  
	        e3.setPay_per_hour(1000);  
	        e3.setContract_duration("15 hours");  
	          
	        session.persist(e1);  
	        session.persist(e2);  
	        session.persist(e3);  
	          
	        t.commit();  
	        session.close();  
	}
	
	public static void tablesudclss() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();
		 Transaction t=session.beginTransaction();    
         
         InfEmployee e1=new InfEmployee();    
         e1.setName("Gaurav Chawla");    
             
         InfRegular_Employee e2=new InfRegular_Employee();    
         e2.setName("Vivek Kumar");    
         e2.setSalary(50000);    
         e2.setBonus(5);    
             
         InfContract_Employee e3=new InfContract_Employee();    
         e3.setName("Arjun Kumar");    
         e3.setPay_per_hour(1000);    
         e3.setContract_duration("15 hours");    
             
         session.persist(e1);    
         session.persist(e2);    
         session.persist(e3);    
             
         t.commit();    
         session.close();    
	}

}
