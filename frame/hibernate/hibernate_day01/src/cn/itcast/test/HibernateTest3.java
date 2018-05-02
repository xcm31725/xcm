package cn.itcast.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;

import cn.itcast.domain.Customer;
import cn.itcast.utils.HibernateUtils;

public class HibernateTest3 {
	//使用hql查询所有信息
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();

		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("from Customer");//from后面是类名
		
		List<Customer> list = q.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//向数据库中添加100条记录
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		
		Transaction t = s.beginTransaction();
		
		for (int i = 1; i <= 100; i++) {
			Customer c = new Customer();
			c.setName("XCM"+i);
			c.setAddress("陕西");
			c.setSex("女");
			
			s.save(c);
		}
		
		t.commit();
		s.close();
	}
	
	//查询表中的第21~30的记录
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.createQuery("from Customer");
		q.setFirstResult(20);
		q.setMaxResults(10);
		List<Customer> list = q.list();
		System.out.println(list);
		
		t.commit();
		
		s.close();
	}
	
	//查询一列的所有信息
	@Test
	public void test4() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//Query q = s.createQuery("select name,address from Customer");//这时得到的不再是Customer对象，而是Object
		//List<Object[]> list = q.list();
		
		Query q = s.createQuery("select new Customer(name,address) from Customer");
		//使用hibernate中的投影查询，需要在Customer中提供name和address作为参数的构造方法
		List<Customer> list = q.list();
		System.out.println(list);
		
		t.commit();
		
		s.close();
	}
	
	//条件查询
	@Test
	public void test5() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//Query q = s.createQuery("from Customer where name=?");//无名称查询
		Query q = s.createQuery("from Customer where name=:xc");//有名称查询

		//q.setParameter(0, "XCM");
		q.setParameter("xc", "XCM");
		
		//List<Customer> list = q.list();
		//System.out.println(list);
		
		Customer c = (Customer) q.uniqueResult();//必须保证数据只有一条才能使用uniqueResult()方法
		System.out.println(c);
		
		t.commit();
		
		s.close();
	}
	
	//本地SQL查询
	@Test
	public void test6() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		SQLQuery sq = s.createSQLQuery("select * from t_customer");
		//List<Object[]> list = sq.list();
		//System.out.println(list);
		
		sq.addEntity(Customer.class);
		List<Object[]> list = sq.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//本地SQL查询----->条件查询
	@Test
	public void test7() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		SQLQuery sq = s.createSQLQuery("select * from t_customer where name=?");
		sq.setParameter(0, "XGD");
		
		sq.addEntity(Customer.class);
		//List<Object[]> list = sq.list();
		//System.out.println(list);
		Customer c = (Customer) sq.uniqueResult();
		System.out.println(c);
		
		t.commit();
		s.close();
	}
	
	//使用criteria查询
	@Test
	public void test8() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Criteria cri = s.createCriteria(Customer.class);
		//List<Customer> list = cri.list();
		//System.out.println(list);
		
		//cri.setFirstResult(begin);//从begin开始查询
		//cri.setMaxResults(max);//最多可以查询max条记录
		
		//多条件查询
		//cri.add(Restrictions.eq("name", "XCM"));
		
		//cri.add(Restrictions.eq("address", "渭南"));
		//Customer c = (Customer) cri.uniqueResult();
		//System.out.println(c);
		
		//查询 name=XCM 或者 address=西安
		cri.add(Restrictions.and(Restrictions.eq("name", "XGD"),Restrictions.eq("address", "西安")));
		Customer c = (Customer) cri.uniqueResult();
		System.out.println(c);
		
		//List<Customer> list = cri.list();
		//System.out.println(list);
		
		
		t.commit();
		s.close();
	}
	
}
