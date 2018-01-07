package homework;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random sb = new Random();
		int a = sb.nextInt(100)+1;
		int b = sb.nextInt(100)+1;
//		System.out.println("a:"+a+",b:"+b);
		int sum = sum(a,b);
		System.out.println("sum:"+sum);
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
}
