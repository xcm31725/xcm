package com.itheima_07;
/*
 * break:�жϵ���˼
 * ʹ�ó�����
 * 		A:switch�����
 * 		B:ѭ����
 * ע�⣺
 * 		�뿪ʹ�ó�����û������ġ�
 * ���ã�
 * 		����ѭ������ѭ����ǰ����
 */
public class BreakDemo {
	public static void main(String[] args) {
		//break;
		
		for(int x=1; x<=10; x++) {
			if(x == 3) {
				break;
			}
			System.out.println("HelloWorld");
		}
	}
}
