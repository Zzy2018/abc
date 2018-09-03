package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo2 {
@Test
public void test() {
	Session curentSession = sessionUtil.getCurentSession();
	Transaction beginTransaction = curentSession.beginTransaction();
	//String hql = "from LinkMan";
	String hql = "from LinkMan where lkmMemo like ? and lkmGender like?";//lkm_memo字段名使用数据库表里的属性也可以
	Query q = curentSession.createQuery(hql);//一样查到数据，但是表名的话一定要用实体类
	q.setParameter(0, "%很负责%");
	q.setParameter(1, "1");
	List<LinkMan>list = q.list();
	for(LinkMan lm:list) {
		System.out.println(lm);
	}
	beginTransaction.commit();
}
}
