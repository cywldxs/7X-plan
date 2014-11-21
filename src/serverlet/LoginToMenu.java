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
		
		String no = request.getParameter("username");
		String pwd = request.getParameter("pass");
		
		LoginDAO loginer = new LoginDAOImpl();
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			if(loginer.judgeManager(no, pwd)==true)
			{
			//out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://tieba.baidu.com/f?ie=utf-8&kw=%E9%AB%98%E4%B8%AD&fr=search\"> </head>");
				out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://localhost:8080/X-Plan/DBToWeb\"> </head>");
				out.println("<body onload=\"javascript:window.alert('��¼�ɹ���')\"></body>");
			}
			else
			{
				out.println("<html>");
				out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://localhost:8080/X-Plan/ \"> </head>");
				out.println("<body onload=\"javascript:window.alert('�û������������')\"></body>");
				out.println("</html>");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
