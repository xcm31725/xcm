package com.itheima1;
/*
 * 局部内部类
		在方法里面，出来方法就不能使用了
 * */
public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}

class Outer{
	public void method(){
		class Inner{
			public void function(){
				System.out.println("function");
			}
		}
		
		Inner i = new Inner();
		i.function();
	}
}