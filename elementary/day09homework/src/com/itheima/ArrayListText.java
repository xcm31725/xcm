package com.itheima;

import java.util.ArrayList;

public class ArrayListText {

	public static void main(String[] args) {
		//�������϶���
		ArrayList<String> array = new ArrayList<String>();
		
		//2.�򼯺�������������ݣ�
		array.add("�����");
		array.add("��˽�");
		array.add("ɳ����");
		array.add("���ȹ���");
		
		//3.���ñ�����ֱ�Ӵ�ӡ����
		System.out.println(array);
		
		//4.��ȡ��4��Ԫ�أ�ע�⣬��--��4��Ԫ�أ����������ǣ���
		array.get(3);
		
		//5.��ӡһ�¼��ϴ�С
		System.out.println("len:"+array.size());
		
		//6.ɾ��Ԫ�ء����ȹ�����
		array.remove("���ȹ���");
		
		//7.ɾ����3��Ԫ�أ�ע�⣺��--��3��Ԫ�أ�
		array.remove(2);
		
		//8.��Ԫ�ء���˽䡱��Ϊ�������ܡ�
		array.set(1, "������");
		
		//9.�ٴδ�ӡ����
		System.out.println(array);
		
	}

}
