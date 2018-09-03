package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import com.itheima.LinkMan;

import util.sessionUtil;

public class demo12 {
@Test
public void test() {
	//假设这是web层
	DetachedCriteria detachedCriteria = DetachedCriteria.forClass(LinkMan.class);//不用和之前一样由session创建
	//可以自己搞自己。到时候在扔到dao层里，在dao层创建session，在由session去激活它，这就是离线查询。
	detachedCriteria.add(Restrictions.like("lkmMemo","%一把手%"));
	detachedCriteria.add(Restrictions.like("lkmName", "%老%"));
	//中间经过Service层
	//到达Dao层
	Session s = sessionUtil.getCurentSession();
	Transaction beginTransaction = s.beginTransaction();
	Criteria c = detachedCriteria.getExecutableCriteria(s);
	List<LinkMan>list = c.list();
	for(LinkMan l:list) {
		System.out.println(l);
	}
	beginTransaction.commit();
}
}
