package com.itheima2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTset2 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		Socket s = ss.accept();
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		s.close();
		ss.close();
	}

}
