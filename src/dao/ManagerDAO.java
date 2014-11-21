package dao;

/**
 * 
 * @author CYwlDXS 管理员 信息修改；
 */
public interface ManagerDAO {

	/**
	 * 修改
	 * 
	 * @param no
	 * @param type
	 * @param value
	 * @return
	 */
	boolean alterManager(String no, String type, String value);
}
