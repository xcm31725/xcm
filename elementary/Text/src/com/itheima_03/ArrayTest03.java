package com.itheima_03;

public class ArrayTest03 {
	public static void main(String[] args){
		int[] arr = {1,3,5,2,1,3,5};
		int a = 3;
		//int b = 0;
		if(true){
			int b = 0;
			for(int i =0; i<arr.length; i++){
				if(a == arr[i]){
					b++;
					if(b == 1){
						System.out.println(i);
					}
				}
			}
		}else{
			System.out.println("该元素不在数组中");
		}
		
	}
}
