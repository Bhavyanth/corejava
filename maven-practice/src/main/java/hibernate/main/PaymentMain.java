package hibernate.main;

import org.hibernate.Session;

import hibernate.pojo.Cheques;
import hibernate.pojo.CreditCard;
import hibernate.util.HibernateUtil;

public class PaymentMain {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		CreditCard cd = new CreditCard();
		cd.setPaymentId(1001);
		cd.setAmount(6730);
		cd.setCreditCardType("MasterCard");
		
		Cheques cheques = new Cheques();
		cheques.setPaymentId(1002);
		cheques.setAmount(2980);
		cheques.setChequeType("HDFC");
		session.save(cd);
		session.save(cheques);
		session.getTransaction().commit();
	}
}
