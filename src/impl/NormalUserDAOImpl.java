package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeSet;

import jdbc.jdbc;
import vo.NormalUserVO;
import dao.NormalUserDAO;
/**
 * 
 * @author CYwlDXS
 * 普通用户操作实现
 */
public class NormalUserDAOImpl implements NormalUserDAO {

	private Connection conn;

	/*
	 * 登录连接数据库
	 */
	public NormalUserDAOImpl() {
		conn = null;
		try {
			conn = jdbc.jdbc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public boolean addNormalUser(NormalUserVO normaluser) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into NORMALUSER(NO,PWD) values('"
					+ normaluser.getNo() + "','" + normaluser.getPwd() + "')";
			ResultSet rs = stmt.executeQuery(sql);

			if (!rs.next()) {
				return false;
			} else {
				return true;
			}
		}

		catch (SQLException e) {
			return false;
		}

	}



	public NormalUserVO saveNormalUserVO(String no, String pwd) {
		NormalUserVO normaluservo = new NormalUserVO();
		normaluservo.setNo(no);
		normaluservo.setPwd(pwd);
		return normaluservo;
	}

	public boolean alterNormalUser(String no, String type, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean searchNormalUser(String no) {
		// TODO Auto-generated method stub
		return false;
	}

	public TreeSet<NormalUserVO> listSortedNmUser() {
		// TODO Auto-generated method stub
		return null;
	}

}
