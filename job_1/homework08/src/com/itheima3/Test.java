package com.itheima3;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 3�������������󣬲��ô���ʵ�֣�
		(1)����ArrayList<String>���ϣ��������ַ��� 
		(2)��������Ԫ���а����������滻��'*'�ַ� 
			ʹ��String���е�String replaceAll(String regex, String replacement)����
		(3)Ȼ�����õ���������ǿfor���ַ�ʽ��������Ԫ�ز����
 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("asd2sd");
		list.add("asd2sadsd");
		list.add("asdsd");
		list.add("asasd");
		list.add("123124");
		
		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			//String s2 = s.replaceAll(".*\\d.*", "[a-zA-Z]*\\*[a-zA-Z]*");
			list.set(i, s.replaceAll("\\d", "*"));
		}
		
		for (String string : list) {
			System.out.println(string);
		}
		System.out.println("-------------------");
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
