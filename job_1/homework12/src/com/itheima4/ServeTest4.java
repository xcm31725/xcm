package com.itheima4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServeTest4 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String str = br.readLine();
		
		System.out.println(str);
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		pw.println(str.replaceAll("robin", "*"));
		
		s.close();
		ss.close();
	}

}
