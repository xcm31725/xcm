package com.cilent_server;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 
 * @ClassName: CilentDemo  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author sudong
 * @date 2018年1月23日 下午9:45:03  
 *
 */
public class CilentDemo {

	public static void main(String[] args) throws IOException{
		//创建发送端Socket对象
		Socket s = new Socket(InetAddress.getByName("sudong-PC"), 31725);
		//获取输出流对象
		OutputStream os = s.getOutputStream();
		//发送数据
		String str = "hello xcm!!!";
		os.write(str.getBytes());
		//释放资源
		s.close();
	}

}
