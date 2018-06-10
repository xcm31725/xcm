package cxf_rs_spring;

import java.util.Collection;

import javax.ws.rs.core.MediaType;

import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.cxf.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext-test.xml")
public class UserService_RS_Test {

	
	@Test
	public void testCall() {
		User user = new User();
		user.setId(3);
		user.setUsername("小美");
		user.setCity("深圳");

		// 根据id查询
		WebClient client = WebClient.create("http://localhost:9996/cxf_rs_spring/services/");
		User responseUser = client.path("userService/user/1").accept(MediaType.APPLICATION_XML).get(User.class);
		System.out.println(responseUser);

		// 增加
		//WebClient.create("http://localhost:9996/cxf_rs_spring/services/").path("userService/user").accept(MediaType.APPLICATION_XML).post(user);

		// 修改
		//WebClient.create("http://localhost:9996/cxf_rs_spring/services/").path("userService/user").type(MediaType.APPLICATION_JSON).put(user);

		// 删除
		//WebClient.create("http://localhost:9996/cxf_rs_spring/services/").path("userService/user/1").accept(MediaType.APPLICATION_XML).delete();

		// 查询所有用户
		//Collection<? extends User> users = WebClient.create("http://localhost:9996/cxf_rs_spring/services/").path("userService/user").accept(MediaType.APPLICATION_JSON).getCollection(User.class);
		//System.out.println(users);
	}
}
