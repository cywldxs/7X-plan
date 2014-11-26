package serverlet;

import impl.LoginDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoginDAO;

/**
 * Servlet implementation class LoginToMenu
 * ��¼������ת��������
 */
public class LoginToMenu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginToMenu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, 

IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, 

IOException {
		
		String userno = request.getParameter("no");
		String pwd = request.getParameter("pwd");
		
		LoginDAO loginer = new LoginDAOImpl();
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			if(loginer.loginJudge(userno, pwd)==true)
			{
				out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/DBToWeb?&userno="+userno+"\"> </head>");
				out.println("<body onload=\"javascript:window.alert('��¼�ɹ���')\"></body>");
			}
			else
			{
				out.println("<html>");
				out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/ \"> </head>");
				out.println("<body onload=\"javascript:window.alert('�û������������')\"></body>");
				out.println("</html>");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
