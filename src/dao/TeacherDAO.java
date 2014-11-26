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
	/**
	 * ��ӽ�ʦ
	 * @param teacher
	 * @return
	 */
	boolean addTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade);
	
	/**
	 * �޸Ľ�ʦ
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade);
	
	/*
	 * ��ѯ
	 */
	void searchTeacher(String no);
	
	/*
	 * ���
	 */
	TreeSet<TeacherVO> listSortedTeacher();
	
	/**
	 * ɾ����ʦ�û�
	 * @param no
	 * @return
	 */
	boolean deleteTeacher(String no);
}
