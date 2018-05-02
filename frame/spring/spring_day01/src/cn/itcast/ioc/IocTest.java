package cn.itcast.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
	@Test
	public void test1() {
		//Service的用法
		//IUserService user = new UserServiceImpl();
		//user.sayHello();
		
		//使用spring容器提供的IOC
		//ioc本质上是通过xml+反射+Factory来实现的
		//在spring中提供了一个BeanFactory工厂，我们一般使用的是它的的自实现接口ApplicationContext
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//ClassPathXmlApplicationContext 它可以帮助我们在ClassPath路径下查找applicationContext.xml
		IUserService user = (IUserService) ac.getBean("userService");
		user.sayHello();
	}
}
