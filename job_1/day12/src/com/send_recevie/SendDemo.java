package com.send_recevie;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class SendDemo {

	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		//创建包对象
		
		String s = "hello xcmj!";
		byte[] bys = s.getBytes();
		int length = s.length();
		InetAddress address = InetAddress.getByName("sudong-PC");
		int port = 31725;
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		//发送数据
		ds.send(dp);
		//释放资源
		ds.close();
	}

}
