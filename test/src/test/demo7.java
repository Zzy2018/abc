package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo7 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	Criteria c = s.createCriteria(LinkMan.class);
	List<LinkMan>list = c.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
	beginTransaction.commit();
}
}
