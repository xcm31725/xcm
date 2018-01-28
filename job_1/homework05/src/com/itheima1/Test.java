package com.itheima1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 2����"2017-4-14"�ַ���ת��Ϊ"2017��4��14��"�ַ���
			(1)��"2017-4-14"ת����Date����
			(2)��Date����ת��Ϊ"2017��4��14��"
 * */
public class Test {

	public static void main(String[] args) throws ParseException {
		String s = "2017-4-14";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Date date = new Date();
		
		Date d = sdf.parse(s);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy��MM��dd��");
		
		String s2 = sdf1.format(d);
		System.out.println(s2);
	}

}
