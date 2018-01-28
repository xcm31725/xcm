package com.itheima3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String str = "sdadsadgasad";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chs = str.toCharArray();
		
		for (Character c : chs) {
			if(map.containsKey(c)){
				//int value = map.get(c);
				//value++;
				//map.put(c, value);
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		/*
		for (int i = 0; i < chs.length; i++) {
			Character s = chs[i];
			Integer count = map.get(i);
			
			if(count == null) {
				count = 0;
			}
			count++;
			map.put(s, count);
		}*/
		
		String st = "";
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			Integer value = map.get(key);
			st = key + "=" + (value +"");
			//System.out.println(key + "=" + value);
		}
		
	System.out.println(st);
	}

}
