package com.calender;
/*
 * 求2000年7月份总共有多少天？
 * 
 * 1，创建对象
 * 2，将时间设置成2000年8月1日
 * 3，将时间向前推一天就是7月份最后一天
 * 4，获取天对对应字段
 * */
import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2000, 7, 1);
		c.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
