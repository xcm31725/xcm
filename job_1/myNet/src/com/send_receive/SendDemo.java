package com.send_receive;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 
 * @ClassName: SendDemo  
 * @Description: TODO
 * ʹ��UDPЭ�鷢������
 *		�������Ͷ�Socket����
 *		�������ݲ����
 *		��������
 *		�ͷ���Դ
 * 
 * DatagramSocket:�����ʾ�������ͺͽ�������,����UDPЭ���
 * 
 * DatagramSocket() ������Socket�����������˿ں�
 * DatagramSocket(int port) ������Socket����ָ���˿ں�
 * 
 * @author sudong
 * @date 2018��1��22�� ����9:06:06  
 *
 */
public class SendDemo {

	public static void main(String[] args) throws IOException {
		//�������Ͷ�Socket����
		DatagramSocket ds = new DatagramSocket();
		//�������ݲ����
		/*
		 * DatagramPacket :�����ʾ���ݱ���
		 * ���� byte[]
		 * �豸�ĵ�ַ ip
		 * ���̵ĵ�ַ  �˿ں�
		 *  DatagramPacket(byte[] buf, int length, InetAddress address, int port) 
		 */
		
		String s = "hello udp,I'm comming!";
		byte[] bys = s.getBytes();
		int length = bys.length;
		InetAddress address = InetAddress.getByName("sudong-PC");
		int port = 31725;
		
		DatagramPacket dp = new DatagramPacket(bys, length, address, port);
		
		//��������
		ds.send(dp);
		//�ͷ���Դ
		ds.close();
	}

}
