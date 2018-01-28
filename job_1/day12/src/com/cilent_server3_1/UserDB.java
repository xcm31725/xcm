package com.cilent_server3_1;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
	private static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User("xcm","520"));
		users.add(new User("xgd","317"));
		users.add(new User("zcj","20"));
		users.add(new User("admin","admin"));
	}
	
	public static List<User> getUser() {
		return users;
	}
}
