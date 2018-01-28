package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemp01 {

	public static void main(String[] args) {
		Map<String,Student> hs = new HashMap<String, Student>();
		
		hs.put("001", new Student("xcm",17));
		hs.put("002", new Student("xgd",22));
		hs.put("003", new Student("zc",18));
		hs.put("004", new Student("sd",23));
		hs.put("005", new Student("sd",23));
		hs.put("006", new Student("zc",18));
		
		Set<String> keys = hs.keySet();
		for (String key : keys) {
			Student value = hs.get(key);
			System.out.println("key:"+key+"\t"+"value:"+value);
		}
		System.out.println("--------------");
		
		Set<Map.Entry<String, Student>> entrys = hs.entrySet();
		for (Map.Entry<String, Student> entry : entrys) {
			String key = entry.getKey();
			Student value = entry.getValue();
			System.out.println("key:"+key+"\t"+"value:"+value);
		}
	}

}

class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
	
}