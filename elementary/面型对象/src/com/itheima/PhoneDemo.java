package com.itheima;

public class PhoneDemo {

	public static void main(String[] args) {
		//创建对象的格式：     类名 对象名 = new 类名();
		//对象名：其实就是合法的标识符，如果是一个单词所有字母小写，如果是多个单词，从第二个单词开始首字母大写
		Phone c = new Phone();
		
		/*// 成员变量格式：   对象名.变量名
		c.brand = "honor";
		c.price = 1999;
		
		System.out.println(c.brand+"........"+c.price);
		//*对象名.方法名(有参数传参数，没有就什么都不写);
		c.Call();
		c.sendMessage();
		c.playGame();*/
		
		c.setBrand("华为");
		c.setPrice(1999);
		System.out.println(c.getBrand()+"..."+c.getPrice());
		c.call();
		c.sendMessage();
		c.playGame();
	}

}
/*
 * 模仿学生生类，让学生自己完成
 * 		属性：品牌(brand)价格(price)
 * 		行为：打电话(call),发信息(sendMessage)玩游戏(playGame)
 * */
class Phone{//叫Javabeen类    作用对别的类提供帮助
	private String brand;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;//原来的格式是 return this.price;你不加系统会默认帮你加
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call(){
		System.out.println("打电话");
	}
	public void sendMessage(){
		System.out.println("发短信");
	}
	public void playGame(){
		System.out.println("打游戏");
	}
}
