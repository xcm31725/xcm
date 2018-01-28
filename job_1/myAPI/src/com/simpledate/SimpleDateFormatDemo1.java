package com.simpledate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * SImpleDateFormat��
 * 		��ʽ��:
 * 			Date --- String 
 * 			2018-1-13   2018��1��123��
 * 			String format(Date date);
 * 		����
 * 			String ===  Date
 * 			2018��-1-13
 * 		    Date  parse(String source)
 * ���췽����
 * 		SimpleDateFormat() ��ʹ��Ĭ�ϵ�ģʽ���ж���Ĺ���
 * 		SimpleDateFormat(String pattern)��ֻ��ָ����ģʽ���ж���Ĺ���
 * */
public class SimpleDateFormatDemo1 {

	public static void main(String[] args) throws ParseException {
		//method();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s);
		
		Date d = sdf.parse("2018��01��13�� 17:45:23");
		System.out.println(d.toLocaleString());
	}

	private static void method() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		//��ʽ��
		Date date = new Date();
		String s = sdf.format(date);
		System.out.println(s);
		
		//����
		Date d = sdf.parse("18-1-13 ����5:38");
		System.out.println(d.toLocaleString());
	}

}
