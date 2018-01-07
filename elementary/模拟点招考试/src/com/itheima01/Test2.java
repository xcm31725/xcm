package com.itheima01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * 2.项目根路径下创建文件Test05.txt，Test05.txt中存放如下数据（10分）。
             ADGdadfFSA
             FDDS324dfa
             1232da3daA （test.txt文件和文件中的数据可以手动创建和录入，无需由程序生成）
	编写程序，获取Test05.txt文件中内容，统计读取的内容中是字母的个数（大写字母和小写字母都要统计），并将获取的结果在控制台打印输出

 * */
public class Test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("Test05.txt"));
		
		int count = 0;
		
		String line;
		while((line=br.readLine())!=null){
			for(int i=0;i<line.length();i++){
				char ch = line.charAt(i);
				
				if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){
					count++;
				}
			}
			
		}

		br.close();
		System.out.println(count);
	}

}
