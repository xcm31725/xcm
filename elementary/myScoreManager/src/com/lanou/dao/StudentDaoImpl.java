package com.lanou.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.lan.entity.Student;
import com.lanou.util.JdbcUtil;

public class StudentDaoImpl implements IStudentDao{
	@Override
	public ArrayList<Student> getAllStudents() {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句查询所有的学生对象,封装到arraylist集合
			String sql = "select * from student";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			ArrayList<Student> stus = new ArrayList<>();
			while(rs.next()){
				Student s = new Student();
				//从数据库中根据字段名查询
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				double math = rs.getDouble("math");
				double english = rs.getDouble("english");
				double chinses = rs.getDouble("chinses");
				//从数据库中查询出来的数据设置为s对象的属性值
				s.setId(id);
				s.setName(name);
				s.setSex(sex);
				s.setMath(math);
				s.setEnglish(english);
				s.setChinses(chinses);
				//把每一个对象添加集合中
				stus.add(s);
			}
			return stus;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 往数据库student表中添加stu对象
	 */
	@Override
	public boolean addStudent(Student stu) {
		try {
			System.out.println("stu:"+stu);
			//1、构建连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句,执行插入stu操作
			String sql = "insert into student(name,sex,math,english,chinses) values(?,?,?,?,?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,stu.getName());
			pstmt.setString(2,stu.getSex());
			pstmt.setDouble(3,stu.getMath());
			pstmt.setDouble(4,stu.getEnglish());
			pstmt.setDouble(5,stu.getChinses());
			int rows = pstmt.executeUpdate();
			if(rows!=0){//插入数据成功
				System.out.println("插入成功!!!");
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}
	/**
	 * 根据id查找学生对象
	 */
	@Override
	public Student findStudentById(int id) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句,根据id查询记录
			String sql = "select * from student where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			ResultSet rs = pstmt.executeQuery();
			//3、将查询的结果记录封装成一个student对象
			if(rs.next()){
				Student s = new Student();
				//从数据库中根据字段名查询出来的结果值
				String name = rs.getString("name");
				String sex = rs.getString("sex");
				double math = rs.getDouble("math");
				double english = rs.getDouble("english");
				double chinses = rs.getDouble("chinses");
				//将结果封装到student对象上
				s.setId(id);
				s.setName(name);
				s.setSex(sex);
				s.setMath(math);
				s.setEnglish(english);
				s.setChinses(chinses);
				return s;
			}
		} catch (Exception e) {
		}
		return null;
	}
	/**
	 * 修改学生信息
	 */
	@Override
	public boolean updateStudent(Student student) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句修改学生信息
			String sql = "update student set name=?,sex=?,math=?,english=?,chinses=? where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,student.getName());
			pstmt.setString(2,student.getSex());
			pstmt.setDouble(3,student.getMath());
			pstmt.setDouble(4,student.getEnglish());
			pstmt.setDouble(5,student.getChinses());
			pstmt.setInt(6,student.getId());
			int rows = pstmt.executeUpdate();
			if(rows!=0){
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}
	/**
	 * 根据id删除学生对象
	 */
	@Override
	public boolean deleteStudent(int id) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句删除学生对象
			String sql = "delete from student where id=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			int rows = pstmt.executeUpdate();
			if(rows!=0){//删除成功
				return true;
			}
		} catch (Exception e) {
		}
		return false;
	}

	@Override
	public ArrayList<Student> getStudentByKey(String key) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句进行模糊查询
			//搜索名字中带有s的  select * from student where name like %s%
			String sql = "select * from student where name like ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1,"%"+key+"%");
			ResultSet rs = pstmt.executeQuery();
			//将模糊搜索结果封装到list集合
			ArrayList<Student> list = new ArrayList<>();
			while(rs.next()){
				Student s = new Student(
						rs.getInt("id"), 
						rs.getString("name"), 
						rs.getString("sex"), 
						rs.getDouble("math"), 
						rs.getDouble("english"), 
						rs.getDouble("chinses"));
				list.add(s);
			}
			return list;
		} catch (Exception e) {
		}
		return null;
	}
	/**
	 * 根据每页显示个数判断需要显示页数
	 */
	@Override
	public int getPageCount(int count) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句查询student表中有多少条记录
			String sql = "select count(*) from student";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()){
				//总记录数
				int total = rs.getInt(1);
				System.out.println("total:"+total);
				//每页显示count个数据,总共可以显示多少页
				int pageCount = total%count==0?total/count:total/count+1;
				return pageCount;
			}
		} catch (Exception e) {
		}
		return 0;
	}
	
	public static void main(String[] args) {
		StudentDaoImpl impl = new StudentDaoImpl();
		ArrayList<Student> stus = impl.getStudentByIndex(2,2);
		System.out.println(stus);
	}
	
	/**
	 * 分页查询学生对象
	 */
	@Override
	public ArrayList<Student> getStudentByIndex(int index, int count) {
		try {
			//1、获取连接对象
			Connection conn = JdbcUtil.getConnection();
			//2、编写sql语句分页查询
			String sql = "select * from student limit ?,?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,(index-1)*count);
			pstmt.setInt(2,count);
			ResultSet rs = pstmt.executeQuery();
			//3、将查询结果封装到list集合中
			ArrayList<Student> list = new ArrayList<>();
			while(rs.next()){
				Student s = new Student(
						rs.getInt("id"), 
						rs.getString("name"), 
						rs.getString("sex"), 
						rs.getDouble("math"), 
						rs.getDouble("english"), 
						rs.getDouble("chinses"));
				list.add(s);
			}
			return list;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}
}















