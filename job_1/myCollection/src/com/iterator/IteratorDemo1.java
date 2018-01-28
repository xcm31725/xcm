package com.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/*
 * �����жϼ������Ƿ����Ԫ��java������������Ԫ��android
 * Exception in thread "main" java.util.ConcurrentModificationException:�����޸��쳣
 * �������������ڼ��ϵģ��൱�ڼ��ϵ�һ�����������������ڲ�����ʱ��������ֺͼ��ϲ�һ�������׳��쳣
 * 
 * ���������
 * 		��ʹ�õ�����
 * 		��ʹ�õ��������б�����ʱ��ʹ�õ������������޸�
 * */
public class IteratorDemo1 {

	public static void main(String[] args) {
		//method();
		//Collection c = new ArrayList();
		List c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		/*//����ÿһ��Ԫ�ؽ��бȽ�
		Iterator it = c.iterator();
		while(it.hasNext()){
			String s = (String)it.next();
			if(s.contains("czm")){
				c.add("xn");//Exception in thread "main" java.util.ConcurrentModificationException
			}
		}
		
		*/
		System.out.println(c);
		ListIterator lit = c.listIterator();
		
		while(lit.hasNext()){
			String s = (String)lit.next();
			if(s.equals("czm")){//boolean hasNext():����������б�ʱ������б�������ж��Ԫ�أ��򷵻� true
				lit.add("xn");
				//System.out.println();
			}
		}
		System.out.println(c);
	}

	private static void method() {
		Collection c = new ArrayList();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		if(c.contains("xn")){
			c.add("xn");
		}
		
		System.out.println(c);
	}

}
