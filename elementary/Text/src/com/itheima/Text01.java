package com.itheima;

public class Text01 {

	public static void main(String[] args) {
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		//int newArr[] = new int[oldArr.length];
		int sum = 0;
		
		for(int i=0; i<oldArr.length; i++){
			 if(oldArr[i] == 0){
				sum++;
			 }
		 } 
		System.out.println(sum);
	}
}	