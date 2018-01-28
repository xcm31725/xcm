package com.send_recevie;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		DatagramSocket ds = new DatagramSocket(31725);
		
		//��������
		byte[] bys = new byte[1024];
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		ds.receive(dp);
		
		//���
		InetAddress address = dp.getAddress();
		byte[] data = dp.getData();
		int length = dp.getLength();
		
		//��ȡ����
		System.out.println("send --->" + address.getHostAddress());
		System.out.println(new String(data, 0, length));
		
		//�ͷ���Դ
		ds.close();
	}

}
