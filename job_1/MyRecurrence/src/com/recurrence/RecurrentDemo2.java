package com.recurrence;
/*
 * �ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
 * 		     С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ�������
 *  	     �ʵڶ�ʮ���µ����Ӷ���Ϊ���٣�
 *  
 *  ��һ�£�1 = 1 + 0
 *  �ڶ��£�1 = 1 + 0
 *  �����£�2 = 1 + 1
 *  �����£�3 = 2 + 1
 *  �����£�5 = 3 + 2
 *  �����£�8 = 5 + 3
 *  
 *  쳲���������
 * */
public class RecurrentDemo2 {

	public static void main(String[] args) {
		int num = tu(20);
		System.out.println(num);
	}
	
	public static int tu(int n){
		if(n == 1){
			return 1;
		}else if(n == 2){
			return 1;
		}else{
			return tu(n - 1) + tu(n - 2);
		}
	}
}
