package serverlet;

import impl.NoteDAOImpl;
import impl.NoteDetailsDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Note;
import model.NoteDetails;
import dao.NoteDAO;
import dao.NoteDetailsDAO;

/**
 * Servlet implementation class MasterToDetails
 * 主贴跳转到帖子内容
 */
public class MasterToDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MasterToDetails() {
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
		
		String noteno = request.getParameter("noteno");
		String userno = request.getParameter("userno");
		
		NoteDAO noteDAO = new NoteDAOImpl();
		Note note = noteDAO.loadNote(noteno);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		NoteDetailsDAO noteDetailsDAO = new NoteDetailsDAOImpl();
		out.println("<div><a href = \"http://172.17.201.21:8080/X-Plan/DBToWeb?&userno="+userno+"\">返回论坛</a></div>");
		
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>"+note.getNoteno()+" "+note.getTitle()+" BY "+note.getWriter()+" Time: "+note.getTime()+" </div>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>1 "+note.getFcontext()+" BY "+note.getWriter()+" Time: "+note.getTime()+"</div>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		
		for (NoteDetails noteDetails : noteDetailsDAO.listSortedNtDtils(noteno))
		{
			out.println("<div>------------------------------------------------------------------------------------------------------</div>");
			out.println("<div>"+noteDetails.getFloor()+" "+noteDetails.getContext()+" BY "+noteDetails.getWriter()+" Time: "+noteDetails.getTime()+" </div>");
			out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		}
		
		out.println("<form name = \"notedetailscomit\" action=\"SaveNoteDetails?noteno="+noteno+"&writer="+userno+"\" method=\"post\"> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>内容：</div>");
		out.println("<textarea name=\"contexts\" rows=\"5\" cols=\"20\">请输入</textarea>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>发帖人:"+userno+"</div>");
		out.println("<div>  ");
		out.println(" <input type=\"submit\" value=\"发帖\" />");
		out.println("<input type=\"reset\" value=\"清空\"/> ");
		out.println(" </div>");
		out.println("</form> ");
	}

}
