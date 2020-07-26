package hibernate.main;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import hibernate.pojo.Product;
import hibernate.util.HibernateUtil;

public class ProductMain {
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
		Query query = session.createQuery("select p.productId,p.productName from Product p");
		List l = query.list();
		System.out.println("Total no of records: "+ l.size());
		Iterator iterator = l.iterator();
		while(iterator.hasNext()){
			Object object[] = (Object[]) iterator.next();
			System.out.println("product id : "+object[0]+"Product Name : "+object[1]);
			System.out.println("-----------");
		}
	}
} 
