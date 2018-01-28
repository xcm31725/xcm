package com.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * 
 * @ClassName: PropertiesDemo1  
 * @Description: TODO 
 * 特点：
 * 		Hashable的子类，Map集合中的方法都可以使用
 * 		给集合没有泛型。键值都是String
 * 		它是一个持久化的属性集。键值可以存储到集合中，也可以存储在持久化的设备（硬盘、U盘、光盘）上。键值的来源也可以是持久化的设备
 * 		有和流技术相结合的方法
 * 
 * Properties：表示了一个持久的属性集，属性列表中每个键及其对应值都是一个字符串
 * 
 * 构造方法：
 * 		Properties() 
 * @author sudong
 * @date 2018年1月22日 上午11:43:26  
 *
 */
public class PropertiesDemo1 {

	public static void main(String[] args) {
		Properties p = new Properties();
		
		p.put("xcm", "17");
		p.put("xgd", "22");
		p.put("zc", "18");
		p.put("sd", "23");
		
		Set<Object> keys = p.keySet();
		for (Object key : keys) {
			Object obj = p.get(key);
			
			System.out.println(key+"="+obj);
		}
		
		System.out.println("--------------");
		Set<Map.Entry<Object, Object>> entrys = p.entrySet();
		for (Map.Entry<Object, Object> entry : entrys) {
			Object value = entry.getValue();
			Object key = entry.getKey();
			
			System.out.println(key+"="+value);
		}
	}

}
