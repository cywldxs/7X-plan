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
 * ��¼�û���������
 */
public class LoginDAOImpl implements LoginDAO {
	
	private Connection conn;
	
	/*
	 * ��¼�������ݿ�
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
	 * ��¼ʱ����֤�û�������ķ���
	 */
	public boolean judgeManager(String no, String pwd) {

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
					+ loginvo.getLoginNo() + "','" + loginvo.getLoginPwd()
					+ "','" + loginvo.getLoginPermit() + "')";
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

	public Boolean searchLogin(LoginVO loginvo) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from LOGIN where NO = '"
					+ loginvo.getLoginNo() + "'";
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
		loginvo.setLoginNo(no);
		loginvo.setLoginPwd(pwd);
		loginvo.setLoginPermit(permit);
		return loginvo;
	}

}
