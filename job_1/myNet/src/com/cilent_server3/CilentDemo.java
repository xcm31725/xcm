package com.cilent_server3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @ClassName: ServerDemo  
 * @Description: TODO ģ���û���¼ 
 * @author sudong
 * @date 2018��1��24�� ����8:34:32  
 *
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 2000);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("�������û�����");
		String username = br.readLine();
		//InputStream username = s.getInputStream();

		System.out.println("���������룺");
		String password = br.readLine();
		//InputStream password = s.getInputStream();
		
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		pw.println(username);
		pw.println(password);
		
		BufferedReader serverBr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String result = serverBr.readLine();
		System.out.println(result);
		
		s.close();
	}

}
