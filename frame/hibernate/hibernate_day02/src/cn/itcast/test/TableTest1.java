package cn.itcast.test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itcast.domain.Order;
import cn.itcast.domain.User;
import cn.itcast.utils.HibernateUtils;

public class TableTest1 {
	//单项保存（保存客户并自动保存订单）
	@Test
	public void test8() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		User u = s.get(User.class, 2);
		
		Order o = s.get(Order.class, 4);

		u.getSet().remove(o);
		
		t.commit();
		s.close();
	}
	
	//单项保存（保存客户并自动保存订单）
	@Test
	public void test7() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		User u = s.get(User.class, 1);
		
		s.delete(u);
		
		t.commit();
		s.close();
	}

	//单项保存（保存客户并自动保存订单）
	@Test
	public void test6() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");

		Order o3 = new Order();
		o3.setPrice(3000d);
		o3.setAddress("新疆");
		
		s.save(o2);
		
		t.commit();
		s.close();
	}
	
	//单项保存（保存客户并自动保存订单）
	@Test
	public void test5() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");

		Order o3 = new Order();
		o3.setPrice(3000d);
		o3.setAddress("新疆");
		
		//关系描述
		//u关联o2,o3
		u.getSet().add(o2);
		u.getSet().add(o3);
		
		s.save(u);
		
		t.commit();
		s.close();
	}
	
	//单项保存（保存客户并自动保存订单）
	@Test
	public void test4() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");

		Order o3 = new Order();
		o3.setPrice(3000d);
		o3.setAddress("新疆");
		
		//关系描述
		//o1关键u
		o1.setUser(u);
		//u关联o2,o3
		u.getSet().add(o2);
		u.getSet().add(o3);
		
		s.save(o1);
		
		t.commit();
		s.close();
	}
	
	//单项保存（保存客户并自动保存订单）
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");
		
		//订单关联客户
		o1.setUser(u);
		o2.setUser(u);
		
		//保存数据
		s.save(o1);
		s.save(o2);
		
		t.commit();
		s.close();
	}
	//单项保存（保存订单并自动保存用户）
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");
		
		//客户关联订单
		u.getSet().add(o1);
		u.getSet().add(o2);
		
		//保存数据
		s.save(u);
		
		t.commit();
		s.close();
	}
	
	//保存
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//创建用户对象
		User u = new User();
		u.setName("XCM");
		
		//创建订单对象
		Order o1 = new Order();
		o1.setPrice(1000d);
		o1.setAddress("陕西");
		
		Order o2 = new Order();
		o2.setPrice(2000d);
		o2.setAddress("河南");
		
		//订单关联客户
		o1.setUser(u);
		o2.setUser(u);
		
		//客户关联订单
		u.getSet().add(o1);
		u.getSet().add(o2);
		
		//保存数据
		s.save(o1);
		s.save(o2);
		s.save(u);
		
		t.commit();
		s.close();
	}
}
