package com.itheima;

import java.util.Scanner;
/*
#
##
###
####
#####
*{#####,####,###,##,#}
*/
public class Text11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入行数：");
		int n = sc.nextInt();
	    
		System.out.print("请输入列数：");
		int m = sc.nextInt();
		
		int[][] arr = new int[n][m];
		
		aa(arr);
	}
	
	public static void aa(int[][] arr){
		for(int x=1; x<=arr.length; x++){
			for(int y=1; y<=arr.length; y++){
				System.out.println(arr[x][y]);
		    }
		}
		
	}

}
