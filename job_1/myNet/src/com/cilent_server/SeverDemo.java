package com.cilent_server;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @ClassName: SeverDemo  
 * @Description: TODO
 * 使用TCP协议接收数据
 		创建接收端Socket对象
 		监听（阻塞）
 		获取输入流对象
 		获取数据
 		输出数据
 		释放资源
 		
 	ServerSocket：接收端，服务端Socket
 	ServerSocket(int port) 
 	Socket accept() 
 * @author sudong
 * @date 2018年1月23日 下午11:40:36  
 *
 */
public class SeverDemo {
	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		ServerSocket ss = new ServerSocket(31725);
		//监听（阻塞）
		Socket s = ss.accept();
		//获取输入流对象
		InputStream is = s.getInputStream();
		//获取数据
		byte[] bys = new byte[1024];
		int len;
		len = is.read(bys);
		//输出数据
		InetAddress address = s.getInetAddress();
		
		System.out.println("client --->" + address.getHostName());
		System.out.println(new String(bys, 0, len));
		
		s.close();
	}
}
