package com.set;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {

	public static void main(String[] args) {
		String[] color = {"♠","♥","♦","♣"};
		
		String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		
		ArrayList<String> arr = new ArrayList<String>();
		
		for (int i = 0; i < color.length; i++) {
			for (int j = 0; j < num.length; j++) {
				arr.add(color[i]+num[j]);
			}
		}
		
		arr.add("大王");
		arr.add("小王");
		
		Collections.shuffle(arr);
		//System.out.println(arr);
		
		ArrayList<String> xcm = new ArrayList<String>();
		ArrayList<String> xgd = new ArrayList<String>();
		ArrayList<String> zc = new ArrayList<String>();
		
		for (int i = 0; i < arr.size()-3; i++) {
			if(i%3==0){
				xcm.add(arr.get(i));
			}else if(i%3==1){
				xgd.add(arr.get(i));
			}else if(i%3==2){
				zc.add(arr.get(i));
			}
		}
		
		System.out.println("xcm:"+xcm);
		System.out.println("xgd:"+xgd);
		System.out.println("zc:"+zc);
		
		System.out.println("底牌：");
		for(int i=arr.size()-3;i<arr.size();i++){
			System.out.println(arr.get(i));
		}
		
	}

}
