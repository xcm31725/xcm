package com.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Student,String> map = new HashMap<Student,String>();
		
		map.put(new Student("xcm",18), "001");
		map.put(new Student("xgd",23), "002");
		map.put(new Student("xgd",23), "002");
		
		//方式一：
		Set<Student> keys = map.keySet();
		
		for (Student key : keys) {
			String value = map.get(key);
			System.out.println(key+"\t"+value);
		}
		System.out.println("---------------");
		//方式二：
		Set<Map.Entry<Student, String>> entrys = map.entrySet();
		for (Map.Entry<Student, String> entry : entrys) {
			Student key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key+"\t"+value);
		}
	}

}
