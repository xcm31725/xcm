package com.itheima_04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileToArrayListTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("arrat.txt"));
		
		ArrayList<String> array = new ArrayList<String>();
		
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		
		br.close();
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			System.out.println(s);
		}
	}

}
