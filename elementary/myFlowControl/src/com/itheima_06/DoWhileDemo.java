package com.itheima_06;
/*
 * do...whileѭ���Ļ�����ʽ��
 * 		do {
 * 			ѭ�������;
 * 		}while(�ж��������);
 * ��չ��ʽ��
 * 		��ʼ�����;
 * 		do {
 * 			ѭ�������;
 * 			�����������;
 * 		}while(�ж��������);
 * ִ�����̣�
 * 		A:ִ�г�ʼ�����;
 * 		B:ִ��ѭ�������;
 * 		C:ִ�п����������;
 * 		D:ִ���ж�������䣬����true����false
 * 			�����true���ص�B����
 * 			�����false���ͽ���
 * 
 * ��ϰ��
 * 		��Ͱ���
 * 		ͳ��ˮ�ɻ�����
 */
public class DoWhileDemo {
	public static void main(String[] args) {
		//���10�� HelloWorld
		/*
		for(int x=1; x<=10; x++) {
			System.out.println("HelloWorld");
		}
		*/
		
		//do...while��д
		int x=1;
		do {
			System.out.println("HelloWorld");
			x++;
		}while(x<=10);
	}
}