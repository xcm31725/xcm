package com.inetaddress;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {

	public static void main(String[] args) throws IOException {
	
		//InetAddress address = InetAddress.getByName("sudong-PC");//sudong-PC/192.168.23.22
		InetAddress address = InetAddress.getByName("ty");
		System.out.println(address);
		
		//String hostName = address.getHostName();
		//String hostAddress = address.getHostAddress();
		//System.out.println(hostName);
		//System.out.println(hostAddress);
	}
	

}
