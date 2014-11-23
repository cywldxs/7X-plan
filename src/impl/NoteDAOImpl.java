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
import dao.NoteDAO;


/**
 * 
 * @author CYwlDXS
 * note的 	添加	删除	读取	搜索	输出	存储 实现方法
 */
public class NoteDAOImpl implements NoteDAO{

	public List<Note> ls = new ArrayList();
	
	private Connection conn;
	
	/*
	 * 登录连接数据库
	 */
	public NoteDAOImpl()
	{
		conn = null;
		try {
			conn = jdbc.jdbc();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
	public boolean addNote(Note note) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into NOTE(NOTENO,NOTETITLE,FFLOORCT,NOTEWRITER,NOTEADDR,NOTETIME) values('"
					+ note.getTieziNo() + "','" + note.getTieziTitle() + "','"+note.getTieziFirstContext()+"','"+note.getTieziWriter()+"','"+note.getTieziAddr()+"','"+note.getTieziTime()+"')";
			ResultSet rs = stmt.executeQuery(sql);

			if (!rs.next()) {
				return false;
			} else {
				return true;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void searchNote(String title) {
		// TODO Auto-generated method stub
		
	}

	public TreeSet<Note> listSortedNote() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTE";
			ResultSet rs = stmt.executeQuery(sql);

			ResultSetMetaData md = rs.getMetaData(); // 得到结果集(rs)的结构信息，比如字段数、字段名等
			int columnCount = md.getColumnCount(); // 返回此 ResultSet 对象中的列数

			Note note = new Note();
			while (rs.next()) {
				note = new Note();

				note.setTieziNo((String) rs.getObject(1));// .put(md.getColumnName(i),
															// rs.getObject(i));
				note.setTieziTitle((String) rs.getObject(2));
				note.setTieziFirstContext((String) rs.getObject(3));
				note.setTieziWriter((String) rs.getObject(4));
				note.setTieziAddr((String) rs.getObject(5));
				note.setTieziTime((String) rs.getObject(6));
				
				ls.add(note);
			}

		}

		catch (SQLException e) {
				e.printStackTrace();
		}
		
		return new TreeSet<Note>(this.ls);
	}

	public void deleteNote(String tieziNo) {
		// TODO Auto-generated method stub
		
	}

	public Note loadNote(String no) {		
		Note note = new Note();		
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTE where NOTENO = '"+no+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				note.setTieziNo((String) rs.getObject(1));// .put(md.getColumnName(i),															// rs.getObject(i));
				note.setTieziTitle((String) rs.getObject(2));
				note.setTieziFirstContext((String) rs.getObject(3));
				note.setTieziWriter((String) rs.getObject(4));
				note.setTieziAddr((String) rs.getObject(5));
				note.setTieziTime((String) rs.getObject(6));
			}
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
		return note;
	}



	public String rtMaxNoteNo() {
		String max = null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select max(noteno) from note ";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				max = (String) rs.getObject(1);
				int tempMax = Integer.valueOf(max)+1;
				max = Integer.toString(tempMax);
			}
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
		return max;
	}

	public Note saveNote(String noteno, String notetitle, String ffloorct,
			String notewriter,String addr, String notetime) {
			
			Note note = new Note();
			note.setTieziNo(noteno);
			note.setTieziTitle(notetitle);
			note.setTieziFirstContext(ffloorct);
			note.setTieziWriter(notewriter);
			note.setTieziAddr(addr);
			note.setTieziTime(notetime);
			
		return note;
	}

}
