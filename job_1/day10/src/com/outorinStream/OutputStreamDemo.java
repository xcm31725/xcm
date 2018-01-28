package com.outorinStream;
/**
 * ��utf-8�����ʽ���ļ���ȡ��д�뵽GBK��ʽ���ļ���
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
