package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDmeo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("zc", "23");
		map.put("xcm", "18");
		map.put("xgd", "23");
		map.put("zc", "17");
		
		//map.clear();
		//System.out.println(map.remove("zc"));
		
		//System.out.println(map.isEmpty());
		//System.out.println(map.containsValue("13"));
		//System.out.println(map.containsKey("zc"));
		
		System.out.println(map.size());
		
		System.out.println(map);
		System.out.println("-------------");
		Set<Entry<String,String>> entrys = map.entrySet();
		for (Map.Entry<String, String> entry : entrys) {
			String key = entry.getKey();
			String value = entry.getValue();
			//System.out.println(entry);
			System.out.println("key:"+key+","+"value:"+value);
		}
		
		System.out.println("-------------");
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			String value = map.get(key);
			System.out.println("key:"+key+","+"value:"+value);
		}
	}
}
