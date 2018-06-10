package cn.itcast.cxf.ws.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

import cn.itcast.cxf.domain.Car;
import cn.itcast.cxf.domain.User;

@WebService(endpointInterface = "cn.itcast.cxf.service.IUserService", serviceName = "userService")
public class UserServiceImpl implements IUserService {

	// �?单参数传�?
	public String sayHello(String name) {
		return "Hello," + name;
	}

	// 复杂参数传�??
	public List<Car> findCarsByUser(User user) {
		if ("xiaoming".equals(user.getUsername())) {
			List<Car> cars = new ArrayList<Car>();
			Car car1 = new Car();
			car1.setId(1);
			car1.setCarName("大众途观");
			car1.setPrice(200000d);
			cars.add(car1);

			Car car2 = new Car();
			car2.setId(2);
			car2.setCarName("现代ix35");
			car2.setPrice(170000d);
			cars.add(car2);

			return cars;
		} else {
			return null;
		}
	}
}
