package com.itheima;

import java.util.Arrays;

/* 需求：现有如下一个数组：int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
要求：将以上数组中值为0的5去掉，将不为0的值存入一个新的数组，生成新的数组为：
int newArr [] = {1,3,4,5,6,6,5,4,7,6,7,5}; 
需要确定新数组的大小，需要知道原始数组之中不为0的个数，可编写一个方法实现。
根据统计的结果开辟一个新的数组，
*/
//编程实现，要求程序输出某两个整数之间的随机数。
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
	 * 遍历数组元素不为0的元素值并存入新的数组中
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
	 * 获取新数组的长度
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
