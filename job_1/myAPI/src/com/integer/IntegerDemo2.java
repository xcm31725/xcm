package com.integer;
/*
 * JDk1.5���ԣ��Զ�װ��Ͳ���
 * */

import java.util.ArrayList;

public class IntegerDemo2 {

	public static void main(String[] args) {
		//Integer i = new Integer(10);
		
		//�Զ�װ��
		//�൱�ڣ�Integer i = new Integer(10);
		//Integer i = 10;
		
		//�Զ�����
		//�൱�ڣ�int a = i.intValue();
		//Integer i = 10;
		//int a = i;
		
		Integer i = 10;
		Integer i2 = 10;
		Integer i3 = i + i2;
		/*
		 * Integer i3 = new Integer(i.intValue() + i2.intValue());
		 * 
		 */
		
		ArrayList list = new ArrayList();
		list.add(1);//�Զ�װ�䣬list.add(new Integer(1));
	}

}
