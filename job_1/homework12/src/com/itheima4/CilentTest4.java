package com.itheima4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 
 * @ClassName: CilentTest4  
 * @Description: TODO
 * 4���ͻ������������д�ַ���(����¼��),���������ַ�����robin���滻Ϊ*д��
		String�е�replaceAll(String regex, String replacement) ��������ʵ���滻
 * @author sudong
 * @date 2018��1��24�� ����9:02:03  
 *
 */
public class CilentTest4 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String str = sc.nextLine();
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(str);
		//pw.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		System.out.println(br.readLine());
		s.close();
	}

}
