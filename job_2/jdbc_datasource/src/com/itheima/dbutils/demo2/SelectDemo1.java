package com.itheima.dbutils.demo2;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.junit.Test;

import com.itheima.dbutils.bean.Account;
import com.itheima.jdbc.utils.JDBCUtils2;

public class SelectDemo1 {
	@Test
	public void test_select1() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		List<Account> list = queryRunner.query("select * from account", new ResultSetHandler<List<Account>>(){

			@Override
			public List<Account> handle(ResultSet rs) throws SQLException {
				List<Account> list = new ArrayList<Account>();
				while(rs.next()) {
					Account account = new Account();
					account.setId(rs.getInt("id"));
					account.setName(rs.getString("name"));
					account.setMoney(rs.getDouble("money"));
					list.add(account);
				}
				
				return list;
			}
			
		});
		for (Account account : list) {
			System.out.println(account);
		}
	}
	
	@Test
	/**
	 * 单条记录查找
	 */
	public void test_select() throws Exception {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils2.getDataSource());
		Account account = queryRunner.query("select * from account where id = ? ", new ResultSetHandler<Account>(){

			@Override
			public Account handle(ResultSet rs) throws SQLException {
				Account account = new Account();
				if(rs.next()){
					account.setId(rs.getInt("id"));
					account.setName(rs.getString("name"));
					account.setMoney(rs.getDouble("money"));
				}
				return account;
			}
			
		},4);
		System.out.println(account);
	}
}
