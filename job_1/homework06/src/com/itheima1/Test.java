package com.itheima1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*
 * 1�������������󣬲��ô���ʵ�֣�
		(1)����List���ϣ�ʹ�ü���¼��������ַ���,������"quit"�ַ���ʱ��������
		(2)ɾ���������ַ���"def"
		(3)Ȼ�����õ�������������Ԫ�ز����
 * */
public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("�������ַ�����");
			String s = sc.next();
			
			if(s.equals("quit")){
				break;
			}
			
			list.add(s);
			list.remove("def");
		}
		
		
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
