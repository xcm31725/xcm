package cn.itcast.service;

public class UserServiceImpl implements IUserService{

	@Override
	public void login(String uname, String password) {
		System.out.println("登录。。。。。。");
	}

	@Override
	public void regist() {
		System.out.println("注册。。。。。。");
	}

}
