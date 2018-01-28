package com.itheima;
/*
 * ��̬����ȱ��
 * 		�ŵ㣺������ߴ���Ŀ�ά���ԣ���̬ǰ������֤�ģ�����ߴ���Ŀ���չ��
 * 		ȱ�㣺�޷�ֱ�ӷ����������еĳ�Ա
 * */
public class PoymorphicDemo3 {

	public static void main(String[] args) {
		MiFactory mf = new MiFactory();
		mf.createPhone(new MiNote());
		mf.createPhone(new RadMi());
		
		//mf.createPhone(new Phone());
	}

}

class MiFactory{
	/*public void createPhone(MiNote mi){
		mi.call();
	}
	
	public void createPhone(RadMi mi){
		mi.call();
	}*/
	public void createPhone(Phone p){
		p.call();
	}
}

interface Phone{
	public void call();
}

class RadMi implements Phone{
	public void call(){
		System.out.println("ʹ��DadMi��绰");
	}
}

class MiNote implements Phone{
	public void call(){
		System.out.println("ʹ��MiNote��绰");
	}
}