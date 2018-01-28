package com.map;
/*
 * Map的第一种遍历方式：
 * 		首先召集所有的丈夫
 * 		遍历所有的丈夫
 * 		获取每一个丈夫
 * 		让每一个丈夫去找他自己的媳妇
 * */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		//创建Map对象
		Map<String,String> map = new HashMap<String,String>();
		
		//添加映射关系
		map.put("xgd", "xcm");
		map.put("sd", "zc");
		map.put("lm", "xn");
		
		//遍历Map对象
		//首先召集所有的丈夫
		Set<String> keys = map.keySet();
		//遍历所有的丈夫
		for (String key : keys) {
			//让每一个丈夫去找他自己的媳妇
			String value = map.get(key);
			System.out.println("丈夫:"+key+"\t"+"妻子:"+value);
		}
	}

}
