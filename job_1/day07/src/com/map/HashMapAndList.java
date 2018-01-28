package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapAndList {

	public static void main(String[] args) {
		Map<String, List<Student1>> map = new HashMap<String, List<Student1>>();
		
		List<Student1> base = new ArrayList<Student1>();
		
		base.add(new Student1("001","xcm"));
		base.add(new Student1("002","xgd"));
		
		List<Student1> job = new ArrayList<Student1>();
		
		job.add(new Student1("001","zc"));
		job.add(new Student1("002","sd"));
		
		map.put("基础班", base);
		map.put("就业班", job);
		
		Set<Entry<String, List<Student1>>> entrys = map.entrySet();
		for (Entry<String, List<Student1>> entry : entrys) {
			String key = entry.getKey();
			System.out.println("班级:"+key);
			List<Student1> value = entry.getValue();
			
			for (Student1 student1 : value) {
				System.out.println(student1);
			}
			
		}
		
		System.out.println("----------------");
		Set<String> keys = map.keySet();
		for (String key : keys) {
			List<Student1> stu = map.get(key);
			System.out.println("班级:"+key);
			for (Student1 student1 : stu) {
				System.out.println(student1);
			}
		}
		
	}

}
