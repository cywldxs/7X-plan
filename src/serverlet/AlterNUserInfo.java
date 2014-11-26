package serverlet;

import impl.NormalUserDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.NormalUserDAO;

/**
 * Servlet implementation class AlterNUserInfo
 */
public class AlterNUserInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterNUserInfo() {
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
		
		String no = request.getParameter("no");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String mail = request.getParameter("email");
		String sex = request.getParameter("sex");
		String birthday = request.getParameter("birthday");
		String id = request.getParameter("id");
		String image = request.getParameter("image");
		String tele = request.getParameter("tele");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		NormalUserDAO nUserDAO = new NormalUserDAOImpl();
		if(nUserDAO.alterNormalUser(id, no, name, sex, birthday, pwd, mail, image, tele))
		{
			out.println("<meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/DBToWeb?&userno="+no+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('修改成功！')\"></body>");
		}
		else
		{
			out.println("<meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/DBToWeb?&userno="+no+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('修改失败！')\"></body>");
		}
		
		
	}

}
