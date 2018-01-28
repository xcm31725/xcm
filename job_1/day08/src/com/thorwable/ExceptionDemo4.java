package com.thorwable;

public class ExceptionDemo4 {

	public static void main(String[] args){
		try {
			checkScore(110);
		} catch (ScoreOutOfBoundsException e) {
			e.printStackTrace();
		}
	}
	
	public static void checkScore(int n) throws ScoreOutOfBoundsException{
		
		if(n > 100 || n < 0){
			throw new ScoreOutOfBoundsException("�ɼ����Ϸ�");
		}
		
		System.out.println("����ɹ�");
	}
}
