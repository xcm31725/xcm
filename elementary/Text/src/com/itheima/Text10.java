package com.itheima;

import java.util.*;
public class Text10 {

	public static void main(String[] args) {
		int[] arr = {10,12,33,1,32,22};
		
		for(int i=0; i<arr.length; i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
		System.out.println();
		
		aaa(arr);
		for(int i=0; i<arr.length; i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
		
		System.out.println("==============================================");
		
		bbb(arr);
		for(int i=0; i<arr.length; i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
		System.out.println("==============================================");
		
		//Arrays.sort(arr);
		ccc(arr);
		for(int i=0; i<arr.length; i++){
			if(i==arr.length-1){
				System.out.println(arr[i]);
			}else{
				System.out.print(arr[i]+",");
			}
		}
	}
	/*
	 * Ñ¡ÔñÅÅĞò
	 * */
	
	public static void aaa(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			for(int y=i+1; y<arr.length; y++){
				if(arr[i] > arr[y]){
					int temp = arr[i];
					arr[i] = arr[y];
					arr[y] = temp;
				}
			}
		}
	}
	
	/*
	 * Ã°ÅİÅÅĞò
	 * */
	public static void bbb(int[] arr){
		for(int x=arr.length-1; x>0; x--){
			for(int y=0; y<x; y++){
				if(arr[y] > arr[y+1]){
					int temp = arr[y];
					arr[y] = arr[y+1];
					arr[y+1] = temp;
				}
			}
		}
	}
	/*
	 *ÅÅĞòÓÅ»¯ĞÔÄÜ 
	 */
	public static void ccc(int[] arr){
		for(int x=0; x<arr.length-1; x++){
			int num = arr[x];
			int index = x;
			for(int y=1+x; y<arr.length; y++){
				if(num > arr[y]){
					num = arr[y];
					index = y;
				}
			}
			if(index!=x){
				int temp = arr[x];
				arr[x] = arr[x+1];
				arr[x+1] = temp;
			}
		} 
	}
}
