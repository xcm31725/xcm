package com.itheima04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 1.��Ŀ��Ŀ¼�½����ļ��� user.txt���ļ��д���û����͵�¼���룬��ʽ���û���������,�磺aaa,123��
	2. user.txt�ļ��г�ʼ��ŵ��û���Ϣ�����£�
		jack,123
		rose,123
		tom,123
	3.Ҫ��������¹��ܣ�
	  ��������ʱ������̨��ʾ�û�����ע����û��������룻
	   ��֤����¼����û�����user.txt����ע����û����Ƿ��ظ���
	   �ǣ�����̨��ʾ���û����Ѵ���
	   �񣺽�����¼����û���������д��user.txt�ļ������ڿ���̨��ʾ��ע��ɹ���

 * */
public class Text {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������û���:");
		String username = sc.nextLine();
		
		System.out.print("����������:");
		String password = sc.nextLine();

		boolean flag = false;
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
	
		while((line = br.readLine()) != null) {
			
			int index = line.indexOf(",");
			
			String user = line.substring(0, index);
			if(username.equals(user)) {
				flag = true;
			}
		}
		br.close();
		if(flag) {
			System.out.println("������˼�û����Ѿ�����");
		} else {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			
			bw.newLine();
			bw.write(username+","+password);

			bw.close();
			
			System.out.println("�û���������ע��ɹ�");
		}
	}

}
