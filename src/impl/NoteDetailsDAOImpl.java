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
	 * ��¼�������ݿ�
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
	
	public boolean addNoteDetail(NoteDetails notedetails) {
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into NOTEDETAILS(NOTENO,FLOOR,NOTECONTEXT,NOTEWRITER,NOTETIME) values('"
					+ notedetails.getTieziNo() + "','" + notedetails.getTieziFloor() + "','"+notedetails.getTieziContexts()+"','"+notedetails.getTieziWriter()+"','"+notedetails.getTieziTime()+"')";
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

	public void deleteNoteDetail(int floor) {
		// TODO Auto-generated method stub
		
	}

	public TreeSet<NoteDetails> listSortedNtDtils(String no) {
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from NOTEDETAILS where NOTENO = '"+no+"'";
			ResultSet rs = stmt.executeQuery(sql);


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

	public NoteDetails saveNoteDetails(String noteno, String floor,
			String notecontext, String notewriter, String notetime) {
		NoteDetails notedetails = new NoteDetails();
		
		notedetails.setTieziNo(noteno);
		notedetails.setTieziFloor(floor);
		notedetails.setTieziContexts(notecontext);
		notedetails.setTieziWriter(notewriter);
		notedetails.setTieziTime(notetime);
		
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
