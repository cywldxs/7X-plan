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
			e1.printStackTrace();
		}
	}
	
	public boolean addNoteDetail(NoteDetails notedetails) {
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into NOTEDETAILS(NOTENO,FLOOR,CONTEXT,WRITER,TIME) values('"
					+ notedetails.getNoteno() + "','" + notedetails.getFloor() + "','"+notedetails.getContext()+"','"+notedetails.getWriter()+"','"+notedetails.getTime()+"')";
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

	public boolean deleteNoteDetail(String noteno ,String floor) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "delete from NOTEDETAILS  where NOTENO = '"+noteno+"' and FLOOR = '"+floor+"'";
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

	public TreeSet<NoteDetails> listSortedNtDtils(String no) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTEDETAILS where NOTENO = '"+no+"'";
			ResultSet rs = stmt.executeQuery(sql);


			NoteDetails noteDetails = new NoteDetails();
			while (rs.next()) {
				noteDetails = new NoteDetails();

				noteDetails.setNoteno((String) rs.getObject(1));
				noteDetails.setFloor((String) rs.getObject(2));
				noteDetails.setContext((String) rs.getObject(3));
				noteDetails.setWriter((String) rs.getObject(4));
				noteDetails.setTime((String) rs.getObject(5));
				
				ls.add(noteDetails);
			}

		}

		catch (SQLException e) {
				e.printStackTrace();
		}
		
		return new TreeSet<NoteDetails>(this.ls);
	}

	public NoteDetails saveNoteDetails(String noteno, String floor,
			String context, String writer, String time) {
		NoteDetails notedetails = new NoteDetails();
		
		notedetails.setNoteno(noteno);
		notedetails.setFloor(floor);
		notedetails.setContext(context);
		notedetails.setWriter(writer);
		notedetails.setTime(time);
		
		return notedetails;
	}

	public String rtMaxFloor(String noteno) {
		String max = null;
		try {
			Statement stmt = conn.createStatement();
			String sql = "select max(floor) from notedetails where noteno = '"+noteno+"'";
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				max = (String) rs.getObject(1);
				if(max!=null)
				{
				int tempMax = Integer.valueOf(max)+1;
				max = Integer.toString(tempMax);
				}
				else{max = "2";}
			}
		}
		catch (SQLException e) {
				e.printStackTrace();
		}
		return max;
	}

	

}
