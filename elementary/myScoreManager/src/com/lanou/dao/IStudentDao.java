package com.lanou.dao;

import java.util.ArrayList;

import com.lan.entity.Student;

/**
 * 学生操作相关的接口
 */
public interface IStudentDao {
	/**
	 * 查找student表中所有的学生对象，封装成一个集合
	 * @return
	 */
	public ArrayList<Student> getAllStudents();
	/**
	 * 添加学生对象
	 * @param stu  要添加的学生
	 * @return 添加成功返回true  失败返回false
	 */
	public boolean addStudent(Student stu);
	/**
	 * 根据id查找学生对象信息
	 * @param id
	 * @return
	 */
	public Student findStudentById(int id);
	/**
	 * 修改学生信息
	 * @param student 需要修改的信息
	 * @return 修改成功返回true 失败返回false
	 */
	public boolean updateStudent(Student student);
	/**
	 * 根据id删除学生对象
	 * @param id 需要删除的学生id
	 * @return 删除成功返回true，失败返回false
	 */
	public boolean deleteStudent(int id);
	/**
	 * 根据key值进行模糊搜索
	 * @param key 模糊匹配值
	 * @return 模糊匹配结果
	 */
	public ArrayList<Student> getStudentByKey(String key);
	/**
	 * 根据每页显示个数,判断总共需要显示多少页
	 * @param count
	 * @return
	 */
	public int getPageCount(int count);
	/**
	 * 根据当前页面和每页个数显示学生对象
	 * @param index 当前页面
	 * @param count 每个个数
	 * @return 分页显示的学生对象
	 */
	public ArrayList<Student> getStudentByIndex(int index,int count);
}












