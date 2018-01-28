package com.send_recevie2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveTest {

	public static void main(String[] args) throws IOException {
		//创建接收端对象
		DatagramSocket ds = new DatagramSocket(520);		
		//创建打包对象
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		//获取就收数据
		ds.receive(dp);
		//解析数据
		//获取发送端的IP
		InetAddress address = dp.getAddress();
		//获取字节数组数据
		byte[] data = dp.getData();
		//获取长度
		int len = dp.getLength();
		//输出数据
		System.out.println("send --->" + address.getHostAddress());
		System.out.println(new String(bys, 0, len));
	}

}
