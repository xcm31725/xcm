package com.itheima_06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader("array.txt"));
		
		String line;
		
		while((line=br.readLine())!=null){
			StringBuilder sb = new StringBuilder(line);
			
			sb.reverse();
//			line = sb.toString();
			array.add(0,sb.toString());
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("array.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}

}
