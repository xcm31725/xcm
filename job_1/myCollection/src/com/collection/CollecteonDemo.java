package com.collection;

import java.util.ArrayList;

/*
 * ArrayList
 * ���ϵ���ϵ�ṹ
 * 		���ڲ�ͬ�����ݽṹ���������֯���洢��ʽ��������JavaΪ�����ṩ�˲�ͬ����
 * 		���ǲ�ͬ�ļ������ǵĹ��ܶ������ƣ����ϵ�������ȡ�������Գ�ȡ��������Ǽ�����ϵ�ṹ�γɵ�ԭ��
 * 
 * ��ϵ�ṹ��
 * 		��ôѧϰ����㿪ʼѧϰ����Ϊ�����������еĹ���
 * 		��ôʹ�ã�ʹ����ײ㣬��Ϊ��ײ���Ǿ����ʵ��
 * 
 * Collection
 * List
 * ArrayList
 * */
public class CollecteonDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}*/
		System.out.println(list);
	}

}
