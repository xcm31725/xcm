package com.ithiema4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 4�������������󣬲��ô���ʵ�֣�
		(1)ͳ��ÿ�����ʳ��ֵĴ���
		(2)�������ַ���"If you want to change your fate I think you must come to the dark horse to learn java"(�ÿո���)
		(3)��ӡ��ʽ��
			to=3
			think=1
			change=1
			....
 * */
public class Test {

	public static void main(String[] args) {
		String str = "If you want to change your fate I think you must come to the dark horse to learn java";
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		String[] sts = str.split(" ");

		/*for (String string : sts) {
			System.out.println(string);
		}*/
		
		for (int i = 0; i < sts.length; i++) {
			
			String s = sts[i];
			Integer count = map.get(s);
			
			if(count == null){
				count = 0;
			}
			
			count++;
			map.put(s, count);
		}
		
		/*Set<Map.Entry<String,Integer>> entrys = map.entrySet();
		for (Map.Entry<String, Integer> entry : entrys) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key+"("+value+"),");
		}*/
		
		Set<String> keys = map.keySet();
		for (String key : keys) {
			Integer value = map.get(key);
			System.out.println(key+"="+value);
		}
	}

}
