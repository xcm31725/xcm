package com.itheima;
/*
 * 多态的优缺点
 * 		优点：可以提高代码的可维护性（多态前提所保证的），提高代码的可扩展性
 * 		缺点：无法直接访问子类特有的成员
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
		System.out.println("使用DadMi打电话");
	}
}

class MiNote implements Phone{
	public void call(){
		System.out.println("使用MiNote打电话");
	}
}