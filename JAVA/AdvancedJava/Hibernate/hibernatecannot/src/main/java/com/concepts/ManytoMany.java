package com.concepts;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Answer;
import com.pojo.MMAnswer;
import com.pojo.MMQuestion;

import hibernateutil.HibernateUtilAnnotation;

public class ManytoMany {
	
	public static void main(String[] args) {
		
		save();
		
	}
	
	public static void save() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();
		    Transaction t=session.beginTransaction();      
		          
		    MMAnswer an1=new MMAnswer();  
		    an1.setAnswername("Java is a programming language");  
		    an1.setPostedBy("Ravi Malik");  
		      
		    MMAnswer an2=new MMAnswer();  
		    an2.setAnswername("Java is a platform");  
		    an2.setPostedBy("Sudhir Kumar");  
		     
		    MMQuestion q1=new MMQuestion();  
		    q1.setQname("What is Java?");  
		    ArrayList<MMAnswer> l1=new ArrayList<MMAnswer>();  
		    l1.add(an1);  
		    l1.add(an2);  
		    q1.setAnswers(l1);  
		      
		      
		      MMAnswer ans3=new MMAnswer();    
		        ans3.setAnswername("Servlet is an Interface");    
		        ans3.setPostedBy("Jai Kumar");    
		            
		        MMAnswer ans4=new MMAnswer();    
		        ans4.setAnswername("Servlet is an API");    
		        ans4.setPostedBy("Arun");    
		      
		   MMQuestion q2=new MMQuestion();  
		    q2.setQname("What is Servlet?");  
		    ArrayList<MMAnswer> l2=new ArrayList<MMAnswer>();  
		    l2.add(ans3);  
		    l2.add(ans4);  
		    q2.setAnswers(l2);  
		      
		    session.persist(q1);    
		    session.persist(q2);    
		        
		    t.commit();    
		    session.close();    
	}

	
	 public static void load() {
		 
	 }
}
