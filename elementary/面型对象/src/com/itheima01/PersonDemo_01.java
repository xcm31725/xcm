package com.itheima01;

public class PersonDemo_01 {

	public static void main(String[] args) {
		Preson01 p = new Preson01();
		p.preson();
	}

}

/*
 * A�����췽������������
 		*����������ݣ����ԣ����г�ʼ��
 * B�����췽����ʽ�ص�
 		*a����������������ͬ����СҲҪ������һ�£�
 		*b��û�з���ֵ���ͣ���void��û��
 		*c��û�������ķ���ֵreturn  		
*/

class Preson01{
		private String name;
		private int age;
		
		public Preson01(){//���췽��û�з���ֵ�뷵��ֵ�����޹�ֻ�������б�
			
			name = "����";
			age = 23;
			
			
		}
		public void preson(){
			System.out.println(name+"HelloWorld!"+age);
		}
}