package com.itheima;

import java.util.Arrays;

/* ������������һ�����飺int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
Ҫ�󣺽�����������ֵΪ0��5ȥ��������Ϊ0��ֵ����һ���µ����飬�����µ�����Ϊ��
int newArr [] = {1,3,4,5,6,6,5,4,7,6,7,5}; 
��Ҫȷ��������Ĵ�С����Ҫ֪��ԭʼ����֮�в�Ϊ0�ĸ������ɱ�дһ������ʵ�֡�
����ͳ�ƵĽ������һ���µ����飬
*/
//���ʵ�֣�Ҫ��������ĳ��������֮����������
public class Text13 {

	public static void main(String[] args) {
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		int sum = aaa(oldArr);
		System.out.println(sum);
		int[] newArr = new int[sum];
		
		System.out.println("=========================");
		
		ccc(oldArr,newArr);
		//Arrays.toString(newArr);
		bbb(newArr);
	}
	
	/*
	 * ��������Ԫ�ز�Ϊ0��Ԫ��ֵ�������µ�������
	 * */
	public static void ccc(int[] oldArr,int[] newArr){ 
		int index = 0;
		for(int i=0; i<oldArr.length; i++){
			 if(oldArr[i] != 0){
				 newArr[index++] = oldArr[i];
			 }
		 }
	}
	
	/*
	 * ��ȡ������ĳ���
	 * */
	public static int aaa(int[] oldArr){
		int sum = 0; 
		for(int i=0; i<oldArr.length; i++){
			 if(oldArr[i] != 0){
				//System.out.println("oldarr["+i+"]="+oldArr[i]);
				sum++;
			 }
		 }
		return sum;
	}
	
	public static void bbb(int[] newArr){
		for(int i=0; i<newArr.length; i++){
			System.out.println("newArr["+i+"]="+newArr[i]);
		}
	}
}
