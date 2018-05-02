package cn.itcast.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class AccountDAOImpl extends JdbcDaoSupport implements IAccountDAO {

	//转出
	@Override
	public void accountOut(String outname, double money) {
		this.getJdbcTemplate().update("update account set money=money-? where name=?", money, outname);
	}

	//转入
	@Override
	public void accountIn(String inname, double money) {
		this.getJdbcTemplate().update("update account set money=money+? where name=?", money, inname);
	}

}
