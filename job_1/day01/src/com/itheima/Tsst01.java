package com.itheima;

public class Tsst01 {

	public static void main(String[] args) {
	int[] arr = {1,3,6,2,4,7};
	//int max = getMax(arr);
	//System.out.println("max:"+max);
	int[] array =  getMax(arr);
	for (int i = 0; i < array.length; i++) {
		System.out.println(array[i]);
	}
	
	}
	
	//����ֵ
	public static int[] getMax(int[] arr){
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(max<arr[i]){
				max = arr[i];
			}
			if(min>arr[i]){
				min = arr[i];
			}
		}
		int[] array = new int[2];
		
		array[0] = max;//���ֵ���뵽�����0����
		array[1] = min;//��Сֵ���뵽�����1����
		
		return array;
	}

}
