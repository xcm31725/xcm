package cn.itcast.cxf.rs.client;

import java.util.Collection;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;

import cn.itcast.cxf.domain.User;

public class RS_Client {
	public static void main(String[] args) {
		User user = new User();
		user.setId(3);
		user.setUsername("小美");
		user.setCity("深圳");

		// 根据id查询
		WebClient client = WebClient.create("http://localhost:9999/");
		User responseUser = client.path("userService/user/1").accept(MediaType.APPLICATION_XML).get(User.class);
		System.out.println(responseUser);

		// 增加
		WebClient.create("http://localhost:9999/").path("userService/user").accept(MediaType.APPLICATION_XML)
				.post(user);

		// 修改
		WebClient.create("http://localhost:9999/").path("userService/user").type(MediaType.APPLICATION_JSON).put(user);

		// 删除
		WebClient.create("http://localhost:9999/").path("userService/user/1").accept(MediaType.APPLICATION_XML)
				.delete();

		// 查询所有用户
		Collection<? extends User> users = WebClient.create("http://localhost:9999/").path("userService/user")
				.accept(MediaType.APPLICATION_JSON).getCollection(User.class);
		System.out.println(users);
	}
}
