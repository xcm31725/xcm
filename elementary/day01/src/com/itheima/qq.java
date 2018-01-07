package com.itheima;
// byte,short,char ---> int ---> float ---> double
public class qq {

	public static void main(String[] args) {
		int i = 10;
		long d = 12l;
		//i = d;       //ËðÊ§¾«¶È
		d = i;
		System.out.println(d); 
		
		byte b = 3;
		int x = 4;
		byte y = (byte)(b + x);
		System.out.println(y);
	}

}
