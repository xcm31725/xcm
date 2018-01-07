package com.itheima;

public class DebugDemo {

	public static void main(String[] args) {
		
		int[][] arr = {{2,4,5,23},{3,4,3,45,5,65,3,23,2},{4,5,6,6,543,3},{4,56,7,7,5,4,3}};
		
		int a = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"  ");
				a += arr[i][j];
			}
			System.out.println();
		}
		System.out.println(a);
	}
}
