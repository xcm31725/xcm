package com.cilent_server3;

import java.util.ArrayList;

public class UserDB {
	
	private static ArrayList<User> list = new ArrayList<User>();
	
	static {
		list.add(new User("xcm", "317"));
		list.add(new User("xgd", "025"));
		list.add(new User("admin", "admin"));
	}
	
	public static ArrayList<User> getUsers(){
		return list;
	}
}
