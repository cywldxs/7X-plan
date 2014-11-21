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
 * note��ʵ�ַ���
 */
public class NoteDAOImpl implements NoteDAO{

	public List<Note> ls = new ArrayList();
	
	private Connection conn;
	
	/*
	 * ��¼�������ݿ�
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
	
	public void addNote(Note note) {
		// TODO Auto-generated method stub
		
	}

	public void searchNote(String title) {
		// TODO Auto-generated method stub
		
	}

	public TreeSet<Note> listSortedNote() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTE";
			ResultSet rs = stmt.executeQuery(sql);

			ResultSetMetaData md = rs.getMetaData(); // �õ������(rs)�Ľṹ��Ϣ�������ֶ������ֶ�����
			int columnCount = md.getColumnCount(); // ���ش� ResultSet �����е�����

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

			//ResultSetMetaData md = rs.getMetaData(); // �õ������(rs)�Ľṹ��Ϣ�������ֶ������ֶ�����
			//int columnCount = md.getColumnCount(); // ���ش� ResultSet �����е�����	
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

}
