package com.itheima_01;

public class StringBuilderTest02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		String s = print(arr);
		System.out.println(s);
	}
	
	public static String print(int[] arr){
		StringBuilder sb = new StringBuilder();
		
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			if(arr.length-1==i){
				sb.append(arr[i]);
			}else{
				sb.append(arr[i]).append(",");
			}
		}
		sb.append("]");
		String result = sb.toString();
		
		return result;
	}

}
