package com.cilent_server2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String username = br.readLine();
		String password = br.readLine();
		
		boolean flag = false;
		if("xcm".equals(username) && "317".equals(password)) {
			flag = true;
		}
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		if(flag) {
			pw.println("µÇÂ¼³É¹¦");
		}else {
			pw.println("µÇÂ¼Ê§°Ü");
		}
		
		s.close();
		ss.close();
	}

}
