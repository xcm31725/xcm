package com.send_recevie1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendDemo {

	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socketk����
		DatagramSocket ds = new DatagramSocket();
		//�����������
		byte[] bys = "hello cj!!!".getBytes();
		DatagramPacket dp = new DatagramPacket(bys, bys.length, InetAddress.getByName("sudong-PC"), 31725);
		//��������
		ds.send(dp);
		
		//�ͷ���Դ
		ds.close();
	}

}
