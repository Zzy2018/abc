package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo4 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	String hql = "from LinkMan";
	Query createQuery = s.createQuery(hql);
	createQuery.setFirstResult(0);
	createQuery.setMaxResults(3);
	List<LinkMan>list = createQuery.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
		beginTransaction.commit();
}
}
