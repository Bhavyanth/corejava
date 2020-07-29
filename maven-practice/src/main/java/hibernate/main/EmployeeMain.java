package hibernate.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import hibernate.entity.Employee;

@SuppressWarnings("deprecation")
public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setFirstName("Bhavyanth");
		employee.setLastName("Kondapalli");
		employee.setSalary(30000);
		employee.setCreationDate(new Date());
		
		Employee employee1 = new Employee();
		employee1.setFirstName("Amulya");
		employee1.setLastName("Elluru");
		employee1.setSalary(60000);
		employee1.setCreationDate(new Date());
		
		Employee employee2 = new Employee();
		employee2.setFirstName("Ajay");
		employee2.setLastName("Bathini");
		employee2.setSalary(50000);
		employee2.setCreationDate(new Date());
		
	
		
		SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		session.getTransaction().commit();
		session.close();
		factory.close();
		
	}

}
