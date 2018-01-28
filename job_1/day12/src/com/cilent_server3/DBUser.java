package com.cilent_server3;

import java.util.ArrayList;
import java.util.List;

public class DBUser {
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User("xcm","520"));
		users.add(new User("xgd","317"));
		users.add(new User("admin","admin"));
		users.add(new User("itheima","itheima"));
	}
	
	public static List<User> getUser() {
		return users;
	}
}
