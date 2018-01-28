package com.send_receive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @ClassName: SendDemo  
 * @Description: TODO
 * 使用UDP协议发送数据
 *		创建发送端Socket对象
 *		创建数据并打包
 *		发送数据
 *		释放资源
 * 
 * DatagramSocket:此类表示用来发送和接收数据,基于UDP协议的
 * 
 * DatagramSocket() ：创建Socket对象并随机分配端口号
 * DatagramSocket(int port) ：创建Socket对象并指定端口号
 * 
 * @author sudong
 * @date 2018年1月22日 下午9:06:06  
 *
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//创建发送端Socket对象
		DatagramSocket ds = new DatagramSocket();
		//创建数据并打包
		/*
		 * DatagramPacket :此类表示数据报包
		 * 数据 byte[]
		 * 设备的地址 ip
		 * 进程的地址  端口号
		 *  DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 */
		
		String s = "hello udp,I'm comming!";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("sudong-PC");
		int port = 31725;
		
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		//发送数据
		ds.send(dp);
		//释放资源
		ds.close();
	}

}
