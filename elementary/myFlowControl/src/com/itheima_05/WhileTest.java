package com.itheima_05;
/*
 * ��1-100֮�͡�
 * ��ϰ��ͳ��ˮ�ɻ�������
 */
public class WhileTest {
	public static void main(String[] args) {
		//�ع�forѭ��ʵ��
		
		/*
		//������ͱ���
		int sum = 0;
		//��ȡ1-100֮�������
		for(int x=1; x<=100; x++) {
			//�ۼ�
			sum += x;
		}
		System.out.println("1-100�ĺ��ǣ�"+sum);
		*/
		
		//whileѭ��ʵ��
		//������ͱ���
		int sum = 0;
		int x = 1;
		while(x<=100) {
			sum += x;
			x++;
		}
		System.out.println("1-100�ĺ��ǣ�"+sum);
	}
}
