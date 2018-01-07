package com.ithiema;
//构造方法创建的字符串在堆内存
//直接赋值方式创建对象是在方法区的常量池。

//基本数据类型：比较的是基本数据类型的的值是否想相同
//引用数据类型：比较的是引用数据类型的地址值是否相同
public class StringDemo03 {

	public static void main(String[] args) {
		String s = new String("hello");
		String s1 = "hello";
		String s2 = "hello";
		
		System.out.println("s==s1:"+(s==s1));
		System.out.println("s1==s2:"+(s2==s1));
	}

}
