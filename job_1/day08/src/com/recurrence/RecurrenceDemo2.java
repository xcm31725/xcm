package com.recurrence;

import java.util.HashMap;

public class RecurrenceDemo2 {

	static HashMap<Integer,Long> map = new HashMap<Integer,Long>();
	
	public static void main(String[] args) {
		long satrt = System.currentTimeMillis();
		System.out.println(tZ(120));
		long end = System.currentTimeMillis();
		System.out.println((end-satrt));
	}
	
	public static long tZ(Integer n) {
		if(n == 1){
			return 1;
		}else if(n == 2) {
			return 1;
		}
		
		if(map.containsKey(n)) {
			return map.get(n);
		}else {
			map.put(n, tZ(n - 1) + tZ(n - 2));
		}
		return tZ(n - 1) + tZ(n - 2);
	}
}
