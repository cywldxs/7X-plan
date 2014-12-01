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
 * 读取数据库中的note到网页中
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

		out.println("<div><a href=\"http://172.17.201.21:8080/X-Plan/login.html\">注销</a></div>");
		
		for (Note note : noteDao.listSortedNote())
		{
			NoteDAO noteDAO = new NoteDAOImpl();
			String hotnum = noteDAO.rtMaxHotnum(note.getNoteno());
			out.println("<div><a href=\"http://172.17.201.21:8080/X-Plan/HotNumUp?noteno="+note.getNoteno()+"&userno="+userno+"&hotnum="+hotnum+"\">赞:"+hotnum+"</a><a href=\"http://172.17.201.21:8080/X-Plan/MasterToDetails?noteno="+note.getNoteno()+"&userno="+userno+"\"> "+note.getTitle()+" BY "+note.getWriter()+" Time: "+note.getTime()+" </a></div>");
		}		
		out.println("<form name = \"notecomit\" action=\"SaveNote?subject=check&userno="+userno+"\" method=\"post\"> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>主题：</div>");
		out.println("<input type=\"input\" name=\"title\" value=\"请输入主题\" size=\"30\" maxlength=\"30\" ></input> ");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>主要内容：</div>");
		out.println("<textarea name=\"contexts\" rows=\"20\" cols=\"200\">主要内容</textarea>");
		out.println("<div>------------------------------------------------------------------------------------------------------</div>");
		out.println("<div>发帖人：<a href = \"http://172.17.201.21:8080/X-Plan/LoginTypeCheck?userno="+userno+"\">"+userno+"</a></div>");
		out.println("<div>  ");
		out.println(" <input type=\"submit\" value=\"发帖\" />  <!--表单数据提交按钮,点击将把其所在的form的数据提交到action位置-->       ");
		out.println("<input type=\"reset\" value=\"清空\"/> ");
		out.println(" </div>");
		out.println("</form> ");

	}

}
