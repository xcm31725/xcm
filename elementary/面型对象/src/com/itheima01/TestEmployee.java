package com.itheima01;

public class TestEmployee {//employee员工

	public static void main(String[] args) {
		Employee e = new Employee("张三","001",3000);
		e.getWork();
		System.out.println("-----------------------");
		
		Employee e1 = new Employee();
		e1.setName("李四");
		e1.setId("002");
		e1.setSalary(3500);
		System.out.println("员工的名字："+e1.getName()+", 员工的id："+e1.getId()+" ,员工的工资："+e1.getSalary());
	}
 
}

class Employee{
	private String name;
	private String id;
	private double salary;//salary工资
	
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
		System.out.println("员工的名字："+name+" ,员工的id："+id+" ,员工的工资"+salary);
	}
}






















