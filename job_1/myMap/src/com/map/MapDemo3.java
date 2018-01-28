package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 	Map�ĵڶ��ֱ�����ʽ��
 * 		ͨ�����֤��������ȡ�ɷ��ϱ��
 * 
 *  class ���֤<K,V> {
 *  	K �ɷ�;
 *  	V ϱ��;
 *  
 *  	public ���֤(K �ɷ�V ϱ��) {
 *  		this.�ɷ� = �ɷ�;
 *  		this.ϱ�� = ϱ��;
 *  	}
 *  
 *  
 *  	public K get�ɷ�() {
 *  		return �ɷ�;
 *  	}
 *  
 *  	public V getϱ��() {
 *  		return ϱ��;
 *  	}
 *  }
 *  
 *  
 *  class Entry<K,V> {
 *  	K key;
 *  	V value;
 *  
 *  	public Entry(K key��V value) {
 *  		this.key = key;
 *  		this.value = value;
 *  	}
 *  
 *  
 *  	public K getKey() {
 *  		return key;
 *  	}
 *  
 *  	public V getValue() {
 *  		return value;
 *  	}
 *  }
 *  
 *  Set<Map.Entry<K,V>> entrySet()  
 * 
 */
public class MapDemo3 {

	public static void main(String[] args) {
		//����Map����
		Map<String,String> map = new HashMap<String,String>();
		
		//���ӳ���ϵ
		map.put("xgd", "xcm");
		map.put("sd", "zc");
		map.put("lm", "xn");
		//��ȡ���еĽ��֤����
		Set<Map.Entry<String, String>> entrys = map.entrySet();
		//���������˽��֤����ļ���
		for (Map.Entry<String, String> entry : entrys) {
			//��ȡÿ�������Ľ��֤����
			//ͨ�����֤�����ȡ�ɷ��ϱ��
			String key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println("�ɷ�"+key+"\t"+"���ӣ�"+value);
		}
	}

}
