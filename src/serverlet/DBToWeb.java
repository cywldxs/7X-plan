package serverlet;

import impl.NoteDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Note;
import dao.NoteDAO;


/**
 * Servlet implementation class DBToWeb
 * ��ȡ���ݿ��е�note����ҳ��
 */
public class DBToWeb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DBToWeb() {
        super();
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
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		NoteDAO noteDao = new NoteDAOImpl();

		out.println("<div><a href=\"http://172.17.201.21:8080/X-Plan/login.html\">ע��</a></div>");
		
		for (Note note : noteDao.listSortedNote())
		{
			NoteDAO noteDAO = new NoteDAOImpl();
			String hotnum = noteDAO.rtMaxHotnum(note.getNoteno());
			out.println("<div><a href=\"http://172.17.201.21:8080/X-Plan/HotNumUp?noteno="+note.getNoteno()+"&userno="+userno+"&hotnum="+hotnum+"\">��:"+hotnum+"</a><a href=\"http://172.17.201.21:8080/X-Plan/MasterToDetails?noteno="+note.getNoteno()+"&userno="+userno+"\"> "+note.getTitle()+" BY "+note.getWriter()+" Time: "+note.getTime()+" </a></div>");
		}		
		out.println("<form name = \"notecomit\" action=\"SaveNote?subject=check&userno="+userno+"\" method=\"post\"> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>���⣺</div>");
		out.println("<input type=\"input\" name=\"title\" value=\"����������\" size=\"30\" maxlength=\"30\" ></input> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>��Ҫ���ݣ�</div>");
		out.println("<textarea name=\"contexts\" rows=\"20\" cols=\"200\">��Ҫ����</textarea>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>�����ˣ�<a href = \"http://172.17.201.21:8080/X-Plan/LoginTypeCheck?userno="+userno+"\">"+userno+"</a></div>");
		out.println("<div>  ");
		out.println(" <input type=\"submit\" value=\"����\" />  <!--�������ύ��ť,������������ڵ�form�������ύ��actionλ��-->       ");
		out.println("<input type=\"reset\" value=\"���\"/> ");
		out.println(" </div>");
		out.println("</form> ");

	}

}
