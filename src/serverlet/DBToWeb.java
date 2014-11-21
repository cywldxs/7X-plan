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
		
		NoteDAO noteDao = new NoteDAOImpl();

		//noteDao.listSortedNote();

		for (Note note : noteDao.listSortedNote())
		{
			out.println("<div><a href=\"http://localhost:8080/X-Plan/MasterToDetails?subject=check&param1="+note.getTieziNo()+"\"> "+note.getTieziTitle()+" BY "+note.getTieziWriter()+" Time: "+note.getTieziTime()+" </a></div>");
		}
		out.println("<form action=\"SaveNote\" method=\"post\"> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>���⣺</div>");
		out.println("<input type=\"input\" name=\"title\" value=\"����������\" size=\"30\" maxlength=\"30\" ></input> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>��Ҫ���ݣ�</div>");
		out.println("<textarea name=\"stumemo\" rows=\"20\" cols=\"200\">��Ҫ����</textarea>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>  ");
		out.println(" <input type=\"submit\" value=\"����\"/>  <!--�������ύ��ť,������������ڵ�form�������ύ��actionλ��-->       ");
		out.println("<input type=\"reset\" value=\"���\"/> ");
		out.println(" </div>");
		out.println("</form> ");

	}

}
