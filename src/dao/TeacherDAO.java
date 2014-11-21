package dao;

import java.util.TreeSet;

import vo.TeacherVO;

/**
 * 
 * @author CYwlDXS
 * ��ʦ��Ϣ
 * ��
 * ��
 * ��
 * ���
 */
public interface TeacherDAO {
	/*
	 * ���
	 */
	void addTeacher(TeacherVO teacher);
	
	/*
	 * �޸�
	 */
	void alterTeacher(String no,String type,String value);
	
	/*
	 * ��ѯ
	 */
	void searchTeacher(String no);
	
	/*
	 * ���
	 */
	TreeSet<TeacherVO> listSortedTeacher();
}
