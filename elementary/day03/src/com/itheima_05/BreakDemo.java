package com.itheima_05;

import java.util.Scanner;
/*
 * ��֪�����ٴε�ʱ����whileѭ��
 * ѭ���ĸ߼��÷���������ת����ת��֮ǰ��ĳһλ��
 * break����ѭ����
 * */
public class BreakDemo {

	public static void main(String[] args) {
		/*for(int a=1;a<=10;a++){
			if(a == 3){
				break;
			}//����
			System.out.println("HelloWorld!");
			//if(a == 3){
				//break;
		//	}//����
		}
		
		*/
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.print("��������ĳɼ���");
			int a = sc.nextInt();
			
			if(a>=0&&a<+100){
				System.out.println("�ɼ��Ϸ�");
				break;
			}else{
				System.out.println("�ɼ����Ϸ�");
			}
		}
	}

}
