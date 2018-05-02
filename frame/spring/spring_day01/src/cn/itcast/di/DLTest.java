package cn.itcast.di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DLTest {
	
	//构造注入
	@Test
	public void test1() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = (Car) ac.getBean("car");
		System.out.println(c.getName()+"\t"+c.getPrice());
	}
	
	//Setter方法注入
	@Test
	public void test2() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Car c = (Car) ac.getBean("car1");
		System.out.println(c.getName()+"\t"+c.getPrice());
	}
	
	//关于ref属性
	@Test
	public void test3() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person p = (Person) ac.getBean("person");
		System.out.println(p.getName()+"\t"+p.getCar());
	}
	
	//集合list注入
	@Test
	public void test4() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionDemo c = (CollectionDemo) ac.getBean("coll");
		System.out.println(c.getList());
	}
	
	//集合set注入
	@Test
	public void test5() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionDemo c = (CollectionDemo) ac.getBean("coll");
		System.out.println(c.getSet());
	}
	
	//集合map注入
	@Test
	public void test6() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionDemo c = (CollectionDemo) ac.getBean("coll");
		System.out.println(c.getMap());
	}
	
	//集合propertise注入
	@Test
	public void test7() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		CollectionDemo c = (CollectionDemo) ac.getBean("coll");
		System.out.println(c.getPro());
	}
}
