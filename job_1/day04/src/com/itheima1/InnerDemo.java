package com.itheima1;

public class InnerDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();

	}

}
interface Inner {
	public void function();
}

class Outer {
	
	public void method() {
		
		/*new Inner(){

			@Override
			public void function() {
				System.out.println("funcion");
			}
		}.function();*/
			
		Inner i = new Inner(){

			@Override
			public void function() {
				System.out.println("funcion");
			}
		};
		
		i.function();
		i.function();
	}
}