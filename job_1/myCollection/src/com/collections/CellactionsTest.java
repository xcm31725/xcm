package com.collections;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ģ�⶷����
 * 		����
 * 		ϴ��
 * 		����
 * */
public class CellactionsTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		String[] color = {"����","÷��","����","��Ƭ"};
		
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		for(int i=0; i<color.length; i++){
			for(int j=0; j<num.length; j++){
				list.add(color[i]+num[j]);
			}
		}
		list.add("����");
		list.add("С��");
		//System.out.println(list);
		Collections.shuffle(list);
		
		ArrayList<String> xcm = new ArrayList<String>();
		ArrayList<String> xgd = new ArrayList<String>();
		ArrayList<String> shd = new ArrayList<String>();
		
		for (int i = 0; i < list.size()-3; i++) {
			if(i%3==0){
				xcm.add(list.get(i));
			}else if(i%3==1){
				xgd.add(list.get(i));
			}else if(i%3==2){
				shd.add(list.get(i));
			}
		}
		
		System.out.println("xcm:"+xcm);
		System.out.println("xgd:"+xgd);
		System.out.println("shd:"+shd);
		
		System.out.println("���ƣ�");
		for (int i = list.size()-3; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
