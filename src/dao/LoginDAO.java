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
	 * @param no
	 * @param pwd
	 * @return
	 * @throws ClassNotFoundException
	 */
	boolean loginJudge(String no, String pwd) throws ClassNotFoundException;

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
	Boolean searchLogin(String no);

	/**
	 * �洢
	 * 
	 * @param no
	 * @param pwd
	 * @param permit
	 * @return
	 */
	LoginVO saveLoginVO(String no, String pwd, String permit);
	
	/**
	 * ͨ���ʺŲ�ѯ�ʺ����Ͳ���������
	 * @param no
	 * @return
	 */
	String rtLoginType(String no);
}
