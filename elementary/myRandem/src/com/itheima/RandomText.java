package com.itheima;

import java.util.Random;
import java.util.Scanner;

public class RandomText {

	public static void main(String[] args) {
		Random r = new Random();
		int number = r.nextInt(100) + 1;

		while(true){
			Scanner s = new Scanner(System.in);
			System.out.print("���������µ�ֵ(1~100):");
			int guessnumber = s.nextInt();
			
			if(guessnumber > number){
				System.out.println("�������"+guessnumber+"����");
			}else if(guessnumber < number){
				System.out.println("������"+guessnumber+"С��");
			}else{
				System.out.println("��ϲ���Ŷ���");
				return;
			}
			
		}
	}

}
