package com.itheima.model;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itheima.domain.Student;
import com.itheima.utils.JDBCUtils;

public class StudentModel1 {

	public List<Student> findAll() throws SQLException {
		QueryRunner queryRunner = new QueryRunner(JDBCUtils.getDataSource());
		List<Student> list = queryRunner.query("select * from student", new BeanListHandler<Student>(Student.class));
		return list;
		
	}
	
}
