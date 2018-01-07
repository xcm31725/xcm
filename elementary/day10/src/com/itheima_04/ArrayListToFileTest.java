package com.itheima_04;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArrayListToFileTest {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("hello");
		array.add("world");
		array.add("java");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("arrat.txt"));
		
		for(int i=0;i<array.size();i++){
			String s = array.get(i);
			
			//StringBuilder sb = new StringBuilder();
			
			
			
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();

	}

}
