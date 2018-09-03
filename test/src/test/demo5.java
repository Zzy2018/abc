package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import util.sessionUtil;

public class demo5 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	String hql="select count(*) from LinkMan";
	Query createQuery = s.createQuery(hql);
	Long uniqueResult = (Long)createQuery.uniqueResult();
	System.out.println(uniqueResult);
	beginTransaction.commit();
}
}
