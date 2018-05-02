package cn.itcast.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.SimpleExpression;
//import org.hibernate.criterion.Order;
import org.junit.Test;

import cn.itcast.domain.Order;
import cn.itcast.domain.User;
import cn.itcast.utils.HibernateUtils;

public class QBCTest {
	
	
	//离线的检索
	@Test
	public void test6() {
		DetachedCriteria forClass = DetachedCriteria.forClass(User.class);
		forClass.add(Restrictions.like("name", "C_"));
		
		Session s = HibernateUtils.openSession();
	
		List<User> list = forClass.getExecutableCriteria(s).list();
		System.out.println(list);
		
		s.close();
	}
	
	//统计分组检索
	@Test
	public void test5() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//统计订单总数
		Criteria c = s.createCriteria(Order.class);
		
		/*Object obj = c.setProjection(Projections.rowCount()).uniqueResult();
		System.out.println(obj);*/
		
		//订单的总价格---分组统计根据客户
		//c.setProjection(Projections.sum("price"));//统计总价格
		c.setProjection(Projections.projectionList().add(Projections.sum("price")).add(Projections.groupProperty("user")));
		
		List<Object[]> list = c.list();
		
		for (Object[] objs : list) {
			System.out.println(objs[0]+"   "+objs[1]);
		}
		
		t.commit();
		s.close();
	}
	
	//分页检索
	@Test
	public void test4() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria c = s.createCriteria(Order.class);
		
		c.setFirstResult((2 - 1) * 6);
		c.setMaxResults(6);
		
		List<Order> list = c.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//条件检索
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		//查询名称叫C某的客户C_
		Criteria c = s.createCriteria(User.class);
		
		SimpleExpression like = Restrictions.like("name", "C_");
		
		c.add(like); //添加条件
		
		User user = (User) c.uniqueResult();
		System.out.println(user);
		
		//查询订单价格在2500以上的，并且的客户是C某
		Criteria cri = s.createCriteria(User.class);
		//大于2500
		Criterion gt = Restrictions.gt("price", 2500d);
		//与客户相同
		SimpleExpression eq = Restrictions.eq("user", user);
		
		LogicalExpression and = Restrictions.and(gt,eq);
		
		c.add(and);
		
		List<User> list = c.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//排序检索
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria c = s.createCriteria(Order.class);
		
		//指定排序
		c.addOrder(org.hibernate.criterion.Order.desc("price"));
		//c.addOrder(org.hibernate.criterion.Order.asc("price"));
		
		List<Order> list = c.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//基本检索
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//获得Criteria对象
		Criteria c = s.createCriteria(User.class);
		
		//调用list方法
		List<User> list = c.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
}
