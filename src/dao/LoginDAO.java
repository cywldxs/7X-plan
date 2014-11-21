package dao;

import vo.LoginVO;

/**
 * 
 * @author CYwlDXS 登录用户 验证； 添加； 查找； 存储；
 */
public interface LoginDAO {

	/**
	 * 验证
	 * 
	 * @param mid
	 * @param pwd
	 * @return
	 * @throws ClassNotFoundException
	 */
	boolean judgeManager(String mid, String pwd) throws ClassNotFoundException;

	/**
	 * 添加
	 * 
	 * @param loginvo
	 * @return
	 */
	Boolean addLogin(LoginVO loginvo);

	/**
	 * 查找
	 * 
	 * @param loginvo
	 * @return
	 */
	Boolean searchLogin(LoginVO loginvo);

	/**
	 * 存储
	 * 
	 * @param no
	 * @param pwd
	 * @param permit
	 * @return
	 */
	LoginVO saveLoginVO(String no, String pwd, String permit);
}
