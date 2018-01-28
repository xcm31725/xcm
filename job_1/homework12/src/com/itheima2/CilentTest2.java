package com.itheima2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 
 * @ClassName: CilentTest2  
 * @Description: TODO
 * 2、客户端将本地文件上传到服务器上
 * @author sudong
 * @date 2018年1月24日 下午8:59:25  
 *
 */
public class CilentTest2 {

	public static void main(String[] args) throws IOException {
		Socket s = new Socket("sudong-PC", 520);
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("Test1.java")));
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		String line;
		while((line = br.readLine()) != null) {
			pw.println(line);
		}
		
		s.close();
		
	}

}
