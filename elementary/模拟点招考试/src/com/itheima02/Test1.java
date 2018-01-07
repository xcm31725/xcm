package com.itheima02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 1.	按需求完成指定功能，题目如下（8分）
	项目根路径下有text.txt文件，内容如下：
                 我爱黑马
     123456
	利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中，反转后在文件中格式如下：
      123456
                  我爱黑马

 * */
public class Test1 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
		
		for (int i = array.size()-1; i >=0; i--) {
			String s = array.get(i);
			
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}

}








