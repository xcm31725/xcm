package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Set<K> keySet()  
 * Collection<V> values()  
 * */
public class MapDemo1 {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("001", "xcm");
		map.put("002", "xgd");
		map.put("003", "xsd");
		
//		method(map);
		
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println(value);
		}
	}

	private static void method(Map<String, String> map) {
		//Set<K> keySet()
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key);
		}
	}

}
