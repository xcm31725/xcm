package com.print;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: PrintWriterDemo1  
 * @Description: TODO
 * 打印流：
 * 		PrintStream
 * 		PrintWriter
 * 			可以自动换行，println()
 * 			不能输出字节，但是可以输出其他任意类型
 * 			通过某些配置，可以实现自动刷新（只有在调用 println、printf 或 format才有用）
 * 			也是包装流，不具备写出功能
 * 			可以把字节输出流转换成字符输出流
 * 
 * 打印流的特有功能：
 * 		自动换行 使用方法println()实现自动换行
 * 		自动刷新  创建PrintWriter对象时启动自动刷新开关，并且使用println等3个方法可以实现自动刷新
 * 
 * 注意：创建FileWriter对象时boolean参数是是否追加，
 * 		而创建打印流对象的boolean类型参数是是否自动刷新
 *		只能输出不能输入
 * @author sudong
 * @date 2018年1月22日 上午10:27:36  
 *
 */
public class PrintWriterDemo1 {

	public static void main(String[] args) throws IOException {
		//method1();
		
		PrintWriter pw = new PrintWriter(new FileWriter("b.txt"), true);
		
		pw.println("zcj");
		pw.println("xnj");
		pw.println("txj");
		
		pw.close();
	}

	private static void method1() throws FileNotFoundException {
		PrintWriter pw = new PrintWriter("a\\b.txt");
		
		pw.write("xcm");
		pw.write("xgd");
		pw.write("cj");
		
		pw.close();
	}

}
