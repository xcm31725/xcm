package com.itheima02;

public class MathDemo {

	public static void main(String[] args) {
		//abs(double a) :���� double ֵ�ľ���ֵ��
		//System.out.println(Math.abs(1));
		//System.out.println(Math.abs(-1));
		
		//ceil(double a) :������С�ģ���ӽ��������double ֵ����ֵ���ڵ��ڲ�����������ĳ��������
		System.out.println(Math.ceil(1.4));
		System.out.println(Math.ceil(1.6));
		//floor(double a) :�������ģ���ӽ��������double ֵ����ֵС�ڵ��ڲ�����������ĳ��������
		System.out.println(Math.floor(1.2));
		System.out.println(Math.floor(1.7));

		
		//round(double a) :������ӽ������� long��
		System.out.println(Math.round(1.3));//��������
		System.out.println(Math.round(1.6));
		
		//max(double a, double b) :�������� int ֵ�нϴ��һ����
		System.out.println(Math.max(2, 4));
		//
		System.out.println(Math.min(1,4));
		
		//pow(double a, double b) :���ص�һ�������ĵڶ����������ݵ�ֵ��
		System.out.println(Math.pow(2, 3));
		
		//random():���ش����ŵ� double ֵ����ֵ���ڵ��� 0.0 ��С�� 1.0��
		System.out.println(Math.random());
		
		//�е�ֵ
		System.out.println(Math.PI );
		
	}

}
