package com.itheima3;

import java.util.ArrayList;

/*
 * 3����ArrayList���Ԫ�ؽ��з�ת
		��ʾ:
			�ع�����������ν���Ԫ�ط�ת��,���������Ԫ�ط�ת������Ԫ�صķ�ת
 * */
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("xcm");
		list.add("ch");
		list.add("gd");
		list.add("wq");
		
		for(int i=list.size()-1; i>=0; i--){
			System.out.println(list.get(i));
		}
	}

}
