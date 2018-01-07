package com.itheima03;

public class ForDemo01 {

	public static void main(String[] args) {
		int sum = 0;
		/*int i = 0;
		for(;i<11;){
			System.out.println("HelloWorld!"+i);
			i++;
		}*/
		for(int a=1;a<=5;a++){
			System.out.println(a);
			//sum += a;
		}
		System.out.println("---------------------");
		
		for(int a=5;a>0;a--){
			System.out.println(a);
			//sum += a;
		}
		System.out.println("---------------------");
		
		for(int x=1,y=1;x<=5;x++,y++){
			System.out.println(x+y);
			sum += (x+y);
		}
		System.out.println("----------------------");
		System.out.println(sum);
	}

}
