package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������༶��������");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int sum = 0;
		int avg = 0;
		int count = 0;
		
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++){
			int c = r.nextInt(101);
			arr[i] = c;
			
			if(arr[i]<60){
				count++;
			}
			sum += arr[i];
		}
		for (int i : arr) {
			System.out.println(i);
		}
		avg = sum/num;
		System.out.println("������������"+count);
		System.out.println("�༶��ƽ���֣�"+avg);
	}

}
