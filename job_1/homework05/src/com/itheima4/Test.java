package com.itheima4;
/*
 * 5�������������󣬲��ô���ʵ�֣�
		(1)��һ�������ַ���"25 11 -6 20 102 9",����֮���ÿո���	
		(2)�ڿ���̨��ӡ�����ַ�������������
		��ʾ:��String���ṩ��split����(��" "(�ո�)��Ϊsplit�����Ĳ������и�)��
			Ȼ�����ɶ�Ӧ�������ַ�������
 * */
public class Test {

	public static void main(String[] args) {
		String s = "25 11 -6 20 102 9";
		String[] arr = s.split(" ");
		int max = Integer.parseInt(arr[0]);
		
		for (int i = 0; i < arr.length; i++) {
			int a = Integer.parseInt(arr[i]);
			
			if(max<a){
				max=a;
			}
		}
		System.out.println(max);
	}
	

}
