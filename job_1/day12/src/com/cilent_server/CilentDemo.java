package com.cilent_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class CilentDemo {

	public static void main(String[] args) throws IOException {
		//创建客户端对象
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 317);
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		//发送数据
		String str = "hello xcmj";
		os.write(str.getBytes());
		//释放资源
		s.close();
	}

}
