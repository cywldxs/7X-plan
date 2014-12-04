package serverlet;

import impl.NoteDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NoteDAO;

/**
 * Servlet implementation class HotNumUp
 */
public class HotNumUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HotNumUp() {
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
		
		String userno = request.getParameter("userno");
		String noteno = request.getParameter("noteno");
		String hotnum = request.getParameter("hotnum");
		
		NoteDAO noteDAO = new NoteDAOImpl();
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		if(noteDAO.HotnumUp(noteno,hotnum,userno))
		{	
			out.println("<head><!-- 以下方式定时转到其他页面 --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/qunzu.jsp?&userno="+userno+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('点赞成功！')\"></body>");
		}
		else
		{
			out.println("<head><!-- 以下方式定时转到其他页面 --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/qunzu.jsp?&userno="+userno+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('不能重复点赞！')\"></body>");
		}
		
	}

}
