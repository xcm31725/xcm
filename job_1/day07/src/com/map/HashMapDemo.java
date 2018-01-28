package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//����Map����
		HashMap<String,String> map = new HashMap<String,String>();
		
		//���Ԫ��
		map.put("xcm", "xgd");
		map.put("xn", "lm");
		map.put("zc", "sd");
		
		//����Map��ÿһԪ��
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			//ͨ��key�ҵ���Ӧ��valueֵ
			String value = map.get(key);
			
			System.out.println("key:"+key+"\t"+"value:"+value);
		}
		
		System.out.println("-----------------------");
		
		//��Ϊ�������㣺����Map��ÿһԪ��
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		
		for (Map.Entry<String, String> entry : entrys) {
			//��ȡû��keyֵ
			String key = entry.getKey();
			//��ȡÿ��valueֵ
			String value = entry.getValue();
			
			System.out.println("key:"+"\t"+"value:"+value);
		}
	}

}
