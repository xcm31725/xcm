package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		List l = new ArrayList();
		
		//��ָ�����������Ԫ��
		l.add(0, "xcm");
		l.add(0, "xgd");
		l.add(1, "czm");
		
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		System.out.println(l);
		
		System.out.println("-----------");
		//ɾ��ָ��Ԫ��
		//System.out.println(l.remove(1));
		
		//�޸�ָ��������Ԫ�أ����������Ԫ��
		System.out.println(l.set(1, "xgs"));
		/*for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}*/
		System.out.println(l);
		
	}

}
