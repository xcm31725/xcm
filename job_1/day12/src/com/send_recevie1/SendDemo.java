package com.send_recevie1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		//创建发送端Socketk对象
		DatagramSocket ds = new DatagramSocket();
		//创建打包对象
		byte[] bys = "hello cj!!!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("sudong-PC"), 31725);
		//发送数据
		ds.send(dp);
		
		//释放资源
		ds.close();
	}

}
