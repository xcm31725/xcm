package homework;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数：");
		int a = sc.nextInt();
		
		ouShu(a);
	}
	
	public static void ouShu(int a){
		for(int i=0; i<=a; i++){
			if(i%2==0){
				System.out.print(i+" ");
			}
		}
	}

}
