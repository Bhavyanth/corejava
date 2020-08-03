package com.concepts;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pojo.OOEmployee;
import com.pojo.OoAddress;

import hibernateutil.HibernateUtilAnnotation;

public class OnetoOne {

	public static void main(String[] args) {
		load();
	}

	public static void save() {

		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();

		Transaction t = session.beginTransaction();

		OOEmployee e1 = new OOEmployee();
		e1.setName("Ravi Malik");
		e1.setEmail("ravi@gmail.com");

		OoAddress address1 = new OoAddress();
		address1.setAddressLine1("G-21,Lohia nagar");
		address1.setCity("Ghaziabad");
		address1.setState("UP");
		address1.setCountry("India");
		address1.setPincode(201301);

		e1.setAddress(address1);
		address1.setEmployee(e1);

		session.persist(e1);
		t.commit();

		session.close();
		System.out.println("success");

	}

	public static void load() {
		Session session = HibernateUtilAnnotation.getSessionFactory().openSession();

		Query query = session.createQuery("from OOEmployee");
		List l = query.list();

		
		Iterator it = l.iterator();

		while (it.hasNext()) {
			Object o = (Object) it.next();
			OOEmployee p = (OOEmployee) o;
			System.out.println("Product email : " + p.getEmail());
			System.out.println("Product Name : " + p.getName());
			System.out.println("----------------------");
			OoAddress address = p.getAddress();
			System.out.println(address.getAddressLine1() + " " + address.getCity() + " " + address.getState() + " "
					+ address.getCountry() + " " + address.getPincode());
		}
		session.close();
		System.out.println("success");
	}

}
