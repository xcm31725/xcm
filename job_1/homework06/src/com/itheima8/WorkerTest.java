package com.itheima8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * 8�������������󣬲��ô���ʵ�֣�
		(1)����һ��Worker����(����˽�С��ղ��вι��졢set��get������toString����)��
			�����������ԣ�����(String name)������(int age)������(double salary),
			��Worker���ж���work������ӡһ�仰��
			�磺"��� ���ڹ���"������"���"����ǰ���������
		(2)����List���ϣ���List��������������Ա����������Ϣ���£�
			"���" 18 20000
			"ŷ����" 60 8000
			"���»�" 40 30000
		(3)��"ŷ����"֮ǰ����һ��Ա������ϢΪ��������"�Ű�֥"�����䣺35������3300
		(4)ɾ��"���»�"����Ϣ
		(5)����for ѭ����������ӡList ������Ա������Ϣ
		(6)���õ�����������List �����е�Ա������work ����
 * */
public class WorkerTest {

	public static void main(String[] args) {
		List<Worker> list = new ArrayList<Worker>();
		
		list.add(new Worker("���",18,20000));
		list.add(new Worker("ŷ����",60,8000));
		list.add(new Worker("���»�",40,30000));
		
		list.add(1, new Worker("�Ű�֥",35,3300));
		
		list.remove(3);
		
		//ʹ��forѭ����������
		for (int i = 0; i < list.size(); i++) {
			Worker w = list.get(i);
			System.out.println(w);
		}
		
		System.out.println("-----------------");
		
		//ʹ�õ�������������
		Iterator<Worker> it = list.iterator();
		
		while(it.hasNext()){
			it.next().work();
		}
	}

}
