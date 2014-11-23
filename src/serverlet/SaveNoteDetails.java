package serverlet;

import impl.NoteDetailsDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NoteDetails;
import dao.NoteDetailsDAO;

/**
 * Servlet implementation class SaveNoteDetails
 */
public class SaveNoteDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveNoteDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		request.setCharacterEncoding("utf-8");
		String context = request.getParameter("contexts");
		String writer = request.getParameter("writer");
		String noteno = request.getParameter("noteno");
		
		NoteDetailsDAO noteDetailsDAO = new NoteDetailsDAOImpl();
		String floor = noteDetailsDAO.rtMaxFloor(noteno);
		
		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		DateFormat t = DateFormat.getDateTimeInstance();
		String notetime = t.format(now);
		
		NoteDetails notedetails = noteDetailsDAO.saveNoteDetails(noteno, floor, context, writer, notetime);
		
		if(noteDetailsDAO.addNoteDetail(notedetails))
		{
			out.println("<head><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/MasterToDetails?noteno="+notedetails.getTieziNo()+"&userno="+writer+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('发帖成功！')\"></body>");
		}
		else
		{
			out.println("<head><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/MasterToDetails?noteno="+notedetails.getTieziNo()+"&userno="+writer+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('发帖失败！')\"></body>");
		}
		
		
	}

}
