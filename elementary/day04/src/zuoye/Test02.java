package zuoye;

import java.util.Random;

public class Test02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		Random r = new Random();
		
//		arr[0] = r.nextInt(10);
//		arr[1] = r.nextInt(10);
//		arr[2] = r.nextInt(10);
		
		for(int i=0; i<arr.length; i++){
			arr[i]=r.nextInt(10);
			System.out.println("arr["+i+"]="+arr[i]);
		}
	}

}
