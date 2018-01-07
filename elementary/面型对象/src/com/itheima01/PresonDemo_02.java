package com.itheima01;

public class PresonDemo_02 {

	public static void main(String[] args) {
		Preson02 p = new Preson02();
		p.show();
		System.out.println("--------------------");
		
		Preson02 p1 = new Preson02("张三",23);
		p1.show();

	}

}

/*
 *A:案例演示
 		*构造方法的重载
 		*重载：方法名相同，与返回值类型无关（构造方法没有返回值），只看参数列表
 *B:构造方法注意事项
 		*a:如果我们没有给出构造方法，系统将会自动提供一个无参的构造方法。
 		*b:如果我们给出了构造方法，系统将不再使用提供默认的无参构造方法。
 			*注意：这个时候，如果我们想还使用无参构造方法，就必须自己给出，建议永远自己给无参的构造方法
 * */
class Preson02{
	private String name;
	private int age;
	
	public Preson02(){     //空参构造
		System.out.println("空参构造");
	}
	
	public Preson02(String name,int age){// 有参构造
		this.name = name;
		this.age = age;
		System.out.println("有参构造");
	}
	
	public void show(){
		System.out.println(name+"..."+age);
	}
	
}
