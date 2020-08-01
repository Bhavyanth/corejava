package hibernate.concepts;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernatepractice.pojo.Product;
import hibernateutil.HibernateUtil;

public class Namedquery {
	
	public static void namedQuery() {
		 Session session = HibernateUtil.getSessionFactory().openSession();
		 Query qry = session.getNamedQuery("sampleNamedQuery");
		// qry.setParameter("java4s",new Integer(1022));
		 List l = qry.list();
			System.out.println("List total size..._" + l.size());
			Iterator it = l.iterator();

			while (it.hasNext()) {
				Product p = (Product) it.next();
				System.out.println(p.getProductId());
				System.out.println(p.getProName());
				System.out.println(p.getPrice());
				System.out.println("-----------------");
			}
	}

}
