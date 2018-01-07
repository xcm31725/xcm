package com.itheima01;
/*
 * 1.	统计并获取10-100之间(包含10和100)个位与十位都为奇数的数字，并将数字和个数都打印到控制台上。( 8分)
	PS：需要先获取到范围内每个数字个位和十位上的数，在按照条件进行判断。
 * */
public class Test1 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=10;i<101;i++){
			int ge = i%10;
			int shi = i/10%10;
			
			if((ge%2!=0)&&(shi%2!=0)){
				count++;
				System.out.println(i);
			}
		}
		
		System.out.println("count:"+count);
		
		/*int ge=0;
		int shi=0;
		
		for(int i=10;i<101;i++){
			if(i%2==0){
				ge++;
				System.out.println(i);
			}
		}
		System.out.println("ge:"+ge);
		for(int i=10;i<101;i++){
			if(i%2!=0){
				shi++;
				System.out.println(i);
			}
		}

		
		
		System.out.println("shi:"+shi);*/
	}

}
