package zuoye;

import java.util.Random;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("请输入数组的长度(大于5的数)：");
		int i = sc.nextInt();
		int[] arr = new int[i];
		
		Random r = new Random();
		
		for(int a=0; a<i; a++){
			arr[a] = r.nextInt(10)+1;
			if(arr[a]>5&&arr[a]%2==0){
				System.out.println("arr["+a+"]="+arr[a]);
			}
			
		}

	}

}
