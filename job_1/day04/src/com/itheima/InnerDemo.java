package com.itheima;
/*鼠牛虎兔龙蛇马羊猴鸡狗猪
 * 在测试类中，其实我们已经创建Outer对象，那么我们在这里可以直接使用这个对象就可以了
 *		外部类名。this：表示的就是在测试类中创建的外部类对象，比如：OUter.this
 * 
 * 关键字：
 * 		public default final static private abstract protected this super void class new package interface implements extends 
 * */


public class InnerDemo {

	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();
		
		Outer.Inner i = new Outer().new Inner();
		i.function();

	}
}

class Outer {
	private int num = 10;
	
	public void method() {
		Inner i = new Inner();
		i.function();
	}
	class Inner {
		public void function(){
			System.out.println(num);
		}
	}
}
