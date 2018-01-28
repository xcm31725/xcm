package com.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		//method();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		//创建Date对象
		Date d = new Date();
		//定义格式
		String s = sdf.format(d);
		
		System.out.println(s);//2018年01月14日 15:29:06
		
		//解析
		Date d1 = sdf.parse("2018年01月14日 15:29:06");
		System.out.println(d1.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		Date d = new Date();
		
		String s = sdf.format(d);
		System.out.println(s);//18-1-14 下午3:23
		
		Date d1 = sdf.parse("18-1-14 下午3:23");
		System.out.println(d1.toLocaleString());
	}

}
