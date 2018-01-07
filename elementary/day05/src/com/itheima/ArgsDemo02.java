package com.itheima;
/*
 * 结果是参数的本身，也用void
 * 
 * 如果一个方法 的结果是这个方法的形式参数本身，这个形式参数又是一个引用数据类型，
 * 那么我们这个方法可以不需要返回值（因此根据上面的结论，我们可以知道，在主方法中
 * 我们使用实际参数就可以得到结果）
 * */
public class ArgsDemo02 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------");
		change(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void change(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]%2==0){
				arr[i] *= 2;
			}
		}
	}

}
