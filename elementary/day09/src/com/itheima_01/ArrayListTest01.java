package com.itheima_01;

import java.util.ArrayList;

public class ArrayListTest01 {
	public static void main(String[] args) {
		String[] arrArray = {"xcm","xka","zc","gd","xn"};
		
		//��������
		ArrayList<String> array = new ArrayList<String>();
		
		//�������鲢�������е�Ԫ����ӵ�������
		for (int i = 0; i < arrArray.length; i++) {
			array.add(arrArray[i]);
		}
		
		//�����x��ͷ��
		/*for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			if(s.startsWith("x")){
				System.out.println(s);
			}
			
		}*/
		
		//ɾ����x��ͷ��
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			if(s.startsWith("x")){
				array.remove(i);
				i--;
			}
		}
		
		System.out.println(array);
	}
}
