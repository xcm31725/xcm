package com.itheima_07;
/*
 * continue:��������˼
 * ʹ�ó�����
 * 		ѭ����
 * ע�⣺
 * 		�뿪ʹ�ó�����û�������
 * ���ã�
 * 		����һ��ѭ����������һ�ε�ѭ��
 * ����
 * 		break:�˳�ѭ��
 * 		continue:����һ��ѭ����������һ�ε�ѭ��
 */
public class ContinueDemo {
	public static void main(String[] args) {
		//continue;
		
		for(int x=1; x<=10; x++) {
			if(x == 3) {
				//break;
				continue;
			}
			System.out.println("HelloWorld");
		}
	}
}
