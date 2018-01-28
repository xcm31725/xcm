package com.arraylist;

public class MyArrayList {
	//把数组定义在成员位置，并且是非静态的
	Object[] arr = new Object[2];
	//记录数组中储存元素的个数
	private int count = 0;
	
	public boolean add(Object obj) {
		if(count == arr.length){
			Object[] newArr = new Object[2 * arr.length];
			System.arraycopy(arr, 0, newArr, 0, count);
			arr = newArr;
		}
		
		arr[count] = obj;
		count++;
		return true;
	}
	
	//获取长度
	public int size() {
		return count;
	}
	
	//获取集合的元素
	public Object git(int index) {
		return arr[index];
	}
	
	//删除集合的元素，删除成功并返回该元素
	public Object remove(int index) {
		Object result = arr[index];
		System.arraycopy(arr, index+1, arr, index, count-index-1);
		count--;
		return result;
	}
	
	//修改集合的指定索引的元素
	public Object set(int index, Object obj) {
		Object rusult = arr[index]; 
		arr[index] = obj;
		return arr[index];
	}
}
