package com.itheima01;

public class PersonDemo_01 {

	public static void main(String[] args) {
		Preson01 p = new Preson01();
		p.preson();
	}

}

/*
 * A：构造方法概述和作用
 		*给对象的数据（属性）进行初始化
 * B：构造方法格式特点
 		*a：方法名与类名相同（大小也要与类名一致）
 		*b：没有返回值类型，连void都没有
 		*c：没有其具体的返回值return  		
*/

class Preson01{
		private String name;
		private int age;
		
		public Preson01(){//构造方法没有返回值与返回值类型无关只看参数列表
			
			name = "张三";
			age = 23;
			
			
		}
		public void preson(){
			System.out.println(name+"HelloWorld!"+age);
		}
}