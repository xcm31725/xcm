package zuoye;

import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.err.print("������һ������");
		int a = sc.nextInt();
		
		String str = chengJi(a);
		System.out.println(str);
	}
	public static String chengJi(int a){
		String str = (a>=60)?"����":"������";
		
		return str;
	}

}
