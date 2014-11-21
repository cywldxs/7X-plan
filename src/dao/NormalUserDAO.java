package dao;

import java.util.TreeSet;

import vo.LoginVO;
import vo.NormalUserVO;

/**
 * 
 * @author CYwlDXS 普通用户 添加； 修改； 查询； 输出； 保存；
 */
public interface NormalUserDAO {
	/**
	 * 添加
	 * @param normaluser
	 * @return
	 */
	boolean addNormalUser(NormalUserVO normaluser);

	/**
	 * 修改
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterNormalUser(String no, String type, String value);

	/**
	 * 查询
	 * @param no
	 * @return
	 */
	boolean searchNormalUser(String no);

	/**
	 * 输出
	 * @return
	 */
	TreeSet<NormalUserVO> listSortedNmUser();

	/**
	 * 保存
	 * @param no
	 * @param pwd
	 * @return
	 */
	NormalUserVO saveNormalUserVO(String no, String pwd);
}
