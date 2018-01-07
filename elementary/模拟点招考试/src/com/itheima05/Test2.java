package com.itheima05;

import java.util.ArrayList;

/*
 * 创建2个ArrayList集合，分别存放strs数组中字符串长度为偶数的元素和字符串长度为奇数的元素，
 * 最终将这两个集合在控制台打印输出：打印格式如下：
                    长度为偶数的元素有：[12, 6789, 4567];
                    长度为基数的元素有：[345, 1, 123];

 * */
public class Test2 {
	public static void main(String[] args) {
		String[] strs = {"12","6789","4567","345","1","123"};
		ArrayList<String> array = new ArrayList<String>();
		ArrayList<String> array1 = new ArrayList<String>();
		
		for(int i=0;i<strs.length;i++){
			String s = strs[i];
			if(s.length()%2==0){
				array.add(s);
			}else{
				array1.add(s);
			}
		}
		System.out.print("长度为偶数的元素有:[");
		//String ss = "长度为偶数的元素有:[";
		for (int i = 0; i < array.size(); i++) {
			String s = array.get(i);
			if(i==array.size()-1){
				System.out.println(s+"]");
			}else{
				System.out.print(s+", ");
			}
			
			//System.out.println(" 长度为偶数的元素有:"+s);
		}
		
		System.out.print("长度为基数的元素有:[");
		//ss = "长度为基数的元素有:[";
		for (int i = 0; i < array1.size(); i++) {
			String s = array1.get(i);
			if(i==array1.size()-1){
				System.out.println(s+"]");
			}else{
				System.out.print(s+", ");
			}
			//System.out.println(" 长度为基数的元素有:"+s);
		}
		
		
	}
}
