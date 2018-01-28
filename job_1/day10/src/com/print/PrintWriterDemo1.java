package com.print;
/*
 * 打印流的特有功能：
 * 		自动换行 使用方法println()实现自动换行
 * 		自动刷新  创建PrintWriter对象时启动自动刷新开关，并且使用println等3个方法可以实现自动刷新
 * 
 * 注意：创建FileWriter对象时boolean参数是是否追加，
 * 		而创建打印流对象的boolean类型参数是是否自动刷新
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//PrintWriter pw = new PrintWriter("b.txt");
		PrintWriter pw = new PrintWriter(new FileWriter("b.txt"), true);
		//pw.write("xcm");
		//pw.write("xgd");
		//pw.write("zc");
		
		pw.println("xcm");
		pw.println("xgd");
		pw.println("cc");
		
		pw.close();
	}

}
