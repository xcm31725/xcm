package com.itheima01;

public class TestEmployee {//employeeԱ��

	public static void main(String[] args) {
		Employee e = new Employee("����","001",3000);
		e.getWork();
		System.out.println("-----------------------");
		
		Employee e1 = new Employee();
		e1.setName("����");
		e1.setId("002");
		e1.setSalary(3500);
		System.out.println("Ա�������֣�"+e1.getName()+", Ա����id��"+e1.getId()+" ,Ա���Ĺ��ʣ�"+e1.getSalary());
	}
 
}

class Employee{
	private String name;
	private String id;
	private double salary;//salary����
	
	public Employee() {}
	
	public Employee(String name,String id,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
	
	public void setSalary(double salary){
		this.salary = salary;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void getWork(){
		System.out.println("Ա�������֣�"+name+" ,Ա����id��"+id+" ,Ա���Ĺ���"+salary);
	}
}






















