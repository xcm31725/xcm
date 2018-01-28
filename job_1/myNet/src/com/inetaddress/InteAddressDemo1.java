package com.inetaddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 
 * @ClassName: InteAddressDemo1  
 * @Description: TODO 
 * InetAddress:此类表示互联网协议（IP）地址。  
 * @author sudong
 * @date 2018年1月22日 下午8:40:33  
 *
 */
public class InteAddressDemo1 {

	public static void main(String[] args) throws UnknownHostException {
		//static InetAddress getByName(String host) :在给定主机名的情况下确定主机的 IP 地址。 
		
		//InetAddress address = InetAddress.getByName("sudong-PC");//sudong-PC/192.168.23.71
		InetAddress address = InetAddress.getByName("192.168.23.71");
		
		//String getHostName() :返回主机名
		//address.getHostAddress()：返回IP地址
		
		String hostName = address.getHostName();
		String hostAddress = address.getHostAddress();
		
		System.out.println(hostName);
		System.out.println(hostAddress);
		//System.out.println(address);
	}

}
