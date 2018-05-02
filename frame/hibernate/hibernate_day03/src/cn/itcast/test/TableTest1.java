package cn.itcast.test;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itcast.domain.Book;
import cn.itcast.domain.Order;
import cn.itcast.domain.Person;
import cn.itcast.domain.User;
import cn.itcast.utils.HibernateUtils;
import cn.itcast.manytomany.Student;
import cn.itcast.manytomany.Teacher;
import cn.itcast.onetoone.Emp;
import cn.itcast.onetoone.Husband;
import cn.itcast.onetoone.IDCard;
import cn.itcast.onetoone.Wife;

public class TableTest1 {
	//主键关联
	@Test
	public void test7() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Wife  w = new Wife();
		w.setName("XCM");
		
		Husband h = new Husband();
		h.setName("XGD");
		
		//双向关联
		w.setH(h);
		h.setW(w);
		
		s.save(h);
		
		t.commit();
		s.close();
	}
	
	//一对一
	@Test
	public void test6() {
		Session se = HibernateUtils.openSession();
		Transaction ta = se.beginTransaction();
		
		IDCard id = new IDCard();
		id.setCardNum("12313431231");
		
		Emp e = new Emp();
		e.setName("XCM");
		
		id.setEmp(e);
		
		se.save(id);
		
		ta.commit();
		se.close();
	}
	
	//多对多双向关联删除
	@Test
	public void test5() {
		Session se = HibernateUtils.openSession();
		Transaction ta = se.beginTransaction();
		
		Student s = se.get(Student.class, 1);
		se.delete(s);
		
		ta.commit();
		se.close();
	}
	
	//多对多双向关联
	@Test
	public void test4() {
		Session se = HibernateUtils.openSession();
		Transaction ta = se.beginTransaction();
		
		Teacher t1 = new Teacher();
		t1.setName("ZC");

		Teacher t2 = new Teacher();
		t2.setName("SD");
		
		Student s1 = new Student();
		s1.setName("XCM");
		
		Student s2 = new Student();
		s2.setName("XGD");
		
		s1.getT().add(t1);
		s1.getT().add(t2);
		
		s2.getT().add(t1);
		s2.getT().add(t2);
		
		se.save(s1);
		se.save(s2);
		
		ta.commit();
		se.close();
	}
	
	//一对多注解
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

		//建立关系
		//维护外键
		o1.setUser(u);
		o2.setUser(u);
		
		//级联操作
		u.getSet().add(o1);
		u.getSet().add(o2);

		//保存客户，并关联订单
		s.save(u);
		
		t.commit();
		s.close();
	}

	
	//PO注解开发
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Book b = new Book();
		b.setName("java基础");
		b.setPrice(39.9);
		b.setTime(new Date());
		
		s.save(b);
		
		t.commit();
		s.close();
	}
	
	//uuid主键生成策略及不生成表中的映射
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Person p = new Person();
		p.setName("XCM");
		p.setMsg("你好啊！");
		
		s.save(p);
		
		t.commit();
		s.close();
	}
}
