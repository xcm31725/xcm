package com.itheima08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) throws IOException{
		ArrayList<XinXi> list = new ArrayList<XinXi>();
		method1();
		method2(list);
		//method3(list);
		/*int index = -1;
		for (int i = 0; i < list.size(); i++) {
			XinXi x = list.get(i);
			
			if(x.getAddress().endsWith("咸阳")){
				index = i;
			}
		}
		list.set(index, "陕西西安");*/
		
	}
	
	//吧咸阳修改成西安
	public static void method2(ArrayList<XinXi> list) throws IOException{
		readData(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("file1.txt"));
		int index = -1;
		for (int i = 0; i < list.size(); i++) {
			XinXi x = list.get(i);
			if(x.getAddress().endsWith("咸阳")){
				index = i;
			}
		}
		
		if(index!=-1){
			
		}
		writeData(list);
	}
	
	//格式:地址_姓名_年龄
	public static void method3(ArrayList<XinXi> list)throws IOException{
		readData(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
		for (int i = 0; i < list.size(); i++) {
			XinXi x = list.get(i);
			StringBuilder sb = new StringBuilder();
			if(x.getAddress().equals("北京")){
				sb.append(x.getAddress()).append("_").append(x.getName()).append("_").append(x.getAge());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			XinXi x = list.get(i);
			StringBuilder sb = new StringBuilder();
			if(x.getAddress().equals("上海")){
				sb.append(x.getAddress()).append("_").append(x.getName()).append("_").append(x.getAge());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
		}
		
		for (int i = 0; i < list.size(); i++) {
			XinXi x = list.get(i);
			StringBuilder sb = new StringBuilder();
			if(x.getAddress().equals("陕西西安")){
				sb.append(x.getAddress()).append("_").append(x.getName()).append("_").append(x.getAge());
				bw.write(sb.toString());
				bw.newLine();
				bw.flush();
			}
		}
		bw.close();
	}
	
	//吧数据写入文件中
	public static void writeData(ArrayList<XinXi> list) throws IOException{
		BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt"));
		
		for (int i = 0; i < list.size(); i++) {
			XinXi x = new XinXi();
			
			StringBuilder sb = new StringBuilder();
			sb.append(x.getName()).append("_").append(x.getAddress()).append("_").append(x.getAge());
			bw.write(sb.toString());
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
	//读取文件中的数据
	public static void readData(ArrayList<XinXi> list) throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("full.txt"));
		String line;
		while((line=br.readLine())!=null){
			String[] arr = line.split("_");
			
			XinXi x = new XinXi();
			x.setName(arr[0]);
			x.setAddress(arr[1]);
			x.setAge(arr[2]);
			
			list.add(x);
			//System.out.println(x.getAddress()+"_"+x.getName()+"_"+x.getAge());
		}
		br.close();
		
		
	
	}
	//看西安和咸阳的人数
	public static void method1() throws IOException{
		BufferedReader br = new BufferedReader(new FileReader("full.txt"));
		
		int countXiAn = 0;
		int countXianYang = 0;
		
		String line;
		while((line=br.readLine())!=null){
			String[] arr = line.split("_");
			
			if(arr[1].endsWith("西安")){
				countXiAn++;
			}
			
			if(arr[1].endsWith("咸阳")){
				countXianYang++;
			}
		}
		
		br.close();
		System.out.println("countXiAn:"+countXiAn);
		System.out.println("countXianYang:"+countXianYang);
	}
}










