package com.itheima;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StringTest01 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.print("�������û�����");
			String name = sc.nextLine();
			
			System.out.print("���������룺");
			String pwd = sc.nextLine();
			
			if(username.equals(name)&&password.equals(pwd)){//equas()���ж������ַ����Ƿ����
				System.out.println("��½�ɹ���");
				break;
			}else{
				if((2-i)==0){
					System.out.println("��¼ʧ�ܣ������û����������������Ա��ϵ��");
				}else{
					System.out.println("��¼ʧ�ܣ��㻹��"+(2-i)+"�λ���");
				}
			}
		}

	}

}
