package test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import util.sessionUtil;

public class demo6 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	String hql = "select lkmName,lkmMemo from LinkMan";
	Query createQuery = s.createQuery(hql);
	List<Object[]>list = createQuery.list();
	for(Object[] o:list) {
		System.out.println(o[0]);
	}
	beginTransaction.commit();
}
}
