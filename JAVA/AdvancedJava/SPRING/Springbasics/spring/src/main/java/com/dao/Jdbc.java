package com.dao;

import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Employee;
import com.pojo.EmployeeSprHiber;
import com.pojo.UserDetails;

public class Jdbc {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	    
	    UserDao dao=(UserDao)ctx.getBean("userdao"); 
	    UserDao daonamed=(UserDao)ctx.getBean("userdaonamedtemplate"); 
	    
	    UserDetails userdetails= new UserDetails();
	    userdetails.setUserId(2);
	    userdetails.setCreatedBy("adi");
	    userdetails.setCreatedDate(new Date());
	    userdetails.setUsername("adithya");userdetails.setV(2);
	    // int status=dao.saveUserDetails(userdetails);
	     userdetails.setUsername("adithya123");
	    // dao.updateUserDetails(userdetails);
	     
	     //dao.deleteUserDetails(userdetails);
	     
	     
	     userdetails.setUserId(3);;
	     //prepared statemet
	   //  dao.savePrepstaUserDetails(userdetails);
	     
		/* resutlset extractor */
	   List<UserDetails> uers =  dao.getusersResultsetextractor();
	   System.out.println("");
	   
		/* rowmapper */
	   List<UserDetails> uers1 = dao.getusersRowmapper();
	   System.out.println("");
	   
	   
		/* named template */
	   userdetails.setUserId(4);
	   daonamed.saveUserNamedTempalte(userdetails);
	   
	   
	   
	   
	   
		/* Hibernate spring */
	   
	/**   EmployeeSprHiber emp = new EmployeeSprHiber();
	   emp.setId(4);
	   emp.setName("varkuri");
	   
	   HibernateDao userhiberdao = (HibernateDao) ctx.getBean("hiebrnatedao"); 
	   userhiberdao.save(emp);
	   
	  emp.setName("Adithya");
	   userhiberdao.update(emp);
	   
	   EmployeeSprHiber useryID= userhiberdao.getbid(emp);
	  
	  List<EmployeeSprHiber> userdetailslist = userhiberdao.getusers();
	   
	  userhiberdao.delete(emp);
	   
	   System.out.println("");
	   **/
	   
	}
	

}
