package com.itheima;

public class Text2 {
	public static void main(String[] args) {
		for(int i=10000; i<100000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int qian = i/10/10/10%10;
			int wan = i/10/10/10/10%10;
			
			if((ge == wan) && (shi == qian)){
				System.out.println(i);
			}
		}
		
	}
}
