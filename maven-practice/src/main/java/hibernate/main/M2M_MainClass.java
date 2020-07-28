package hibernate.main;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate.pojo.Course;
import hibernate.pojo.Student;

public class M2M_MainClass {

	@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();	
		Student s1 = new Student();
		s1.setStudentId(101);
		s1.setStudentName("Aashritha");
		s1.setMarks(87);
		
		Student s2 = new Student();
		s2.setStudentId(102);
		s2.setStudentName("Ajay");
		s2.setMarks(78);
		
		Course c1 = new Course();
		c1.setCourseId(01);
		c1.setCourseName("Java");
		c1.setDuration(8);
		
		Course c2 = new Course();
		c2.setCourseId(02);
		c2.setCourseName("Angular");
		c2.setDuration(15);
		
		Set s = new HashSet();
		s.add(c1);
		s.add(c2);
		
		s1.setCourses(s);
		s2.setCourses(s);
		Transaction transaction = session.beginTransaction();
		session.save(s1);
		session.save(s2);
		transaction.commit();
		session.close();
		factory.close();
	}

}
