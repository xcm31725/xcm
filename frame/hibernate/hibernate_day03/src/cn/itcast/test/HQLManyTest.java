package cn.itcast.test;

import java.util.List;

import org.hibernate.Session;
import org.junit.Test;

import cn.itcast.domain.User;
import cn.itcast.utils.HibernateUtils;

public class HQLManyTest {
	//显示内连接
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();
		
		String hql = "from User u inner join u.set where u.id=1";
		
		List<Object[]> list = s.createQuery(hql).list();
		
		for (Object[] obj : list) {
			//System.out.println(obj[0]+"\t"+obj[1]);
			for (Object o : obj) {
				System.out.print(o+"\t");
			}
			System.out.println();
		}
		
		s.close();
	}
	
	//隐试内连接
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		
		String hql = "from Order o where o.user.id=1";
		
		List list = s.createQuery(hql).list();
		
		System.out.println(list);
		s.close();
	}
	
	//迫切内连接
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		
		//使用迫切内连接结果可能出现重复，所以要使用distinct
		String hql = "select distinct u from User u inner join fetch u.set";
		
		List<User> list = s.createQuery(hql).list();
		
		for (User u : list) {
			System.out.println(u);
		}
		
		s.close();
	}
	
	//外连接
	@Test
	public void test4() {
		Session s = HibernateUtils.openSession();
		
		//String hql = "from User u left join u.set";//左外链接
		String hql = "from User u right join u.set";//右外链接
		
		List<Object[]> list = s.createQuery(hql).list();
		
		for (Object[] obj : list) {
			System.out.println(obj[0]+"\t"+obj[1]);
		}
		
		s.close();
	}
	
	//迫切左外链接
	@Test
	public void test5() {
		Session s = HibernateUtils.openSession();
		
		//fecth不可以与单独条件with一起使用
		String hql = "select distinct u from User u left join fetch u.set where u.id=1";
		
		List<User> list = s.createQuery(hql).list();
		
		for (User u : list) {
			System.out.println(u);
		}
		
		s.close();
	}
}
