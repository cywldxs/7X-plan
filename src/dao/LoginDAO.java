package dao;

import vo.LoginVO;

/**
 * 
 * @author CYwlDXS ��¼�û� ��֤�� ��ӣ� ���ң� �洢��
 */
public interface LoginDAO {

	/**
	 * ��֤
	 * 
	 * @param mid
	 * @param pwd
	 * @return
	 * @throws ClassNotFoundException
	 */
	boolean judgeManager(String mid, String pwd) throws ClassNotFoundException;

	/**
	 * ���
	 * 
	 * @param loginvo
	 * @return
	 */
	Boolean addLogin(LoginVO loginvo);

	/**
	 * ����
	 * 
	 * @param loginvo
	 * @return
	 */
	Boolean searchLogin(LoginVO loginvo);

	/**
	 * �洢
	 * 
	 * @param no
	 * @param pwd
	 * @param permit
	 * @return
	 */
	LoginVO saveLoginVO(String no, String pwd, String permit);
}
