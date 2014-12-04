package serverlet;

import impl.NoteDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Note;
import dao.NoteDAO;

/**
 * Servlet implementation class SaveNote
 */
public class SaveNote extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SaveNote() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();

		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String fcontext = request.getParameter("contexts");
		String writer = request.getParameter("userno");

		Date now = new Date();
		SimpleDateFormat t =   new SimpleDateFormat( "yyyy-MM-dd HH:mm:ss" );
		String time = t.format(now);

		NoteDAO noteDAO = new NoteDAOImpl();
		String noteno = noteDAO.rtMaxNoteNo();
		/*
		out.println("<div>" + title + "</div>");
		out.println("<div>" + context + "</div>");
		out.println("<div>" + writer + "</div>");
		out.println("<div>" + noteno + "</div>");
		out.println("<div>" + notetime + "</div>");*/

		Note note = noteDAO.saveNote(noteno, "type", title, fcontext, "0", writer, time);

		if (noteDAO.addNote(note)) {
			out.println("<head><!-- 以下方式定时转到其他页面 --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/qunzu.jsp?subject=check&userno="
					+writer+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('发帖成功！')\"></body>");
		} else {
			out.println("<head><!-- 以下方式定时转到其他页面 --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/qunzu.jsp?subject=check&userno="
					+writer+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('发帖失败！')\"></body>");
		}
	}

}
