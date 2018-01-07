package com.itheima_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("FileWriteDemo.java"));
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("Copy2.java"));
		
		char[] arr = new char[1024];
		int len;
		while((len=br.read(arr))!=-1){
			bw.write(arr,0,len);
		}

		br.close();
		bw.close();
	}

}
