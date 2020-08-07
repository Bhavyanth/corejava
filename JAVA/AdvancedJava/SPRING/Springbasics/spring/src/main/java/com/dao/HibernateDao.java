package com.dao;
import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.pojo.EmployeeSprHiber;
import com.pojo.UserDetails;  

public class HibernateDao {
	HibernateTemplate template;  
	
	
	public void save(EmployeeSprHiber emp) {
		template.save(emp);
	}
	
	public void update(EmployeeSprHiber user) {
		template.update(user);
	}
	
	public void delete(EmployeeSprHiber user) {
		template.delete(user);
	}
	
	public EmployeeSprHiber getbid(EmployeeSprHiber user) {
		EmployeeSprHiber userdetails =template.get(EmployeeSprHiber.class, user.getId());
		return userdetails;
	}
	
	
	public List<EmployeeSprHiber>  getusers() {
		List<EmployeeSprHiber> users = new ArrayList<EmployeeSprHiber>();
		users =template.loadAll(EmployeeSprHiber.class);
		return users;
	}
	
	

}
