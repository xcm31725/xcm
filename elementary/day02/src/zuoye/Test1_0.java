package zuoye;

import java.util.Scanner;

public class Test1_0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������һ������");
		
		int a = sc.nextInt();
		
		String str =  s(a);
		System.out.println(str);
	}
	public static String s(int a){
        
		String str = (a%2==0)?"ż��":"����";
		
		return str;

	}

}

