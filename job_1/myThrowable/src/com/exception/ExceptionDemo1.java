package com.exception;
/*
 * 如何处理多个异常：
 * 		可以使用多个try...catch语句
 * 		使用一个try和多个catch
 * 
 * 多个catch之间的顺序
 * 		多个catch之间可以有子父类关系
 * 		同级可以随意互换位置
 * 		如果出现子父类关系了，父类必须放后面
 * */
public class ExceptionDemo1 {

	public static void main(String[] args) {
		try {
			String s = null;
			System.out.println(s.length());
			int[] arr = new int[5];
			System.out.println(arr[6]);
			System.out.println(2 / 0);
		} catch (NullPointerException e) {
			System.out.println("空指针异常");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组角标越界");
		} catch (Exception e) {
			System.out.println("出现异常了");
		}
	}

}
