package com.outorinStream;
/**
 * 把utf-8编码格式的文件读取并写入到GBK格式的文件中
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OutputStreamDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("xcm.txt"), "utf-8"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("xgd.txt"), "GBK"));
	
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
		}
		
		bw.close();
		br.close();
	}

}
