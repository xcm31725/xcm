package com.itheima_01;

public class IfDemo03 {

	public static void main(String[] args) {
		int x = 100;
		int y;
		
		if(x>=3){
			y = 2*x+1;
		}else if(x>=-1&&x<3){
			y = 2*x;
		}else if(x<=-1){
			y = 2*x-1;
		}else{
			y=0;
			System.out.println("没有这样的x");
		}
		System.out.println("-----------------");

		if(x>0){
			System.out.println("大于0");
		}else if(x>10){
			System.out.println("大于10");
		}else if(x>100){
			System.out.println("大于100");
		}
		System.out.println("-----------------");
		if(x>0){
			System.out.println("大于0");
		}if(x>10){
			System.out.println("大于10");
		}if(x>100){
			System.out.println("大于100");
		}
		
		System.out.println(y);
	}

}
