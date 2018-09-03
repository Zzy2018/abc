package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo9 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	Criteria createCriteria = s.createCriteria(LinkMan.class);
	createCriteria.setFirstResult(0);
	createCriteria.setMaxResults(3);
	List<LinkMan>list = createCriteria.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
}
}
