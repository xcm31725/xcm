package com.ithiema_02;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		System.out.println("sb:"+sb);
		System.out.println("sb.capacity():"+sb.capacity());
		System.out.println("sb.length():"+sb.length());
		
		
		sb.append("shang").append("wei").append("qiang").append("nui");
		System.out.println("sb:"+sb);
		
		sb.reverse();
		System.out.println("sb:"+sb);
	}

}
