package cn.itcast.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.annotation.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)//spring整合Junit4
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class AnnotationTest {
	@Autowired
	private IUserService userService;
	
	@Test
	public void test1() { 
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		IUserService user =  (IUserService) ac.getBean("userService");
		user.add();
	}
	
	@Test
	public void test2() {
		userService.add();
	}
}
