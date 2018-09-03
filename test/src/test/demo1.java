package test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import com.itheima.Customer;

import util.sessionUtil;
public class demo1 {
@Test
public void test1() {
	Session openSession = sessionUtil.getSession();
//	Transaction beginTransaction = openSession.beginTransaction();
//	Customer customer = new Customer();
//	customer.setCustName("傻屌小丫丫1");
//	openSession.save(customer);
//	//beginTransaction.commit();
//	Customer customer3 = new Customer();
//	customer3.setCustName("傻屌大1");
//	openSession.save(customer3);
//	customer = openSession.get(Customer.class,1L);
//	customer.setCustName("可爱又迷人11");
//	openSession.save(customer);
//	beginTransaction.commit();
//	 Customer customer2 = openSession.get(Customer.class,1L);
//	    System.out.println(customer2);
	Session session = sessionUtil.getSession();
	Session session2 = sessionUtil.getCurentSession();
	Session session3 = sessionUtil.getCurentSession();
	System.out.println(openSession==session);
	System.out.println(session2==session3);
//	openSession.close();
}
}
