package com.itheima;

import java.util.ArrayList;

public class ArrayArrayTest01 {

	public static void main(String[] args) {
		//�����ַ�������
		String[] str = {"������","���޼�","��Ԫ��","��ӡ","�Ŵ�ɽ","��ͷ"};
		
		//��������
		ArrayList<String> array = new ArrayList<String>();
		
		//�����ַ������飬�������ϸ�ֵ
		for (int i = 0; i < str.length; i++) {
			array.add(str[i]);
		}
		for (int i = 0; i < array.size(); i++) {
			String s1 = array.get(i);
			if(s1.startsWith("��")){
				System.out.println(s1);
			}
		}

	}

}
