package hibernate.main;

import org.hibernate.Session;

import hibernate.pojo.User;
import hibernate.util.HibernateUtil;

public class MainClass {
public static void main(String[] args) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	session.beginTransaction();
	User user = new User();
	user.setId(101);
	user.setName("Bhavyanth");
	session.save(user);
	session.getTransaction().commit();
	
}
}
