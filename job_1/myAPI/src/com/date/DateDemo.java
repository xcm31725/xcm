package com.date;

import java.util.Date;

/*
 * Date:�� Date ��ʾ�ض���˲�䣬��ȷ�����롣 
 * System.currentTimeMillis():���� ��ǰϵͳʱ��
 * 
 * ���췽����
 * 		Date()����������һ����ʾ��ǰϵͳʱ���Date����
 * 		Date(long date)�����ݡ�ָ��ʱ�䡱����Date����
 * 
 * */
public class DateDemo {

	public static void main(String[] args) {
		//Date()
		/*Date d = new Date();
		System.out.println(d);
		System.out.println(d.toLocaleString());*/
		
		//Date(long date)
		Date d = new Date(1000);
		System.out.println(d.toLocaleString());
	}

}
