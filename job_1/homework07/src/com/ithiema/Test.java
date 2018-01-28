package com.ithiema;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 * 1、产生10个1-20之间的随机数要求随机数不能重复
		提示:
			1,集合的选用(双列集合(只能是HashMap)还是单列集合(List还是Set))
			2,确定循环的次数
 * */
public class Test {

	public static void main(String[] args) {
		Random r = new Random();
		
		Set<Integer> list = new HashSet<Integer>();
		
		while(list.size()<10){
			int num = r.nextInt(20)+1;
			/*String s = num+"";
			if(!list.contains(s)){
				list.add(e);
			}*/
			list.add(num);
		}
		
		for (Integer in : list) {
			System.out.println(in);
		}
		
	}

	private static void method(Random r) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i = 0; i < map.size(); i++){
			
			int num = r.nextInt(20)+1;
			
			Integer count = map.get(r);
			if(count == null){
				count = 0;
			}
			count++;
			map.put(num, count);
		}
	
		Set<Map.Entry<Integer,Integer>> entrys = map.entrySet();
		for (Map.Entry<Integer, Integer> entry : entrys) {
			Integer key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("key:"+key+"\t"+"value:"+value);
		}
	}

}

