package com.ithiema_01;
/*
 * ģ���¼�������λ���
 * */
import java.util.Scanner;

public class StringTest01 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.print("����������û�����");
			String name = sc.nextLine();
			
			System.out.print("������������룺");
			String pwd = sc.nextLine();

			if(name.equals(username) && pwd.equals(password)){
				System.out.println("��¼�ɹ���");
				break;
			}else{
				if(i==2){
					System.out.println("����˺��ѱ����������ڹ���Ա��ϵ");
				}else{
					System.out.println("��¼ʧ���㻹��"+(2-i)+"����");
				}
			}
		}
		
	}

}
