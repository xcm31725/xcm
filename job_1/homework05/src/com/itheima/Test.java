package com.itheima;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//1��С���ĳ���������1990��5��8��, ����һ������������!
public class Test {

	public static void main(String[] args) throws ParseException {
		String brithday = "1990��5��8��";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		
		Date date = new Date();
		
		String now = sdf.format(date);
		
		Date d1 = sdf.parse(brithday);
		Date d2 = sdf.parse(now);
		
		long l = d1.getTime();
		long l2 = d2.getTime();
		
		System.out.println("������"+(l2-l)/1000/60/60/24/365+"����");
	}

}
