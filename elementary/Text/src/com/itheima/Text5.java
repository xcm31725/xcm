package com.itheima;

import java.io.InputStream;
import java.util.Scanner;

public class Text5 {

	public static void main(String[] args) {
		int[] arr = new int[6];
		
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<arr.length; i++){
			System.out.println("�������"+(i+1)+"������0~100):");
			int score = sc.nextInt();
			arr[i] = score;
		}
//		int max = max(arr);
//		int min = min(arr);
		int[] newArr = getMaxAndMin(arr);
		int min = newArr[1];
		int max = newArr[0];
		
		int sum = sum(arr);
		
		System.out.println("���÷֣�"+(sum-max-min)/(arr.length-2));
	}
	
	//��ȡ���ֵ����Сֵ��װ��һ������
	public static int[] getMaxAndMin(int[] arr){
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		int[] newArr = new int[2];
		max = newArr[0];
		min = newArr[1];
		
		return newArr;
	}
	
	//���
	public static int sum(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			 sum += arr[i];
		}
		return sum;
	}
	
	//��ȡ���ֵ
	public static int max(int[] arr){
		int max = arr[0];
		for(int i=1; i<arr.length; i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		return max;
	}
	
	//��ȡ��Сֵ
	public static int min(int[] arr){
		int min = arr[0];
		for(int i=1; i<arr.length; i++){
			if(min > arr[i]){
				min = arr[i];
			}
		}
		return min;
	}
}
