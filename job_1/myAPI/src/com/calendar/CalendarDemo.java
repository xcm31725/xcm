package com.calendar;

import java.util.Calendar;

/*
 * Calendar���������ṩ��һЩ����������ʱ�ķ���
 * 
 * ��ȡ
 * �޸�
 * ���
 * */
public class CalendarDemo {

	public static void main(String[] args) {
		//static DateFormat getInstance() 
		Calendar c = Calendar.getInstance();
		
		//void set(int field, int value) ����ָ�����ֶ��޸ĳ�ָ����ֵ
		//c.set(Calendar.DAY_OF_MONTH, 20);
		
		//void add(int field, int amount): ��ָ�����ֶ��ϼ���ָ����ֵ
		c.add(Calendar.DAY_OF_MONTH, 2);
		
		//int get(int field) // ���ظ��������ֶε�ֵ
		//public static final int YEAR 1 
		//System.out.println(Calendar.YEAR);
		//int year = c.get(1);
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"��"+month+"��"+day+"��");
	}

}
