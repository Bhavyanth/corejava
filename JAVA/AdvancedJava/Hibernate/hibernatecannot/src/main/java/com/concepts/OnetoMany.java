package com.concepts;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.Answer;
import com.pojo.Question;

import hibernateutil.HibernateUtilAnnotation;

public class OnetoMany {
	
	
	public static void main(String[] args) {
		//save();
		load();
		
	}
	public static void save() {
		
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();	
	      
	    Transaction t=session.beginTransaction();    
	        
	    Answer ans1=new Answer();    
	    ans1.setAnswername("Java is a programming language");    
	    ans1.setPostedBy("Ravi Malik");    
	        
	    Answer ans2=new Answer();    
	    ans2.setAnswername("Java is a platform");    
	    ans2.setPostedBy("Sudhir Kumar");    
	        
	    Answer ans3=new Answer();    
	    ans3.setAnswername("Servlet is an Interface");    
	    ans3.setPostedBy("Jai Kumar");    
	        
	    Answer ans4=new Answer();    
	    ans4.setAnswername("Servlet is an API");    
	    ans4.setPostedBy("Arun");    
	        
	    Set<Answer> list1=new HashSet<Answer>();   
	    list1.add(ans1);    
	    list1.add(ans2);    
	        
	    Set<Answer>  list2=new HashSet<Answer>();   
	    list2.add(ans3);    
	    list2.add(ans4);    
	        
	    Question question1=new Question();    
	    question1.setQname("What is Java?");    
	    question1.setAnswers(list1);    
	        
	    Question question2=new Question();    
	    question2.setQname("What is Servlet?");    
	    question2.setAnswers(list2);    
	        
	    session.persist(question1);    
	    session.persist(question2);    
	        
	    t.commit();    
	    session.close(); 
	    HibernateUtilAnnotation.shutdown();
	}
	
	
	public static void load() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();	

		Query query = session.createQuery("from Question");
		List l = query.list();
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			Question p = (Question) o;
			System.out.println("Question is : " + p.getId());
			System.out.println("Question Name : " + p.getQname());
			System.out.println("----------------------");
			Set<Answer> address = p.getAnswers();
			
			 Iterator<Answer> itr2=address.iterator();    
		       while(itr2.hasNext())  
		       {  
		        Answer a=itr2.next();  
		            System.out.println(a.getAnswername()+":"+a.getPostedBy());  
		        }    
		}
		
		    session.close();    
		    HibernateUtilAnnotation.shutdown();
	}
}
