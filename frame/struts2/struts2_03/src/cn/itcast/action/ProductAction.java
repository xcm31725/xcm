package cn.itcast.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;

import cn.itcast.domain.Product;

public class ProductAction {
	public String showProduct() {
		Product p = new Product();	
		p.setId(1);
		p.setName("笔记本");
		p.setPrice(4999);

		Product p1 = new Product();
		p1.setId(2);
		p1.setName("手机");
		p1.setPrice(2999);
		
		List<Product> list = new ArrayList<Product>();
		list.add(p);
		list.add(p1);
		
		System.out.println(list.toString());
		ActionContext.getContext().getValueStack().set("list", list);

		return "success";
	}
}
