package com.cilent_server3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerDemo {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2000);
		
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String username = br.readLine();
		String password = br.readLine();
		
		boolean flag = false;
		
		ArrayList<User> list = UserDB.getUsers();
		User user =  new User(username,password);
		
		if(list.contains(user)) {
			flag = true;
		}
		/*if("xcm31725".equals(username) && "20000".equals(password)) {
			flag = true;
		}*/
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		//pw.println("xcm31725");
		//pw.println("2000");

		if(flag) {
			pw.println("µÇÂ¼³É¹¦");
		}else {
			pw.print("µÇÂ¼Ê§°Ü");
		}
		
		s.close();
		
	}

}
