package com.itheima01;

public class PresonDemo_03 {

	public static void main(String[] args) {
		Preson03 p = new Preson03("����",23);
		//p = new Preson03("����һ",23);   //���ǿ����Ǹ������֣���ʵ���ǰ�ԭ���ı��������
		System.out.println(p.getName()+"..."+p.getAge());
		
		System.out.println("----------------------");
		
		Preson03 p1 = new Preson03();//�����ղι������
		p1.setName("����");
		p1.setAge(24);
		
		p1.setName("���");
		System.out.println(p1.getName()+"..."+p1.getAge());
	}

}
/*
 * ���췽��
	*�����Խ��г�ʼ�� 
 * setXxx����
 	*�޸�����ֵ
 	*�����ַ�ʽ���ڿ�������setXxx����һЩ����Ϊ�Ƚ���� 
 */

class Preson03{
	private String name;
	private int age;
	
	public Preson03(){     //�ղι���
	}
	
	public Preson03(String name,int age){// �вι���
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){//��������
		this.name = name;
	}
	public String getName(){//��ȡ����
		return name;
	}
	
	public void setAge(int age){//��������
		this.age = age;
	}
	public int getAge(){//��ȡ����
		return age;
	}
}