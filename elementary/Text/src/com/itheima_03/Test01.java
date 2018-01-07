package com.itheima_03;

public class Test01 {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;
		int c = 5;
		
		int max = getMax(a,b,c);
		System.out.println(max);
	}
	
	public static int getMax(int a, int b, int c){
		if(a>b){
			if(a>c){
				return a;
			}else{
				return c;
			}	
		}else{
			if(b>c){
				return b;
			}else{
				return c;
			}
		}
	}

}
