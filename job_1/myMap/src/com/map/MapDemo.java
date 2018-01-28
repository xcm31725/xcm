package com.map;
/*
 * ����ʵ��ѧ�ź����������ж�Ӧ��ϵ�����ݴ洢
 * Ϊ�����������ֶ�Ӧ��ϵ�����ݣ�����ʹ����ǰѧ���ĵ������ǿ���ʵ�ֵģ������в��㣬����Java���ṩ��һ��ר�����ڴ����Ӧ��ϵ�ļ��ϣ�Map
 * 
 * Map������ֵӳ�䵽ֵ�Ķ���һ��ӳ�䲻�ܰ����ظ��ļ���ÿ�������ֻ��ӳ�䵽һ��ֵ
 * 
 * Map��Collection������
 * 		Map����һ��˫�м��ϣ���������䴦���ж�Ӧ��ϵ�����ݣ�key�ǲ������ظ��ģ����ǳ�֮Ϊ���޶Լ���
 * 		Collection���ǵ��м��ϣ�Collection�в�ͬ������ϵ���е��������ظ����������еĲ������ظ�����������ô����Ҳ���Գ�֮Ϊ����
 * 
 * һ��һ��һ��ѧ�Ŷ�Ӧһ������
 * */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * 	Map�ĳ��ù��ܣ�
 * 		ӳ�书�ܣ�
 * 			 	V put(K key, V value) 
 * 		��ȡ���ܣ�
 * 				V get(Object key) 
 * 				int size() 
 * 		�жϹ��ܣ�
 * 				boolean containsKey(Object key) 
 				boolean containsValue(Object value) 
 				boolean isEmpty() 
 
 * 		ɾ�����ܣ�
 * 				void clear()  
 * 				V remove(Object key)  
 * 
 * 		�������ܣ�
 * 				Set<Map.Entry<K,V>> entrySet() 
 * 
 * 
 * 			Set<K> keySet()  
 * 			Collection<V> values()  
 
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String,String>();
		
		//V put(K key, V value):���ǽ�keyӳ�䵽value�����key���ڣ��򸲸�value������ԭ����value����
		map.put("001", "xcm");
		map.put("002", "xgd");
		map.put("001", "xxn");
		
		//void clear():ɾ������
		//V remove(Object key) :ɾ��ָ��key��valueֵ�������ظ�valueֵ
		//System.out.println(map.remove("002"));
		//map.clear();
		
		//boolean containsKey(Object key) :�ж�ָ��key�Ƿ����
		//System.out.println(map.containsKey("003"));
		
		//boolean containsValue(Object value) :�ж�ָ����valueֵ�Ƿ����
		//System.out.println(map.containsValue("xgd"));
		
		//boolean isEmpty() :�ж��Ƿ��ж�Ӧ��ϵ
		//System.out.println(map.isEmpty());
		
		//int size():���ض�Ӧ��ϵ�ĸ���
		System.out.println(map.size());
		
		//V get(Object key) :����ָ����key���ض�Ӧ��value
		//System.out.println(map.get("001"));
		
		//Set<Map.Entry<K,V>> entrySet() 
		
		Set<Map.Entry<String,String>> entrys = map.entrySet();
		
		for (Entry<String, String> entry : entrys) {
			System.out.println(entry);
		}
		
		System.out.println(map);
		
		  
	}

}
