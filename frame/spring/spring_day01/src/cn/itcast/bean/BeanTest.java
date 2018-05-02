package cn.itcast.bean;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class BeanTest {
	@Test
	public void test1() {
		//使用BeanFactory来获取Bean1
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
		
		Bean1 be = (Bean1) bf.getBean("bean");
		be.show();
	}
	
	@Test
	public void test2() {
		//ClassPathXMLApplicationContext来获取Bean1
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean1 be = (Bean1) ac.getBean("bean");
		be.show();
	}
	
	@Test
	public void test3() {
		//ClassPathXMLApplicationContext来获取Bean1
		ApplicationContext ac = new FileSystemXmlApplicationContext("src/applicationContext.xml");
		Bean1 be = (Bean1) ac.getBean("bean");
		be.show();
	}
	
	@Test
	public void test4() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 be = (Bean2) ac.getBean("bean1");
		be.show();
	}
	
	//静态工厂
	@Test
	public void test5() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean2 be = (Bean2) ac.getBean("bean2");
		be.show();
	}
	
	//实例工厂
	@Test
	public void test6() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bean3 be = (Bean3) ac.getBean("bean3");
		be.show();
	}
}
