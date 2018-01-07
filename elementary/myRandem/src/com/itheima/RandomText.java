package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class RandomText {

	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;

		while(true){
			Scanner s = new Scanner(System.in);
			System.out.print("请输入您猜的值(1~100):");
			int guessnumber = s.nextInt();
			
			if(guessnumber > number){
				System.out.println("您输入的"+guessnumber+"大了");
			}else if(guessnumber < number){
				System.out.println("您输入"+guessnumber+"小了");
			}else{
				System.out.println("恭喜您才对了");
				return;
			}
			
		}
	}

}
