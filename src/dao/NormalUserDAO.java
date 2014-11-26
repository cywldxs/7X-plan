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
	 * �����޸�
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterNormalUser(String id,String no, String name, String sex,
			String birthday, String pwd, String mail,String image,String tele);

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
	
	/**
	 * ������ͨ�û�����Ϣ
	 * @param no
	 * @return
	 */
	NormalUserVO rtNUserInfo(String no);
	
	/**
	 * ɾ����ͨ�û�
	 * @param no
	 * @return
	 */
	boolean deleteNormalUser(String no);
}
