package com.itheima;

public class InnerDemo1 {

	public static void main(String[] args) {
		//Outer1 o = new Outer1();
		//o.show();
		
		Outer1.Inner1.function();
	}

}

class Outer1 {
	
	public void show(){
		Inner1 i = new Inner1();
		i.function();
	} 
	
	static class Inner1 {
		public static void function(){
			System.out.println("function");
		}
	}
	
	/*private class Inner1 {
		public void function(){
			System.out.println("function");
		}
	}*/
}
