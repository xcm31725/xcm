package com.itheima_01;
/*
 * ��ӹ���
 * 	public StringBuilder append(��������):������ݣ��������������
 * ��ת����
 * 	public StringBuilder reverse()
 * */
public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		/*StringBuilder sb2 = sb.append("hello");
		System.out.println("sb="+sb);
		System.out.println("sb2="+sb2);
		System.out.println(sb == sb2);
		
		sb.append("hello");
		sb.append("world");
		sb.append(true);
		sb.append(100);*/
		
		//��ʽ���
		sb.append("hello").append("world").append(true).append(100);
		
		sb.reverse();
		
		System.out.println("sb="+sb);
	}

}
