package com.itheima;

public class Test02 {

	public static void main(String[] args) {
		int count = 0;
		for(int i=10000; i<100000; i++){
			int ge = i%10;
			int shi = i/10%10;
			int qian = i/1000%10;
			int wan = i/10000;
			
			if(pan(i)){
				if(count%5==0&&count!=0){
					System.out.println();
				}
				System.out.print(i+"  ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);

	}
	
	public static boolean pan(int i){
		
			int ge = i%10;
			int shi = i/10%10;
			int qian = i/1000%10;
			int wan = i/10000;
			
			if(ge==wan&shi==qian){
				return true;
			}
		return false;
	}

}
