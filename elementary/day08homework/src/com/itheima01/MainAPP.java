package com.itheima01;

public class MainAPP {

	public static void main(String[] args) {
		String str = "javajfiewjavajfiowfjavagkljjava";
		char c = 'j';
		String s = "java";
		
		int count = countChar(str,c);
		System.out.println(count);
		
		int count1 = countString(str,s);
		System.out.println(count1);
	}

	public static int countChar(String str,char c){
		int count = 0;
		char[] chs = str.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			if(chs[i]==c){
				count++;
			}
		}
		return count;
	}
	
	public static int countString(String str,String s){
		/*String[] s1 = str.split(s);
		return s1.length;*/
		int index=0;
		int count = 0;
		while((index=str.indexOf(s)) != -1){
			String s1 = str.substring(0,index);
			String s2 = str.substring(index+s.length());
			str = s1+s2;
			count++;	
		}
		return count;
	}
}














