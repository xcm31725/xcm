package cn.itcast.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.domain.User;
import cn.itcast.service.IUserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class UserServiceImplTest {
	@Autowired
	private IUserService userService;
	
	@Test
	public void testAdd() {
		User user = new User();
		user.setAge(25);
		user.setName("XXasda");
		
		userService.add(user);
	}

	@Test
	public void testDel() {
		User user = userService.fingById(3);
		userService.del(user);
	}

	@Test
	public void testUpdate() {
		User user = userService.fingById(2);
		user.setName("XGD");
				
		userService.update(user);
	}

	@Test
	public void testFingById() {
		User user = userService.fingById(2);
		System.out.println(user);
	}

	@Test
	public void testFingAll() {
		List<User> user = userService.fingAll();
		System.out.println(user);
	}

	@Test
	public void testFindAllByCriteria() {

		// 1.创建一个DetachedCriteria
		DetachedCriteria dc = DetachedCriteria.forClass(User.class);
		dc.add(Restrictions.gt("age", 20)); 
		
		List<User> users = userService.findAllByCriteria(dc);

		System.out.println(users);
	}
	
	@Test
	public void testFindByNameQuery() {

		List<User> users = userService.findByNameQuery();

		System.out.println(users);
	}
}
