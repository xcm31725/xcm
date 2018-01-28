package com.itheima1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServerTest {
	
	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		
		Socket s = ss.accept();
		
		//read(s);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		List<String> list = new ArrayList<String>();
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
			list.add(line);
			Collections.reverse(list);
			//StringBuffer sb = new StringBuffer(line);
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			sb.toString();
		}
		//s.shutdownOutput();
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		for (int i = list.size()-1; i >= 0; i--) {
			String str = list.get(i);
			
			pw.println(str);
		}
		
	
		s.close();
		ss.close();
	}
	
	private static void read(Socket s) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		List<String> list = new ArrayList<String>();
		
		String line;
		while((line = br.readLine()) != null) {
			list.add(line);
			Collections.reverse(list);
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			String str = list.get(i);
			
			pw.println(str);
		}
		
	}
	
	/*public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		Socket s = ss.accept();
		
		//List<String> list = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		
		String line;
		while((line = br.readLine()) != null) {
			StringBuilder sb = new StringBuilder(line);
			sb.reverse();
			line = sb.toString();
			//list.add(line);
			//Collections.reverse(list);
			
		}
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		pw.println(line);
		
		
		s.close();
		ss.close();
	}*/

}
