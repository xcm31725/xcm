package com.cilent_server3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

public class ServerTest {

	public static void main(String[] args) throws IOException {
		//创建服务端对象
		ServerSocket ss = new ServerSocket(520);
		//监听（阻塞）
		Socket s = ss.accept();
		//创建输入流对象
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
		//读取数据
		String username = br.readLine();
		String password = br.readLine();
		//确立定位
		boolean flag = false;
		//创建集合对象和User对象进行比对
		List<User> users = DBUser.getUser();
		
		User user = new User(username,password);
		
		if(users.contains(user)) {
			flag = true;
		}
		
		/*if("aaa".equals(username) && "aaa".equals(password)){
			flag = true;
		}*/
		//创建输出流对象
		PrintWriter pw = new PrintWriter(s.getOutputStream(), true);
		
		//把数据返回给客户端
		if(flag) {
			pw.println("登录成功");
		} else {
			pw.println("登录失败");
		}
		//释放资源
		s.close();
		ss.close();
		
	}

}
