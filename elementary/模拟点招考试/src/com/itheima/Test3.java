package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 *3.在项目根路径创建data.txt文件（文件的创建和文件内容的输入可手动创建和录入）,文件内容没有要求（12分）
	使用IO流获取 data.txt文件内容 中的所有 数字。
	将获取到的所有数字 使用IO流写入 到文件 result.txt文件中
          例：data.txt文件内容：as12qwq21Q2aed
          最终保存至result.txt文件的内容：12212
 
 * */
public class Test3 {

	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		
		BufferedReader br = new BufferedReader(new FileReader("data.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			array.add(line);
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("result.txt"));
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			char[] arr = s.toCharArray();
			for(int j=0;j<s.length();j++){
				if(j<='0'&&j>'9'){
					
				}
			}
		}

	}

}
