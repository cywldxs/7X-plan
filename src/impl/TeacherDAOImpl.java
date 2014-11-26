package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TreeSet;

import jdbc.jdbc;
import vo.TeacherVO;
import dao.LoginDAO;
import dao.TeacherDAO;

public class TeacherDAOImpl implements TeacherDAO{

	private Connection conn;

	/*
	 * 登录连接数据库
	 */
	public TeacherDAOImpl() {
		conn = null;
		try {
			conn = jdbc.jdbc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public boolean addTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade) {
		
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into TEACHER(NO,NAME,SEX,BIRTHDAY,PWD,EMAIL,TELE,GRADE) values('"+no+"','"+name+"','"+sex+"','"+birthday+"','"+pwd+"','"+email+"','"+tele+"','"+grade+"',)";

			if (stmt.executeUpdate(sql) == 1) {
				sql = "insert into LOGIN (NO,PWD,PERMIT) values('"+no+"','"+pwd+"','teacher')";
				if (stmt.executeUpdate(sql) == 1)
				{
					return true;
				}
				else
				{
					return false;
				}
			} else {
				return false;
			}
		}

		catch (SQLException e) {
			return false;
		}
		
	}

	public boolean alterTeacher(String no,String name, String sex, String birthday,String pwd, String email,String tele,String grade) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "update TEACHER set NAME = '" + name + "',SEX = '" + sex + "',BIRTHDAY = '" + birthday + "',PWD = '" + pwd + "',EMAIL = '" + pwd + "',TELE = '" + tele + "',GRADE = '" + grade + "' where NO = '"+no+"'";
			if (stmt.executeUpdate(sql) == 1) {

				sql = "update LOGIN set PWD = '" + pwd + "' where NO = '"+no+"'";
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

	public void searchTeacher(String no) {
		// TODO Auto-generated method stub
		
	}

	public TreeSet<TeacherVO> listSortedTeacher() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean deleteTeacher(String no) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from TEACHER where NO = '" + no + "'";
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
