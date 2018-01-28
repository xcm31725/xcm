package com.ithiema3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 3、有一个字符串,内容是: String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		编写代码,统计每个字符出现的次数, 
		输出的结果如下: D(1), (9),!(1),e(1),A(1)....
		
		提示:
			1,统计字符出现的次数,集合中要存储字符和次数,所以选择的是双列集合
				判断key存储的是什么数据类型的对象,value存储的是什么数据类型的对象
				
			2,分析:
				(1)遍历字符串,获取每一个字符
				(2)判断集合中是否包含该字符
					是,根据该字符获取对应的value值,对value值加1后存入到双列集合中
					否,向双列集合添加元素,key为该字符,value为1
				(3)遍历双列集合,按指定格式输出
 * */
public class Test {

	public static void main(String[] args) {
		String str="heima shi wo jia, Da Jia Yao Ai Hu Ta!";
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] chs = str.toCharArray();
		/*for (char c : chs) {
			System.out.println(c);
		}*/
		
		for (Character c : chs) {
			if(map.containsKey(c)){
				int value = map.get(c);
				value++;
				map.put(c, value);
				//map.put(c, map.get(chs)+1);
			}else{
				map.put(c, 1);
			}
		}
		
		/*for(int i=0; i<chs.length; i++){
			char ch = chs[i];
			Integer count = map.get(ch);
			if(count == null){
				count = 0;
			}
			count++;
			map.put(ch, count);
		}*/
		
		Set<Map.Entry<Character,Integer>> entrys = map.entrySet();
		for (Map.Entry<Character, Integer> entry : entrys) {
			Character key = entry.getKey();
			Integer value = entry.getValue();
			System.out.print(key+"("+value+"),");
		}
	}

}
