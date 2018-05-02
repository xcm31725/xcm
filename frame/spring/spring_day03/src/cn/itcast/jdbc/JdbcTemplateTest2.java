package cn.itcast.jdbc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class JdbcTemplateTest2 {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Test
	public void test1() {
		
		jdbc.execute("update t_user set sex='女'");//execute可以执行任意SQL
	}
	
}