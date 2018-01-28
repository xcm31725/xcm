package com.system;

public class SystemDemo {

	public static void main(String[] args) {
		int[] src = {1,2,3,4,5};
		
		int[] dest = new int[5];
		
		//static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
		System.arraycopy(src, 0, dest, 0, 3);
		
		for (int i = 0; i < dest.length; i++) {
			System.out.println(dest[i]);
		}
	}

}
