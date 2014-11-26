package impl;

import java.io.PrintWriter;
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
 * @author CYwlDXS 普通用户操作实现
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

	public boolean searchNormalUser(String no) {
		// TODO Auto-generated method stub
		return false;
	}

	public TreeSet<NormalUserVO> listSortedNmUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public NormalUserVO rtNUserInfo(String no) {
		NormalUserVO normalUserVO = new NormalUserVO();

		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NORMALUSER where NO = '" + no + "'";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				normalUserVO.setId((String) rs.getObject(6));
				normalUserVO.setNo((String) rs.getObject(1));
				normalUserVO.setName((String) rs.getObject(3));
				normalUserVO.setSex((String) rs.getObject(4));
				normalUserVO.setBirthday((String) rs.getObject(5));
				normalUserVO.setPwd((String) rs.getObject(2));
				normalUserVO.setMail((String) rs.getObject(7));
				normalUserVO.setImage((String) rs.getObject(8));
				normalUserVO.setTele((String) rs.getObject(9));
			} else {

			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return normalUserVO;
	}

	public boolean alterNormalUser(String id,String no, String name, String sex,
			String birthday, String pwd, String mail,String image,String tele) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "update NORMALUSER set ID = '"+id+"',PWD = '" + pwd + "',NAME = '"
					+ name + "',SEX = '" + sex
					+ "',BIRTHDAY = '" + birthday + "',MAIL = '"+mail+"',IMAGE = '"+image+"',TELE = '"+tele+"' where NO = '"
					+ no.trim() + "'";
			if (stmt.executeUpdate(sql) == 1) {

				sql = "update LOGIN set PWD = '" + pwd + "' where NO = '"
						+ no.trim() + "'";
				if (stmt.executeUpdate(sql) == 1) {
					return true;
				} else {
					return false;
				}

			} else {

				return false;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteNormalUser(String no) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from NORMALUSER where NO = '" + no + "'";
			if (stmt.executeUpdate(sql) == 1) {
				sql = "delete from LOGIN where NO = '" + no + "'";
				if (stmt.executeUpdate(sql) == 1) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

}
