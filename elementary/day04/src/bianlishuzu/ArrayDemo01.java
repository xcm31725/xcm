package bianlishuzu;

public class ArrayDemo01 {

	public static void main(String[] args) {
		int[] arr = {11,22,33,44,55};
		
		for(int i=0; i<5; i++){
			System.out.println(arr[i]);
		}
		System.out.println("---------------");
		
		System.out.println("数组共有"+arr.length+"个");
		System.out.println("---------------");
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}

	}

}
