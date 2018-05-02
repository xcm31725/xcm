package cn.itcast.ioc;

public class UserServiceImpl implements IUserService {

	private String info; 

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void sayHello() {
		System.out.println("hello"+info);
	}

}
