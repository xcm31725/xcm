package array.shuzu;


public class ArrayDemo01 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};//静态数组初始化
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println("----------------------");
		
		arr = new int[]{5,6,7,8};//创建一个新的数组
		
		System.out.println(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		

	}

}
