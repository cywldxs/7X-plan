package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import vo.LoginVO;
import jdbc.jdbc;
import dao.LoginDAO;

/**
 * 
 * @author CYwlDXS
 * 登录用户操作方法
 */
public class LoginDAOImpl implements LoginDAO {
	
	private Connection conn;
	
	/*
	 * 登录连接数据库
	 */
	public LoginDAOImpl()
	{
		conn = null;
		try {
			conn = jdbc.jdbc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	

	/*
	 * (non-Javadoc)
	 * 
	 * @see dao.LoginDAO#judgeManager(java.lang.String, java.lang.String)
	 * 登录时，验证用户名密码的方法
	 */
	public boolean loginJudge(String no, String pwd) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from LOGIN where NO = '" + no
					+ "'and PWD = '" + pwd + "' ";
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

	public Boolean addLogin(LoginVO loginvo) {


		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into LOGIN(NO,PWD,PERMIT) values('"
					+ loginvo.getNo() + "','" + loginvo.getPwd()
					+ "','" + loginvo.getPermit() + "')";
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

	public Boolean searchLogin(String no) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from LOGIN where NO = '"
					+ no + "'";
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

	public LoginVO saveLoginVO(String no, String pwd, String permit) {
		LoginVO loginvo = new LoginVO();
		loginvo.setNo(no);
		loginvo.setPwd(pwd);
		loginvo.setPermit(permit);
		return loginvo;
	}



	public String rtLoginType(String no) {
		String type = null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select PERMIT from LOGIN where NO = '"
					+ no + "'";
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				type = (String) rs.getObject(1);
			} else {
				
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
		}
		return type;
	}

}
