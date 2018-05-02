package cn.itcast.web.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import cn.itcast.domain.Product;

@SuppressWarnings("serial")
public class ProductAction extends ActionSupport{
	private List<Product> list;
	
	public List<Product> getList() {
		return list;
	}

	public void setList(List<Product> list) {
		this.list = list;
	}
	
	public String addProduct() {
		System.out.println("addProduct.........");
		return null;
		
	}
	
	public String showProduct() {
		//得到List集合
		list = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setName("电冰箱");
		p1.setCount(100);
		p1.setPrice(1999);
		
		Product p2 = new Product();
		p2.setName("电视机");
		p2.setCount(200);
		p2.setPrice(2999);
		
		list.add(p1);
		list.add(p2);
		
		//将list保存到ValueStack中
		//ActionContext.getContext().getValueStack().set("list", list);
		
		return "success";
		
	}
}
