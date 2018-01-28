package com.itheima1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 2、将"2017-4-14"字符串转化为"2017年4月14日"字符串
			(1)将"2017-4-14"转换成Date对象
			(2)将Date对象转换为"2017年4月14日"
 * */
public class Test {

	public static void main(String[] args) throws ParseException {
		String s = "2017-4-14";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		
		Date d = sdf.parse(s);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日");
		
		String s2 = sdf1.format(d);
		System.out.println(s2);
	}

}
