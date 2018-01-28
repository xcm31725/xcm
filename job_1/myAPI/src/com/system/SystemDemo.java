package com.system;
/*
 * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 * 		赋值数组
 * static long currentTimeMillis() 
 * 		返回当前系统时间
 * static void exit(int status) 
 * 		终止当前JVM虚拟机
 * */
public class SystemDemo {

	public static void main(String[] args) {
		/*
		  * static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		  *  
		  *  sre：源数组
		  *  srcPos：指定从哪个索引位置开始复制
		  *  dest：目标数组
		  *  destPos：从指定目标数组接收元素的索引位置
		  *  length：目标数组接收元素的个数
	      * */
		//源数组
		int[] src = {1,2,3,4,5};
		//目标数组
		int[] dest = new int[5];
		
		System.arraycopy(src, 0, dest, 0, 5);
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
		
		/*
		 * static long currentTimeMillis() ：以毫秒返回当前系统时间（1970-1-1 0:0:0至今过来多少毫秒）
		 * 1000毫秒 = 1秒
		 * 相当于1970-1-1 0:0:0  0
		 * 如果系统时间是1970-1-1 0:0:0  0
		 * 如果系统时间是1970-1-1 0:0:1  1000
		 * */
		System.out.println(System.currentTimeMillis());
	}

}
