package com.ithiema6;

import java.util.Scanner;

public class YangHuiTriangle {
public static void main(String[] args) { 
	//输入行数
	System.out.println("请输入杨辉三角的行数:"); 
	Scanner ScRows=new Scanner(System.in); 
	final int Rows=ScRows.nextInt(); 
	//声明二维数组，设置一维行数为
	//Rows+1;
	int array[][] =new int[Rows+1][]; 
	//循环初始化数组
	for(int i=0;i<=Rows;i++){ 
		//设置数组的二位行数
	//	array[i]=newint[i+1]; 
	} 
	System.out.println("杨辉三角为:"); 
		YhTriangle(array,Rows); 
	}

	// 输出杨辉三角
	public static void YhTriangle(int array[][], int rows) {
		// 行控制
		for (int i = 0; i <= rows; i++) {
			// 列控制
			for (int j = 0; j < array[i].length; j++) {
				// 赋值给二位数组,将两边的元素赋值为1
				if (i == 0 || j == 0 || j == array[i].length - 1)
					array[i][j] = 1;
				// 将其正上方元素与左上角元素之和赋值给此元素中。
				else
					array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
			}
		}
		// 打印输出杨辉三角
		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
