package homework;

import java.util.Random;

public class Test01 {

	public static void main(String[] args) {
		Random r = new Random();
		int[] arr = new int[5];
		
		for (int i = 0; i < 5; i++) {
			int num = r.nextInt(100)+1;
			arr[i] = num;
			//System.out.println(num);
			
			if (arr[i]%10==3 || arr[i]/10%10==3) {
				System.out.println(arr[i]);
			}
		}
	}

}
