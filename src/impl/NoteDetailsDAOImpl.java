package impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import jdbc.jdbc;
import model.Note;
import model.NoteDetails;
import dao.NoteDetailsDAO;

public class NoteDetailsDAOImpl implements NoteDetailsDAO{

	public List<NoteDetails> ls = new ArrayList();
	
	private Connection conn;
	
	/*
	 * 登录连接数据库
	 */
	public NoteDetailsDAOImpl()
	{
		conn = null;
		try {
			conn = jdbc.jdbc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public void addNoteDetail(NoteDetails notedetails) {
		// TODO Auto-generated method stub
		
	}

	public void deleteNoteDetail(int floor) {
		// TODO Auto-generated method stub
		
	}

	public TreeSet<NoteDetails> listSortedNtDtils(String no) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTEDETAILS where NOTENO = '"+no+"'";
			ResultSet rs = stmt.executeQuery(sql);

			ResultSetMetaData md = rs.getMetaData(); // 得到结果集(rs)的结构信息，比如字段数、字段名等
			int columnCount = md.getColumnCount(); // 返回此 ResultSet 对象中的列数

			NoteDetails noteDetails = new NoteDetails();
			while (rs.next()) {
				noteDetails = new NoteDetails();

				noteDetails.setTieziNo((String) rs.getObject(1));// .put(md.getColumnName(i),
															// rs.getObject(i));
				noteDetails.setTieziFloor((String) rs.getObject(2));
				noteDetails.setTieziContexts((String) rs.getObject(3));
				noteDetails.setTieziWriter((String) rs.getObject(4));
				noteDetails.setTieziTime((String) rs.getObject(5));
				
				ls.add(noteDetails);
			}

		}

		catch (SQLException e) {
				e.printStackTrace();
		}
		
		return new TreeSet<NoteDetails>(this.ls);
	}

	

}
