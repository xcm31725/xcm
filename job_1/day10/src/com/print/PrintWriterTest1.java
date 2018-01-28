package com.print;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterTest1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileDemo.java"));
		
		PrintWriter pw = new PrintWriter(new FileWriter("a\\FileDemo.java"),true);
		
		String line;
		while((line = br.readLine()) != null)  {
			pw.println(line);
		}
		
		br.close();
		pw.close();
		
	}

}
