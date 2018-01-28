package com.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {

	public static void main(String[] args) throws ParseException {
		//method();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		//����Date����
		Date d = new Date();
		//�����ʽ
		String s = sdf.format(d);
		
		System.out.println(s);//2018��01��14�� 15:29:06
		
		//����
		Date d1 = sdf.parse("2018��01��14�� 15:29:06");
		System.out.println(d1.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		Date d = new Date();
		
		String s = sdf.format(d);
		System.out.println(s);//18-1-14 ����3:23
		
		Date d1 = sdf.parse("18-1-14 ����3:23");
		System.out.println(d1.toLocaleString());
	}

}
