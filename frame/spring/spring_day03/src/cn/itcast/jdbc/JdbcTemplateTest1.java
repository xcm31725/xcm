package cn.itcast.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateTest1 {
	
	@Test
	public void test1() {
		//创建一个数据库连接池
		DriverManagerDataSource data = new DriverManagerDataSource();
		
		//设置data相关属性（driverclass url username password）
		data.setDriverClassName("com.mysql.jdbc.Driver");
		data.setUrl("jdbc:mysql:///springtest");
		data.setUsername("root");
		data.setPassword("root");
		
		//创建一个JdbcTemplate来完成操作
		JdbcTemplate late = new JdbcTemplate();
		late.setDataSource(data);
		
		late.execute("update t_user set name='XCM' where id=1");//execute可以执行任意SQL
	}
	
}