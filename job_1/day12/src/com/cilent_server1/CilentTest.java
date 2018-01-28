package com.cilent_server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class CilentTest {

	public static void main(String[] args) throws IOException {
		//创建客户端对象
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 31752);
		//获取输出流
		OutputStream os = s.getOutputStream();
		//发送数据
		os.write("hello xcj!!!".getBytes());
		
		//获取输入流
		InputStream is = s.getInputStream();
		
		
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		//输出数据
		System.out.println(new String(bys, 0, len));
		
		s.close();
		
	}

}
