package cn.itcast.dao;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("userDao")
@Scope("singleton")
public class ServiceDaoImpl implements IUServiceDao {

	@Override
	public void add() {
		System.out.println("userDao add......");
	}
	
	@PostConstruct
	public void init() {
		
	}
	
	@PreDestroy
	public void myDestory() {
		
	}
}
