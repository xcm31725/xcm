package com.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @ClassName: InteAddressDemo1  
 * @Description: TODO 
 * InetAddress:�����ʾ������Э�飨IP����ַ��  
 * @author sudong
 * @date 2018��1��22�� ����8:40:33  
 *
 */
public class InteAddressDemo1 {

	public static void main(String[] args) throws UnknownHostException {
		//static InetAddress getByName(String host) :�ڸ����������������ȷ�������� IP ��ַ�� 
		
		//InetAddress address = InetAddress.getByName("sudong-PC");//sudong-PC/192.168.23.71
		InetAddress address = InetAddress.getByName("192.168.23.71");
		
		//String getHostName() :����������
		//address.getHostAddress()������IP��ַ
		
		String hostName = address.getHostName();
		String hostAddress = address.getHostAddress();
		
		System.out.println(hostName);
		System.out.println(hostAddress);
		//System.out.println(address);
	}

}
