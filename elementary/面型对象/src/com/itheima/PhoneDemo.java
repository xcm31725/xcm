package com.itheima;

public class PhoneDemo {

	public static void main(String[] args) {
		//��������ĸ�ʽ��     ���� ������ = new ����();
		//����������ʵ���ǺϷ��ı�ʶ���������һ������������ĸСд������Ƕ�����ʣ��ӵڶ������ʿ�ʼ����ĸ��д
		Phone c = new Phone();
		
		/*// ��Ա������ʽ��   ������.������
		c.brand = "honor";
		c.price = 1999;
		
		System.out.println(c.brand+"........"+c.price);
		//*������.������(�в�����������û�о�ʲô����д);
		c.Call();
		c.sendMessage();
		c.playGame();*/
		
		c.setBrand("��Ϊ");
		c.setPrice(1999);
		System.out.println(c.getBrand()+"..."+c.getPrice());
		c.call();
		c.sendMessage();
		c.playGame();
	}

}
/*
 * ģ��ѧ�����࣬��ѧ���Լ����
 * 		���ԣ�Ʒ��(brand)�۸�(price)
 * 		��Ϊ����绰(call),����Ϣ(sendMessage)����Ϸ(playGame)
 * */
class Phone{//��Javabeen��    ���öԱ�����ṩ����
	private String brand;
	private int price;
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;//ԭ���ĸ�ʽ�� return this.price;�㲻��ϵͳ��Ĭ�ϰ����
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call(){
		System.out.println("��绰");
	}
	public void sendMessage(){
		System.out.println("������");
	}
	public void playGame(){
		System.out.println("����Ϸ");
	}
}
