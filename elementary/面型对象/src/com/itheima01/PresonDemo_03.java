package com.itheima01;

public class PresonDemo_03 {

	public static void main(String[] args) {
		Preson03 p = new Preson03("张三",23);
		//p = new Preson03("张天一",23);   //这是看似是改了名字，但实际是吧原来的变成了垃圾
		System.out.println(p.getName()+"..."+p.getAge());
		
		System.out.println("----------------------");
		
		Preson03 p1 = new Preson03();//创建空参构造对象
		p1.setName("李四");
		p1.setAge(24);
		
		p1.setName("李贵");
		System.out.println(p1.getName()+"..."+p1.getAge());
	}

}
/*
 * 构造方法
	*给属性进行初始化 
 * setXxx方法
 	*修改属性值
 	*这两种方式，在开发中用setXxx更多一些，因为比较灵活 
 */

class Preson03{
	private String name;
	private int age;
	
	public Preson03(){     //空参构造
	}
	
	public Preson03(String name,int age){// 有参构造
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){//设置名字
		this.name = name;
	}
	public String getName(){//获取名字
		return name;
	}
	
	public void setAge(int age){//设置年龄
		this.age = age;
	}
	public int getAge(){//获取年龄
		return age;
	}
}