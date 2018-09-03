package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo3 {
@Test
public void test() {
	Session session = sessionUtil.getCurentSession();
	Transaction beginTransaction = session.beginTransaction();
	//String hql = "from LinkMan order by lkmId desc";
	String hql = "from LinkMan order by lkmId";
	Query createQuery = session.createQuery(hql);
	List<LinkMan>list = createQuery.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
	beginTransaction.commit();
}
}
