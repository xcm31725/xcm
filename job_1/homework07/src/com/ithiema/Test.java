package com.ithiema;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 * 1������10��1-20֮��������Ҫ������������ظ�
		��ʾ:
			1,���ϵ�ѡ��(˫�м���(ֻ����HashMap)���ǵ��м���(List����Set))
			2,ȷ��ѭ���Ĵ���
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

