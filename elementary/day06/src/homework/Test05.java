package homework;

import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������һ������");
		int a = sc.nextInt();
		System.out.print("������ڶ�������");
		int b = sc.nextInt();
		
		int[] arr = array(a,b);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int[] array(int a,int b){
		int sum = a+b;
		int jian = a-b;
		int cheng = a*b;
		int chu = a/b;
		
		int[] arr = {sum,jian,cheng,chu};
		
		return arr;
	}

}
