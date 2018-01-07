package com.itheima;

public class PhoneDemo01 {
//成员变量跟随对象进入堆内存
	public static void main(String[] args) {
		Phone p = new Phone();
		
		//输出成员变量
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price);
		System.out.println("颜色："+p.color);
		System.out.println("------------");
		
		//给成员变量赋值
		p.brand = "华为";
		p.price = 2999;
		p.color = "黑色";
		
		//输出成员变量
		System.out.println("品牌："+p.brand);
		System.out.println("价格："+p.price);
		System.out.println("颜色："+p.color);
		System.out.println("------------");
		
		//调用成员方法
		p.call("xcm");
		p.sendMessage();
	}

}
