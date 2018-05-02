package cn.itcast.aspcetj_annocation;

import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerSercice {

	@Override
	public void serach() {
		System.out.println(1/0);
		
		System.out.println("customerService serach......");
	}

	@Override
	public void seave() {
		System.out.println("customerService seave......");
	}

	@Override
	public int update() {
		System.out.println("customerService update......");
		return 0;
	}
	

}
