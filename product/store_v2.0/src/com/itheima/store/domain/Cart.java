package com.itheima.store.domain;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 购物车
 * @author sudong
 *
 */
public class Cart {
	/**
	 * 购物车属性
	 */
	private Double total = 0.0;
	private Map<String,CartItem> map = new LinkedHashMap<String,CartItem>();
	public Double getTotal() {
		return total;
	}
	public Map<String, CartItem> getMap() {
		return map;
	}
	
	/**
	 * 购物项的方法
	 */
	//将购物项添加到购物车
	public void addCart(CartItem cartItem){
		//判断购物项是否已经存在购物车中
		String pid = cartItem.getProduct().getPid();
		//判断pid是否在map的key中；
		if(map.containsKey(pid)) {
			//购物车中已经存在该商品
			CartItem _cartItem = map.get(pid);
			_cartItem.setCount(_cartItem.getCount()+cartItem.getCount());
		} else {
			//购物车中没有该商品
			map.put(pid, cartItem);
		}
		total += cartItem.getSubtotal();
	}
	
	//从购物车中移除购物项
	public void removeCart(String pid){
		//从map中移除某个元素
		CartItem cartItem = map.remove(pid);
		//总金额 减去 移除购物项的小计
		total -= cartItem.getSubtotal();
	}
	
	//清楚购物车
	public void clearCart() {
		//清空map集合
		map.clear();
		//设置总金额为0
		total = 0.0;
	}
}
