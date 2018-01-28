package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		//创建Map对象
		HashMap<String,String> map = new HashMap<String,String>();
		
		//添加元素
		map.put("xcm", "xgd");
		map.put("xn", "lm");
		map.put("zc", "sd");
		
		//遍历Map中每一元素
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			//通过key找到对应的value值
			String value = map.get(key);
			
			System.out.println("key:"+key+"\t"+"value:"+value);
		}
		
		System.out.println("-----------------------");
		
		//更为面向对象点：遍历Map中每一元素
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		
		for (Map.Entry<String, String> entry : entrys) {
			//获取没个key值
			String key = entry.getKey();
			//获取每个value值
			String value = entry.getValue();
			
			System.out.println("key:"+"\t"+"value:"+value);
		}
	}

}
