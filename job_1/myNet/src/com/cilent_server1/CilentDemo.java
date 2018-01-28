package com.cilent_server1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class CilentDemo {

	public static void main(String[] args) throws IOException {
		
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 000317);
		
		OutputStream os = s.getOutputStream();
		
		os.write("hello xcmj!!!".getBytes());
		
		InputStream is = s.getInputStream();
		
		byte[] bys = new byte[1024];
		int len = is.read(bys);
		
		System.out.println(new String(bys, 0, len));
		
		s.close();
	}

}
