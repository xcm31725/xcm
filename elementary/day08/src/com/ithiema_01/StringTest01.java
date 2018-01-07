package com.ithiema_01;
/*
 * 模拟登录，有三次机会
 * */
import java.util.Scanner;

public class StringTest01 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.print("请输入你的用户名：");
			String name = sc.nextLine();
			
			System.out.print("请输入你的密码：");
			String pwd = sc.nextLine();

			if(name.equals(username) && pwd.equals(password)){
				System.out.println("登录成功！");
				break;
			}else{
				if(i==2){
					System.out.println("你的账号已被锁定，请于管理员联系");
				}else{
					System.out.println("登录失败你还有"+(2-i)+"机会");
				}
			}
		}
		
	}

}
