package cn.itcast.service;

import org.springframework.beans.factory.annotation.Autowired;

import cn.itcast.dao.IAccountDAO;

public class AccountServiceImpl implements IAccountService {
	private IAccountDAO accountDao;
	
	public IAccountDAO getAccountDao() {
		return accountDao;
	}

	public void setAccountDao(IAccountDAO accountDao) {
		this.accountDao = accountDao;
	}

	//转账操作方法
	@Override
	public void account(String outname, String inname, double money) {
		//从outname转出money
		accountDao.accountOut(outname, money);
		
		int a = 2/0;
		
		//给inname转进money
		accountDao.accountIn(inname, money);
	}

}
