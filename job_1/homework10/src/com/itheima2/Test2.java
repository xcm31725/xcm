package com.itheima2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * 
 * @ClassName: Test2  
 * @Description: TODO
 * 2、根据要求,用代码实现
		转换流读取文本文件,源文件abc.txt是UTF-8编码
		将文本中的所有字符以字符数组形式读出,将字符存区数组存储到字符串缓中,
		将字符串缓冲区中的字符串一次性写出到文件 abc22.txt,同样也是UTF-8编码

 * @author sudong
 * @date 2018年1月21日 下午8:22:46  
 *
 */
public class Test2 {

	public static void main(String[] args) throws IOException {
		//1,创建输入流对象
		/*FileInputStream fis = new FileInputStream("abc.txt");
		InputStreamReader isr = new InputStreamReader(fis, "utf-8"); 
		BufferedReader br = new BufferedReader(isr);*/
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("abc.txt"),"utf-8"));
		//2,创建输出流对象
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("abc22.txt",true), "utf-8"), true);
		//最里面的true是追加数据，"utf-8"是字符集，最外面true是自动刷新的开关
		
		//复制数据
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		//释放资源
		br.close();
		pw.close();
	}
	
	/*public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a\\abc.txt"), "utf-8"));
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("b\\abc22.txt"), "utf-8"));
		
		String line;
		while((line = br.readLine()) != null) {
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
		br.close();
	}*/

}
