package com.date;

import java.util.Date;

/*
 * Date的常用方法
 * 		毫秒值 --- Date
 * 			设置
 * 			返回值是void,参数long
 * 			void setTime(long time)
 * 			Date(long date)
 * 		Date --- 毫秒值
 * 			获取
 * 			返回值long，无参数
 * 			long getTime()
 * */
public class DateDemo1 {

	public static void main(String[] args) {
		Date d = new Date();
		//d.setTime(1000);
		System.out.println(d.toLocaleString());
		System.out.println(d.getTime());
		
		d.setTime(1000);
		System.out.println(d.toLocaleString());
	}

}
