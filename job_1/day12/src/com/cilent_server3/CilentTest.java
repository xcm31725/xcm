package com.cilent_server3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//�����ͻ��˶���
		Socket s = new Socket("sudong-PC", 520);
		//����¼���û���������
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�������û�����");
		String username = sc.nextLine();
		System.out.println("���������룺");
		String password = sc.nextLine();
		//�������������ÿ��дһ��
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		//��������
		pw.println(username);
		pw.println(password);

		//��������������
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//��ȡ���ݲ����
		String str = br.readLine();
		System.out.println(str);
		//�ͷ���Դ
		s.close();
	}

}
