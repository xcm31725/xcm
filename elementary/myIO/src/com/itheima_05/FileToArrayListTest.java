package com.itheima_05;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 从文本文件中读取数据到ArrayList集合中，并遍历集合
 * 每一行数据作为一个字符串元素
 * 
 * 分析：
 * 		A:创建输入缓冲流对象
 * 		B:创建集合对象
 * 		C:读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
 * 		D:释放资源
 * 		E:遍历集合
 */
public class FileToArrayListTest {
	public static void main(String[] args) throws IOException {
		//创建输入缓冲流对象
		BufferedReader br = new BufferedReader(new FileReader("br2.txt"));
		
		//创建集合对象
		ArrayList<String> array = new ArrayList<String>();
		
		//读取数据，每次读取一行数据，把该行数据作为一个元素存储到集合中
		
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
