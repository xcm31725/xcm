package com.itheima3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ServerTest3 {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(520);
		Socket s = ss.accept();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		String str = br.readLine();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chs = str.toCharArray();
		for (Character c : chs) {
			if(map.containsKey(c)){
				//int value = map.get(c);
				//value++;
				//map.put(c, value);
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		String st = "";
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			Integer value = map.get(key);
			st = key + "=" + (value +"");
			//System.out.println(st);
			//return st;
			pw.println(st);
		}
		
		
		
		
		//PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		//String str = getCount(s);
		//pw.println(str);
		s.close();
	}
	
	public static String getCount(Socket so) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(so.getInputStream()));
		String str = br.readLine();
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		char[] chs = str.toCharArray();
		
		/*for (int i = 0; i < chs.length; i++) {
			String s = chs[i] + "";
			Integer count = map.get(i);
			
			if(count == null) {
				count = 0;
			}
			count++;
			map.put(s, count);
		}*/
		
		for (Character c : chs) {
			if(map.containsKey(c)){
				//int value = map.get(c);
				//value++;
				//map.put(c, value);
				map.put(c, map.get(c)+1);
			}else{
				map.put(c, 1);
			}
		}
		String st = "";
		Set<Character> keys = map.keySet();
		for (Character key : keys) {
			Integer value = map.get(key);
			st = key + "=" + (value +"");
			//System.out.println(st);
			return st;
		}
		//return st;
		return st;
	}

}
