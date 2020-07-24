package hibernate.concepts;

import java.util.Date;

import org.hibernate.Session;

import hibernatepractice.pojo.User;
import hibernateutil.HibernateUtil;

public class Loadrecords {
	
	public static void load() {


        Session session = HibernateUtil.getSessionFactory().openSession();
 
        Object a =session.load(User.class, new Integer(1));
        User user = (User) a;
        System.out.println("user name is "+user.getUsername());
        session.close();
    
	
	}

}
