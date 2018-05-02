package cn.itcast.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class JdbcTemplateTest3 {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	//修改
	@Test
	public void test1() {
		jdbc.update("update t_user set age=? where id=?",18,1);
		
	}
	
	//添加
	@Test
	public void test2() {
		jdbc.update("insert into t_user values(null,?,?,?)","AAA",30,"男");
	}

	//删除
	@Test
	public void test3() {
		jdbc.update("delete from t_user where id=?",4);
	}
	
	//返回简单数据类型
	@Test
	public void test4() {
		String name = jdbc.queryForObject("select name from t_user where id=?", String.class,1);
		System.out.println(name);
	}
	
	//返回简单数据类型
	@Test
	public void test5() {
		Integer num = jdbc.queryForObject("select count(*) from t_user", Integer.class);
		System.out.println(num);
	}
	
	//返回一个复杂的数据类型 -User
	@Test
	public void test6() {
		User user = jdbc.queryForObject("select * from t_user where id=?", new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rel, int i) throws SQLException {
				// 完成结果集封装成user对象操作
				User u = new User();
				u.setAge(rel.getInt("age"));
				u.setId(rel.getInt("id"));
				u.setName(rel.getString("name"));
				u.setSex(rel.getString("sex"));
				
				return u;
			}
		},1);
		System.out.println(user);
	}
	
	//测试返回一个复杂的数据类型 -List<User>
	@Test
	public void test7() {
		List<User> user = jdbc.query("select * from t_user", new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet re, int i) throws SQLException {
				//完成结果集封装成user对象操作
				User u = new User();
				u.setAge(re.getInt("age"));
				u.setId(re.getInt("id"));
				u.setName(re.getString("name"));
				u.setSex(re.getString("sex"));
				return u;
			}
		});
		System.out.println(user);
	}
	
	//使用BeanPropertyRowMapper来完成结果集到Bean封装
	@Test
	public void test8() {
		//User user = jdbc.queryForObject("select * from t_user where id=?", new BeanPropertyRowMapper<User>(User.class),1);
		List<User> user = jdbc.query("select * from t_user", new BeanPropertyRowMapper<User>(User.class));
		System.out.println(user);
	}
	
}