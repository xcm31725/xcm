package com.itheima;

import java.util.Scanner;

public class Text15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������n��ֵ��");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++){
			for(int j=i+1; j>0; j--){
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
