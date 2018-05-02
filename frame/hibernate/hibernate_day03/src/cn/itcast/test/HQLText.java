package cn.itcast.test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import cn.itcast.domain.Order;
import cn.itcast.domain.User;
import cn.itcast.utils.HibernateUtils;

public class HQLText {
	//命名检索
	@Test
	public void test9() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		User user = (User) s.get(User.class, 1);
		
		Query q = s.getNamedQuery("myHQL");
		List<Order> list = q.setEntity("user", user).list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//命名检索
	@Test
	public void test8() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		Query q = s.getNamedQuery("myHQL");
		List<User> list = q.list();
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//投影检索
	@Test
	public void test7() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//查询出User中的所有name
		//String hql = "select name from User";
		//List list = s.createQuery(hql).list();
		
		//System.out.println(list);
		
		//查询出User中所有的id，name
		/*String hql = "select id,name from User";
		List<Object[]> list = s.createQuery(hql).list();
		
		for (Object[] obj : list) {
			System.out.println(obj[0]+"\t"+obj[1]);
		}*/
		
		//使用投影将结果封装到User对象中         //必须在实体类中提供无参和要查询的构造方法
		String hql = "select new User(id,name) from User";
		List<Object[]> list = s.createQuery(hql).list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	
	//分组统计检索
	@Test
	public void test6() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//统计一共有多少个订单 count
		//String hql = "select count(*) from Order ";
		//Object un = s.createQuery(hql).uniqueResult();
		
		//System.out.println(un);
		
		//分组统计-------每一个人订单的总价
		String hql = "select sum(price) from Order group by user";
		List list = s.createQuery(hql).list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//分页检索
	@Test
	public void test5() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "from Order";
		Query q = s.createQuery(hql);
		q.setFirstResult((2 - 1) * 6);
		q.setMaxResults(6);
		
		List<Order> list = q.list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//条件检索
	@Test
	public void test4() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		//String hql = "from Order where price > 2500";
		//String hql = "from Order where price > ?";
		//List<User> list = s.createQuery(hql).setParameter(0, 2500d).list();
		String hql = "from Order where price > :price";
		List<Order> list = s.createQuery(hql).setParameter("price", 2500d).list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//排序检索
	@Test
	public void test3() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		String hql = "from Order order by price desc";
		List<Order> list = s.createQuery(hql).list();
		
		System.out.println(list);
		
		t.commit();
		s.close();
	}
	
	//基本检索
	@Test
	public void test2() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		String hpl = "from User";
		List<User> list = s.createQuery(hpl).list();
		
		System.out.println(list.get(0));
		
		t.commit();
		s.close();
	}
	
	//准备两个User，每个User中有10个Order
	@Test
	public void test1() {
		Session s = HibernateUtils.openSession();
		Transaction t = s.beginTransaction();
		
		User u = new User();
		u.setName("Ca");
		
		for(int i = 1; i<=10; i++){
			Order o = new Order();
			o.setPrice(2000d+i*100);
			o.setAddress("上海");
			o.setUser(u);
			
			s.save(o);
		}
		
		t.commit();
		s.close();
	}
}
