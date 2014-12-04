package impl;

import java.math.BigDecimal;
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
 * @author CYwlDXS note的 添加 删除 读取 搜索 输出 存储 实现方法
 */
public class NoteDAOImpl implements NoteDAO {

	public List<Note> ls = new ArrayList();

	private Connection conn;

	/*
	 * 登录连接数据库
	 */
	public NoteDAOImpl() {
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
			String sql = "insert into NOTE(NOTENO,TYPE,TITLE,FCONTEXT,HOTNUM,WRITER,TIME) values('"
					+ note.getNoteno()
					+ "','"
					+ note.getType()
					+ "','"
					+ note.getTitle()
					+ "','"
					+ note.getFcontext()
					+ "','"
					+ note.getHotnum()
					+ "','"
					+ note.getWriter()
					+ "','"
					+ note.getTime() + "')";
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

			
			while (rs.next()) {
				
				Note note = new Note();
				note.setNoteno((String) rs.getObject(1));// .put(md.getColumnName(i),
				note.setType((String) rs.getObject(6));											// rs.getObject(i));
				note.setTitle((String) rs.getObject(2));
				note.setFcontext((String) rs.getObject(3));
				note.setHotnum((String) rs.getObject(7));
				note.setWriter((String) rs.getObject(4));
				note.setTime((String) rs.getObject(5));

				ls.add(note);
			}

		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return new TreeSet<Note>(this.ls);
	}

	public boolean deleteNote(String noteno) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from NOTE  where NOTENO = '" + noteno + "'";
			if (stmt.executeUpdate(sql) == 1) {
				sql = "delete from NOTEDETAILS where NOTENO = '" + noteno + "'";
				if (stmt.executeUpdate(sql) >= 0) {
					return true;
				} else
					return false;
			} else {
				return false;
			}
		}

		catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

	}

	public Note loadNote(String noteno) {
		Note note = new Note();
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTE where NOTENO = '" + noteno + "'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				note.setNoteno((String) rs.getObject(1));// .put(md.getColumnName(i),
				note.setType((String) rs.getObject(6));											// rs.getObject(i));
				note.setTitle((String) rs.getObject(2));
				note.setFcontext((String) rs.getObject(3));
				note.setHotnum((String) rs.getObject(7));
				note.setWriter((String) rs.getObject(4));
				note.setTime((String) rs.getObject(5));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return note;
	}

	public String rtMaxNoteNo() {
		String max = null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select max(cast(noteno as int)) from note ";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				max = ((BigDecimal) rs.getObject(1)).toString();
				if(!(max==null))
				{	
				int tempMax = Integer.valueOf(max) + 1;
				max = Integer.toString(tempMax);
				}
				else
					max = "1";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return max;
	}

	public Note saveNote(String noteno, String type, String title,
			String fcontext, String hotnum, String writer, String time) {
		
		Note note = new Note();
		note.setNoteno(noteno);
		note.setType(type);										
		note.setTitle(title);
		note.setFcontext(fcontext);
		note.setHotnum(hotnum);
		note.setWriter(writer);
		note.setTime(time);

		return note;
	}

	public String rtMaxHotnum(String noteno) {
		String max = null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select HOTNUM from note where NOTENO = '"+noteno+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				max = (String) rs.getObject(1);
				int tempMax = Integer.valueOf(max);
				max = Integer.toString(tempMax);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return max;
	}

	public boolean HotnumUp(String noteno, String num,String userno) {
		
		try {
			
			int tempMax = Integer.valueOf(num)+1;
			num = Integer.toString(tempMax);
			
			Statement stmt = conn.createStatement();
			
			String sql = "select * from HOTNUMDETAILS where( NOTENO = '"+noteno+"' and NO = '"+userno+"')";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) 
			{
				return false;
			}
			else
			{
				sql = "update NOTE set HOTNUM = '"+num+"' where NoteNO = '"+noteno+"'";
				if (stmt.executeUpdate(sql) == 1)
				{
					sql = "insert into HOTNUMDETAILS(NOTENO,NO) values('"+noteno+"','"+userno+"')";
						if(stmt.executeUpdate(sql)==1)
						{
							return true;
						}
						else
						{
							return false;
						}				
				} 
				else
				{
					return false;
				}
			}
		}

				catch (SQLException e) {
					e.printStackTrace();
					return false;
				}
			
	}

	public boolean updateNoteTime(String noteno, String time) {

		try {
			Statement stmt = conn.createStatement();
			String sql = "update NOTE set TIME = '"+time+"' where NOTENO = '"+noteno+"'";
			if (stmt.executeUpdate(sql) == 1) {
					return true;
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
