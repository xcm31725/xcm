package com.ithiema;
//���췽���������ַ����ڶ��ڴ�
//ֱ�Ӹ�ֵ��ʽ�����������ڷ������ĳ����ء�

//�����������ͣ��Ƚϵ��ǻ����������͵ĵ�ֵ�Ƿ�����ͬ
//�����������ͣ��Ƚϵ��������������͵ĵ�ֵַ�Ƿ���ͬ
public class StringDemo03 {

	public static void main(String[] args) {
		String s = new String("hello");
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println("s==s1:"+(s==s1));
		System.out.println("s1==s2:"+(s2==s1));
	}

}
