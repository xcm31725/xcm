package com.foreach;

import java.util.ArrayList;
import java.util.Collection;

/*
 * foreach����ǿforѭ����һ�����ڱ������ϻ�������
 * 
 * ��ʽ��
 * 		for(Ԫ�ص����� ���������ϻ����������){
 * 			����ֱ��ʹ�ñ���
 * 		}
 * ע�⣺����ǿforѭ���в����޸ļ��ϣ��������ֲ����޸��쳣
 * */
public class ForEachDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("xcm");
		c.add("xgd");
		c.add("xn");
		
		for (String string : c) {
			c.add("xtx");// java.util.ConcurrentModificationException �� �����޸��쳣
			System.out.println(string);
		}
	}

}
