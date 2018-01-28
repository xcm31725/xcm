package com.simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SImpleDateFormat；
 * 		格式化:
 * 			Date --- String 
 * 			2018-1-13   2018年1月123日
 * 			String format(Date date);
 * 		解析
 * 			String ===  Date
 * 			2018年-1-13
 * 		    Date  parse(String source)
 * 构造方法：
 * 		SimpleDateFormat() ：使用默认的模式进行对象的构造
 * 		SimpleDateFormat(String pattern)：只用指定的模式进行对象的构造
 * */
public class SimpleDateFormatDemo1 {

	public static void main(String[] args) throws ParseException {
		//method();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s);
		
		Date d = sdf.parse("2018年01月13日 17:45:23");
		System.out.println(d.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		//格式化
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s);
		
		//解析
		Date d = sdf.parse("18-1-13 下午5:38");
		System.out.println(d.toLocaleString());
	}

}
