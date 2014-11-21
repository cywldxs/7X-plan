package dao;

import java.util.TreeSet;

import vo.TeacherVO;

/**
 * 
 * @author CYwlDXS
 * 教师信息
 * 增
 * 改
 * 查
 * 输出
 */
public interface TeacherDAO {
	/*
	 * 添加
	 */
	void addTeacher(TeacherVO teacher);
	
	/*
	 * 修改
	 */
	void alterTeacher(String no,String type,String value);
	
	/*
	 * 查询
	 */
	void searchTeacher(String no);
	
	/*
	 * 输出
	 */
	TreeSet<TeacherVO> listSortedTeacher();
}
