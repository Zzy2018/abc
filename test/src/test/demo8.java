package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo8 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	Criteria createCriteria = s.createCriteria(LinkMan.class);
	createCriteria.add(Restrictions.like("lkmMemo","%负责%"));
	createCriteria.add(Restrictions.like("lkmGender", "1"));
	List<LinkMan>list = createCriteria.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
	beginTransaction.commit();
}
}
