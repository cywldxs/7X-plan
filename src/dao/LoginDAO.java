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
	 * @param no
	 * @param pwd
	 * @return
	 * @throws ClassNotFoundException
	 */
	boolean loginJudge(String no, String pwd) throws ClassNotFoundException;

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
	Boolean searchLogin(String no);

	/**
	 * 存储
	 * 
	 * @param no
	 * @param pwd
	 * @param permit
	 * @return
	 */
	LoginVO saveLoginVO(String no, String pwd, String permit);
	
	/**
	 * 通过帐号查询帐号类型并返回类型
	 * @param no
	 * @return
	 */
	String rtLoginType(String no);
}
