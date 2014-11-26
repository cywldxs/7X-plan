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
	/**
	 * 添加教师
	 * @param teacher
	 * @return
	 */
	boolean addTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade);
	
	/**
	 * 修改教师
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade);
	
	/*
	 * 查询
	 */
	void searchTeacher(String no);
	
	/*
	 * 输出
	 */
	TreeSet<TeacherVO> listSortedTeacher();
	
	/**
	 * 删除教师用户
	 * @param no
	 * @return
	 */
	boolean deleteTeacher(String no);
}
