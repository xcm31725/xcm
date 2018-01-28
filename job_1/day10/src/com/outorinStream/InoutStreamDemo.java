package com.outorinStream;
/**
 * 
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InoutStreamDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("xcm.txt"), "utf-8"));
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		br.close();
		
	}

}
