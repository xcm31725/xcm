package com.calender;
/*
 * ��2000��7�·��ܹ��ж����죿
 * 
 * 1����������
 * 2����ʱ�����ó�2000��8��1��
 * 3����ʱ����ǰ��һ�����7�·����һ��
 * 4����ȡ��Զ�Ӧ�ֶ�
 * */
import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(2000, 7, 1);
		c.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(c.get(Calendar.DAY_OF_MONTH));
	}

}
