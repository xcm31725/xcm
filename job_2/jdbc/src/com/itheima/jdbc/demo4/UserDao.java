package com.itheima.jdbc.demo4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.itheima.jdbc.utils.JDBCUtils;

public class UserDao {
	public boolean login(String username,String password) {
		Connection conn = null;
		//Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			/*conn = JDBCUtils.getConnection();
			stmt = conn.createStatement();
			String sql = "select * from user where username = '"+username+"' and password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			if(rs.next()) {
				flag = true;
			}*/
			conn = JDBCUtils.getConnection();
			String sql = "select * from user where username = ? and password = ?";
			pstmt  = conn.prepareStatement(sql);
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//JDBCUtils.release(rs, stmt, conn);
			JDBCUtils.release(rs, pstmt, conn);
		}
		return flag;
	}
}
