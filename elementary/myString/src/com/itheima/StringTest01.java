package com.itheima;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

public class StringTest01 {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin";
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++){
			System.out.print("请输入用户名：");
			String name = sc.nextLine();
			
			System.out.print("请输入密码：");
			String pwd = sc.nextLine();
			
			if(username.equals(name)&&password.equals(pwd)){//equas()是判断两个字符串是否相等
				System.out.println("登陆成功！");
				break;
			}else{
				if((2-i)==0){
					System.out.println("登录失败，您的用户被锁定，请与管理员联系！");
				}else{
					System.out.println("登录失败，你还有"+(2-i)+"次机会");
				}
			}
		}

	}

}
