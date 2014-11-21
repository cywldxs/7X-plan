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
		
		String no = request.getParameter("param1");
		
		NoteDAO noteDAO = new NoteDAOImpl();
		Note note = noteDAO.loadNote(no);
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		NoteDetailsDAO noteDetailsDAO = new NoteDetailsDAOImpl();
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>"+note.getTieziNo()+" "+note.getTieziTitle()+" BY "+note.getTieziWriter()+" Time: "+note.getTieziTime()+" </div>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>1 "+note.getTieziFirstContext()+" BY "+note.getTieziWriter()+" Time: "+note.getTieziTime()+"</div>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		
		for (NoteDetails noteDetails : noteDetailsDAO.listSortedNtDtils(no))
		{
			out.println("<div>------------------------------------------------------------------------------------------------------</div>");
			out.println("<div>"+noteDetails.getTieziFloor()+" "+noteDetails.getTieziContexts()+" BY "+noteDetails.getTieziWriter()+" Time: "+noteDetails.getTieziTime()+" </div>");
			out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		}
	}

}
