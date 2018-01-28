package com.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ʹ��HashSet�����ַ���������
 * 
 * Set���ϵ��ص���
 * 		���򣨴���Ͷ�ȡ��˳����ܲ�һ����
 * 		�������ظ���Ҫ��Ԫ��Ψһ��
 * 		û������
 * */
public class HashSetDemo {

	public static void main(String[] args) {
		//�������϶���
		//HashSet<String> hs = new HashSet<String>();
		Set<String> set = new HashSet<String>();
		//���Ԫ��
		set.add("xcm");
		set.add("xgd");
		set.add("xlm");
		
		//�������϶���
		//ͨ��toArray()
		//method(set);
		
		//ͨ������������
		//method1(set);
		
		//ͨ����ǿforѭ��
		for (String string : set) {
			System.out.println(string);
		}
	}
	
	//ͨ������������
	private static void method1(Set<String> set) {
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	//ͨ��toArray()
	private static void method(Set<String> set) {
		Object[] str = set.toArray();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

}
