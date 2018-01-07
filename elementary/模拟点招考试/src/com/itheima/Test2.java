package com.itheima;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 2.	在项目根目录下有一个test.txt文件，其内容如下（10分）
      	员序程马黑客播智传
      	！航起想梦，我自飞放 
           （test.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
	将文件中的内容读取出来，并反转，打印到控制台。打印格式和内容如下 
       	传智播客黑马程序员
                        放飞自我，梦想起航！

 * */
public class Test2 {
	public static void main(String[] args) throws IOException {
		ArrayList<String> array = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			StringBuilder sb = new StringBuilder(line);
			
			sb.reverse();
			array.add(sb.toString());
		}
		br.close();
		
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		
	}
}
