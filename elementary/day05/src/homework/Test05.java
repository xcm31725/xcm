package homework;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入一个数（0~100）之间：");
		int n = sc.nextInt();

		char ch = number(n);
		System.out.println("ch:"+ch);
	}
	
	public static char number(int n){
		if(n>=90&&n<=100){
			return 'A';
		}else if(n>=80&&n<90){
			return 'B';
		}else if(n>=70&&n<80){
			return 'C';
		}else if(n>=60&&n<70){
			return 'D';
		}else if(n>=0&&n<60){
			return 'E';
		}else{
			return 'F';
		}
	}

}
