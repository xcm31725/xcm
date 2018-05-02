package com.itheima.product.domain;

import java.util.List;
/**
 * 
 * @ClassName: PageBean  
 * @Description: TODO 封装分页数据的JavaBean:
 * @author sudong
 * @date 2018年3月14日 下午4:49:21  
 *
 */
public class PageBean {
	private int currPage; // 当前页数.
	private int totalCount; // 总记录数.
	private int totalPage; // 总页数.
	private int pageSize;// 每页记录数.
	private List<Product> list; // 每页的数据的集合
	public int getCurrPage() {
		return currPage;
	}
	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Product> getList() {
		return list;
	}
	public void setList(List<Product> list) {
		this.list = list;
	}
}
