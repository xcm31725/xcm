package com.foreach;

import java.util.ArrayList;
import java.util.Collection;

public class ForEachDemo {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		
		c.add("xcm");
		c.add("xgd");
		c.add("czm");
		
		/*for (Object object : c) {
			System.out.println(object);
		}*/
		for (String string : c) {
			//c.add("xsg");
			/*
			 * Exception in thread "main" java.util.ConcurrentModificationException:�����޸��쳣
			 * 
			 * ��ǿforѭ���ĵײ���ǵ����������Ѳ����ü��ϵķ������Ԫ��
			 * */
			System.out.println(string);
		}
	}

}
