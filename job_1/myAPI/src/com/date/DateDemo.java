package com.date;

import java.util.Date;

/*
 * Date:类 Date 表示特定的瞬间，精确到毫秒。 
 * System.currentTimeMillis():返回 当前系统时间
 * 
 * 构造方法：
 * 		Date()：创建的是一个表示当前系统时间的Date对象
 * 		Date(long date)：根据“指定时间”创建Date对象
 * 
 * */
public class DateDemo {

	public static void main(String[] args) {
		//Date()
		/*Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());*/
		
		//Date(long date)
		Date d = new Date(1000);
		System.out.println(d.toLocaleString());
	}

}
