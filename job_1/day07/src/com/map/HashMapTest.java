package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Map<String,String>> map = new HashMap<String, Map<String,String>>();
		
		Map<String, String> base = new HashMap<String, String>();
		
		base.put("001", "xcm");
		base.put("002", "xgd");

		Map<String, String> job = new HashMap<String, String>();
		
		job.put("001", "xcm");
		job.put("002", "xgd");
		
		map.put("������", base);
		map.put("��ҵ��", job);
		
		Set<Entry<String, Map<String, String>>> entrys = map.entrySet();
		for (Entry<String, Map<String, String>> entry : entrys) {
			String key = entry.getKey();
			System.out.println("�༶��"+key);
			
			Map<String, String> value = entry.getValue();
			Set<Entry<String, String>> stu = value.entrySet();
			for (Entry<String, String> entry2 : stu) {
				String key2 = entry2.getKey();
				String value2 = entry2.getValue();
				System.out.println("ѧ�ţ�"+key2+",������"+value2);
			}
		}
		
		System.out.println("--------------");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			Map<String, String> value = map.get(key);
			System.out.println("�༶��"+key);
			
			Set<String> keys1 = value.keySet();
			for (String key1 : keys1) {
				String value1 = value.get(key1);
				System.out.println("ѧ�ţ�"+key1+",������"+value1);
			}
		}
	}

}
