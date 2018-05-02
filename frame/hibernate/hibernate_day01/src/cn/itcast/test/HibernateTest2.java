package cn.itcast.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itcast.domain.Customer;
import cn.itcast.utils.HibernateUtils;

public class HibernateTest2 {
	@Test
	public void test1() {
		Configuration cf = new Configuration().configure();
		
		//手动加载映射
		//cf.addResource("cn/itcast/domain/Customer.hbm.xml");
		//cf.addClass(Customer.class);
		
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		
		Transaction t = s.beginTransaction();
		
		Customer c = s.get(Customer.class, 1);
		System.out.println(c);
		
		t.commit();
		s.close();
		sf.close();
		
	}
	
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		
		Transaction t = s.beginTransaction();
		
		Customer c = s.get(Customer.class, 2);
		System.out.println(c);
		
		t.commit();
		s.close();
	}
	
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		
		Customer c = new Customer();
		c.setName("ZC");
		s.save(c);
		
		int a = 3/0;
		
		Customer c1 = new Customer();
		c1.setName("CD");
		s.save(c1);
		
		s.close();
	}
	
}
