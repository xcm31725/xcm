package com.ithiema2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 2������һ��Map���洢�������ݣ�
		��ʦ		�γ�
		Tom			Java
		John		Oracle
		Susan		Oracle
		Jerry		JDBC
		Jim			Linux
		Kevin		JSP
		Lucy		JSP
		
		�������Ҫ��
			1).����һλ����ʦAllen��JDBC;
			2).Lucy��Ϊ��Java
			3).ʹ�����ַ�ʽ�������ϣ�
			4).������н�JDBC�Ľ�ʦ
 * */
public class Test {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("Tom", "Java");
		map.put("John", "Oracle");
		map.put("Susan", "Oracle");
		map.put("Jerry", "JDBC");
		map.put("Jim", "Linux");
		map.put("Keyin", "JSP");
		map.put("Lucy", "JSP");
		map.put("Allen", "JDBC");
		map.put("Lucy", "Java");
		
		System.out.println("��ʦ\t�γ�");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println("--------------");
		
		System.out.println("��ʦ\t�γ�");
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"\t"+value);
		}
		System.out.println("--------------------");
		
		System.out.println("��ʦ\t�γ�");
		Set<Map.Entry<String, String>> entrys1 = map.entrySet();
		for (Map.Entry<String, String> entry : entrys1) {
			String key = entry.getKey();
			String value = entry.getValue();
			if(value.equals("JDBC")){
				System.out.println(key+"\t"+value);
			}
		}
		
	}

}
