package zuoye;

import java.util.Scanner;

public class Test3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("请输入你的名字：");
		String name = sc.nextLine();
		System.err.print("请输入你的年龄：");
		int age = sc.nextInt();
		System.err.print("请输入你的身高：");
		int hight = sc.nextInt();
		
		System.out.println("我的名字是："+name);
		System.out.println("我的年龄是："+age);
		System.out.println("我的身高是："+hight);
	}

}
