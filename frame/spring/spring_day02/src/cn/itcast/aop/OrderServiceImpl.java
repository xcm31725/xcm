package cn.itcast.aop;

public class OrderServiceImpl implements IOrderService{

	@Override
	public void addOrder() {
		System.out.println("orderService add......");
	}

	@Override
	public void updateOrder() {
		System.out.println("orderService update......");
	}
	
}
