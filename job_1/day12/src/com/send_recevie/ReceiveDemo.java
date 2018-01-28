package com.send_recevie;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//创建接收端Socket对象
		DatagramSocket ds = new DatagramSocket(31725);
		
		//接收数据
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		
		//拆包
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int length = dp.getLength();
		
		//获取数据
		System.out.println("send --->" + address.getHostAddress());
		System.out.println(new String(data, 0, length));
		
		//释放资源
		ds.close();
	}

}
