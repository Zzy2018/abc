package test;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo11 {
@Test
public void test() {
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	Criteria createCriteria = s.createCriteria(LinkMan.class);
	createCriteria.setProjection(Projections.rowCount());
	Long uniqueResult =(Long)createCriteria.uniqueResult();
	System.out.println(uniqueResult);
	beginTransaction.commit();
}
}
