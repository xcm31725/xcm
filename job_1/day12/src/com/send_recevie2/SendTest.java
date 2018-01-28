package com.send_recevie2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendTest {

	public static void main(String[] args) throws IOException {
		//创建发送端对象
		DatagramSocket ds = new DatagramSocket();
		//创建答包对象
		byte[] bys = "hello zcj!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("sudong-PC"), 520);
		//发送数据
		ds.send(dp);
		//释放资源
	}

}
