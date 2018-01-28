package com.ithiema2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 2、定义一个Map，存储如下内容：
		老师		课程
		Tom			Java
		John		Oracle
		Susan		Oracle
		Jerry		JDBC
		Jim			Linux
		Kevin		JSP
		Lucy		JSP
		
		完成以下要求：
			1).增加一位新老师Allen教JDBC;
			2).Lucy改为教Java
			3).使用两种方式遍历集合；
			4).输出所有教JDBC的讲师
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
		
		System.out.println("老师\t课程");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		
		System.out.println("--------------");
		
		System.out.println("老师\t课程");
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"\t"+value);
		}
		System.out.println("--------------------");
		
		System.out.println("老师\t课程");
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
