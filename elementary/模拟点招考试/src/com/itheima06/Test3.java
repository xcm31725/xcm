package com.itheima06;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * 3.	在项目根路径下创建文件data2.txt，data2.txt中存放的数据如下；（12分）
            比如:  2A0a@1wz7qq0EE4#25
           （data.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
	编写一个程序，获取data.txt文件中所有的数字，并在控制台打印输出，
	演示格式如：文件中所包含的数字有：20170425

 * */
public class Test3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("data2.txt"));
		
		String line;
		while((line=br.readLine())!=null){
			char[] chs = line.toCharArray();
			//System.out.println(line);
			//System.out.println(chs[0]);
			for (int i = 0; i < chs.length; i++) {
				//System.out.println(chs[i]);
				if((chs[i]<='9') && (chs[i]>='0')){
					System.out.print(i);
				}
			}
		}
		br.close();

	}

}
