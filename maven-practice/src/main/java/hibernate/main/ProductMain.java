package hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import hibernate.pojo.Product;
import hibernate.util.HibernateUtil;

@SuppressWarnings("unused")
public class ProductMain {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		/*Product product = new Product();
		product.setProductId(101);
		product.setProductName("Apple");
//		product.setPrice(45000);
		Object o = session.get(Product.class, product);
		Product product2 = (Product) o;
		session.save(product);
		session.getTransaction().commit();*/
		Criteria criteria = session.createCriteria(Product.class);
		/*Criterion criterion = Restrictions.gt("price", new Double(17000));
		criteria.add(criterion);
		criteria.addOrder(Order.asc("price"));
		List list = criteria.list();
		System.out.println("List total size "+list.size());
		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			Product product = (Product) iterator.next();
			System.out.println(product.getProductId());
			System.out.println(product.getProductName());
			System.out.println(product.getPrice());
		}*/
		/**
		 *  Projections
		 */
		/*criteria.setProjection(Projections.property("productName"));
		List list = criteria.list();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			String s = (String)iterator.next();
			System.out.println(s);
		}
		criteria.setProjection(Projections.property("productName"));
		List list = criteria.list();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			String s = (String)iterator.next();
			System.out.println(s);
		}*/
		/**
		 * Multiple Projections
		 */
		ProjectionList p1 = Projections.projectionList();
		p1.add(Projections.property("productName"));
		p1.add(Projections.property("price"));
		criteria.setProjection(p1);
		List list = criteria.list();
		Iterator iterator = list.iterator();
		while (iterator.hasNext()){
			Object object[] = (Object[]) iterator.next();
			System.out.println(object[0]+"---------"+object[1]);
		}
		session.save(list);
		session.getTransaction().commit();
	}
} 
