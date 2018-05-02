package cn.itcast.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

import cn.itcast.domain.Customer;
import cn.itcast.utils.HibernateUtils;

public class HibernateTest1 {
	
	@Test
	public void saveTest1() {
		Customer c = new Customer();
		c.setName("XGD");
		c.setAddress("西安");
		
		//创建Configuration来加载配置文件
		Configuration cf = new Configuration().configure();
		//得到cf
		SessionFactory sf = cf.buildSessionFactory();
		//得到s
		Session s = sf.openSession();
		
		//开启事物
		s.beginTransaction();
		s.save(c);
		//提交事物
		s.getTransaction().commit();
		
		s.close();
		sf.close();
	}
	
	@Test
	public void findTest() {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		//Customer c = s.get(Customer.class, 1);
		Customer c = s.load(Customer.class, 1);
		System.out.println(c.getName());
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	
	@Test
	public void updateTest() {
		Configuration cf = new Configuration().configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session s = sf.openSession();
		
		s.beginTransaction();
		
		Customer c = s.get(Customer.class, 2);
		c.setName("XCC");
		s.update(c);
		
		s.getTransaction().commit();
		s.close();
		sf.close();
	}
	
	@Test
	public void deleteTest() {
		Session s = HibernateUtils.openSession();
		
		s.beginTransaction();
		
		Customer c = s.get(Customer.class, 2);
		s.delete(c);
		
		s.getTransaction().commit();
		s.close();
	}
	
	@Test
	public void findAllTest() {
		Session s = HibernateUtils.openSession();
		
		s.beginTransaction();
		
		Query q = s.createQuery("from Customer");
		List<Customer> list = q.list();
		System.out.println(list);
		
		s.getTransaction().commit();
		s.close();
	}
	
}










