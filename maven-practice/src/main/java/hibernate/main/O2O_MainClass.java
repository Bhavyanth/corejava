package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.pojo.Address;
import hibernate.pojo.Student1;

public class O2O_MainClass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Student1 s = new Student1();
		s.setStudentId(101);
		s.setStudentName("Ramu");

		Address ad = new Address();
		ad.setAddressId(501);
		ad.setCity("Virginia");
		ad.setState("NC");
		ad.setS(s);

		Transaction tx = session.beginTransaction();

		session.save(ad);

		tx.commit();

		session.close();
		System.out.println("One to One is Done..!!");
		factory.close();
	}
}
