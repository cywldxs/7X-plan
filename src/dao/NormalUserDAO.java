package dao;

import java.util.TreeSet;

import vo.LoginVO;
import vo.NormalUserVO;

/**
 * 
 * @author CYwlDXS ��ͨ�û� ��ӣ� �޸ģ� ��ѯ�� ����� ���棻
 */
public interface NormalUserDAO {
	/**
	 * ���
	 * @param normaluser
	 * @return
	 */
	boolean addNormalUser(NormalUserVO normaluser);

	/**
	 * �޸�
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterNormalUser(String no, String type, String value);

	/**
	 * ��ѯ
	 * @param no
	 * @return
	 */
	boolean searchNormalUser(String no);

	/**
	 * ���
	 * @return
	 */
	TreeSet<NormalUserVO> listSortedNmUser();

	/**
	 * ����
	 * @param no
	 * @param pwd
	 * @return
	 */
	NormalUserVO saveNormalUserVO(String no, String pwd);
}
