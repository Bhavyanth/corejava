package hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hibernate.pojo.Customer;
import hibernate.pojo.Vendor;

public class M2O_MainClass {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Vendor vendor = new Vendor();
		vendor.setVendorId(1001);
		vendor.setVendorName("Raju");
		Customer c1 = new Customer();
		c1.setCustomerId(501);
		c1.setCustomerName("Ravi");
		c1.setParentObjects(vendor);
		
		Customer c2 = new Customer();
		c2.setCustomerId(502);
		c2.setCustomerName("Ramu");
		c2.setParentObjects(vendor);
		
		Customer c3 = new Customer();
		c3.setCustomerId(503);
		c3.setCustomerName("Ashwin");
		c3.setParentObjects(vendor);
		Transaction transaction = session.beginTransaction();
		session.save(c1);
		session.save(c2);
		session.save(c3);
		transaction.commit();
		session.close();
		factory.close();
	}
}
