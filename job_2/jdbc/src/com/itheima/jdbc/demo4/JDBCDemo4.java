package com.itheima.jdbc.demo4;

import org.junit.Test;

public class JDBCDemo4 {
	@Test
	public void demo1() {
		UserDao userDao = new UserDao();
		
		//boolean flag = userDao.login("aaa' or '1=1", "123asda");
		//boolean flag = userDao.login("aaa' -- ' ", "123asda");
		boolean flag = userDao.login("aaa", "123");
		if(flag) {
			System.out.println("��¼�ɹ�������");
		}else{
			System.out.println("��¼ʧ�ܣ�����");
		}
	}
}
