package com.itheima_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {
		/*BufferedWriter bw = new BufferedWriter(new FileWriter("bw1.txt"));
		
		for(int i=0;i<10;i++){
			bw.write("Hello"+i);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();*/
		
		BufferedReader br = new BufferedReader(new FileReader("br1.txt"));
		
		String line;
		
		/*line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);
		
		line = br.readLine();
		System.out.println(line);*/
		
		while((line=br.readLine())!=null){
			System.out.println(line);
		}
		
		br.close();
	}

}
