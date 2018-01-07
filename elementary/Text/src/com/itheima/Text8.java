package com.itheima;

import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactoryException;

public class Text8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个四位数字：");
		int number = sc.nextInt();
		
		int[] arr = new int[4];
		arr[0] = number/10/10/10%10;
		arr[1] = number/10/10%10;
		arr[2] = number/10%10;
		arr[3] = number%10;
		
		for(int i=0; i<arr.length; i++){
			arr[i] += 5;
			arr[i] %= 10;
		}
		
		int temp = arr[0];
		arr[0] = arr[3];
		arr[3] = temp;
		
		temp = arr[1];
		arr[1] = arr[2];
		arr[2] = temp;
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]);
		}
		System.out.println();
	}

}
