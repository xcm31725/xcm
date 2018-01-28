package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//1、小明的出生日期是1990年5月8日, 计算一下他今年多大了!
public class Test {

	public static void main(String[] args) throws ParseException {
		String brithday = "1990年5月8日";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		
		Date date = new Date();
		
		String now = sdf.format(date);
		
		Date d1 = sdf.parse(brithday);
		Date d2 = sdf.parse(now);
		
		long l = d1.getTime();
		long l2 = d2.getTime();
		
		System.out.println("他今年"+(l2-l)/1000/60/60/24/365+"岁了");
	}

}
