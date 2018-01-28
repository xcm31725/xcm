package com.arraylist;

public class MyArrayList {
	//�����鶨���ڳ�Աλ�ã������ǷǾ�̬��
	Object[] arr = new Object[2];
	//��¼�����д���Ԫ�صĸ���
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
	
	//��ȡ����
	public int size() {
		return count;
	}
	
	//��ȡ���ϵ�Ԫ��
	public Object git(int index) {
		return arr[index];
	}
	
	//ɾ�����ϵ�Ԫ�أ�ɾ���ɹ������ظ�Ԫ��
	public Object remove(int index) {
		Object result = arr[index];
		System.arraycopy(arr, index+1, arr, index, count-index-1);
		count--;
		return result;
	}
	
	//�޸ļ��ϵ�ָ��������Ԫ��
	public Object set(int index, Object obj) {
		Object rusult = arr[index]; 
		arr[index] = obj;
		return arr[index];
	}
}
