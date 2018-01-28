package com.send_receive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 
 * @ClassName: ReceiveDemo  
 * @Description: TODO
 * ʹ��UDPЭ���������
 *		�������ն�Socket����
 *		��������
 *		��������
 *		�������
 *		�ͷ���Դ
 *
 * @author sudong
 * @date 2018��1��22�� ����9:27:01  
 *
 */
public class ReceiveDemo {

	public static void main(String[] args) throws IOException {
		//�������ն�Socket����
		DatagramSocket ds = new DatagramSocket(31725);
		//��������
		//DatagramPacket(byte[] buf, int length)
		byte[] bys = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(bys, bys.length);
		
		System.out.println(1);
		ds.receive(dp);//����
		System.out.println(1);
		//��������
		//InetAddress getAddress() : ��ȡ���Ͷ˵�IP����
		InetAddress address = dp.getAddress();
		//byte[] getData()  ����ȡ���յ������ݣ�Ҳ����ֱ��ʹ�ô���������ʱ������
		//byte[] data = dp.getData();
		//int getLength()  ����ȡ�����յ����ݵĳ���
		int length = dp.getLength();
		
		//�������
		System.out.println("send ---> " + address.getHostAddress());
		System.out.println(new String(bys, 0, length));
		//�ͷ���Դ
		ds.close();
	}

}
