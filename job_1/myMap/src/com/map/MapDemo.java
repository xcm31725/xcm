package com.map;
/*
 * 需求：实现学号和姓名这样有对应关系的数据存储
 * 为了体现这种又对应关系的数据，我们使用以前学过的的内容是可以实现的，但略有不便，所以Java又提供了一种专门用于储存对应关系的集合，Map
 * 
 * Map：将键值映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值
 * 
 * Map和Collection的区别？
 * 		Map：是一个双列集合，常用来语句处理有对应关系的数据，key是不可以重复的，我们称之为夫妻对集合
 * 		Collection：是单列集合，Collection有不同的子体系，有的允许有重复索引有序，有的不允许重复而且无序，那么我们也可以称之为单身汉
 * 
 * 一对一：一个学号对应一个姓名
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	Map的常用功能：
 * 		映射功能：
 * 			 	V put(K key, V value) 
 * 		获取功能：
 * 				V get(Object key) 
 * 				int size() 
 * 		判断功能：
 * 				boolean containsKey(Object key) 
 				boolean containsValue(Object value) 
 				boolean isEmpty() 
 
 * 		删除功能：
 * 				void clear()  
 * 				V remove(Object key)  
 * 
 * 		遍历功能：
 * 				Set<Map.Entry<K,V>> entrySet() 
 * 
 * 
 * 			Set<K> keySet()  
 * 			Collection<V> values()  
 
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		//V put(K key, V value):就是将key映射到value，如果key存在，则覆盖value，并将原来的value返回
		map.put("001", "xcm");
		map.put("002", "xgd");
		map.put("001", "xxn");
		
		//void clear():删除所有
		//V remove(Object key) :删除指定key的value值，并返回该value值
		//System.out.println(map.remove("002"));
		//map.clear();
		
		//boolean containsKey(Object key) :判断指定key是否存在
		//System.out.println(map.containsKey("003"));
		
		//boolean containsValue(Object value) :判断指定的value值是否存在
		//System.out.println(map.containsValue("xgd"));
		
		//boolean isEmpty() :判断是否有对应关系
		//System.out.println(map.isEmpty());
		
		//int size():返回对应关系的个数
		System.out.println(map.size());
		
		//V get(Object key) :根据指定的key返回对应的value
		//System.out.println(map.get("001"));
		
		//Set<Map.Entry<K,V>> entrySet() 
		
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		
		for (Entry<String, String> entry : entrys) {
			System.out.println(entry);
		}
		
		System.out.println(map);
		
		  
	}

}
