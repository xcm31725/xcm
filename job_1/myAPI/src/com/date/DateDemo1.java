package com.date;

import java.util.Date;

/*
 * Date�ĳ��÷���
 * 		����ֵ --- Date
 * 			����
 * 			����ֵ��void,����long
 * 			void setTime(long time)
 * 			Date(long date)
 * 		Date --- ����ֵ
 * 			��ȡ
 * 			����ֵlong���޲���
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
