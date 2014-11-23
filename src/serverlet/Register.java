package serverlet;

import impl.LoginDAOImpl;
import impl.NormalUserDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoginDAO;
import dao.NormalUserDAO;
import vo.LoginVO;
import vo.NormalUserVO;

/**
 * Servlet implementation class Register
 * ע��
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
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
		
		String no = request.getParameter("username");
		String pwd = request.getParameter("pass");
		
		LoginDAO logindao = new LoginDAOImpl();
		LoginVO loginvo = logindao.saveLoginVO(no, pwd, "normal");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		
		if(logindao.searchLogin(loginvo))
		{
			//�ʺ��ѱ�ʹ��
			
			out.println("<html>");
			out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/Register.html\"> </head>");
			out.println("<body onload=\"javascript:window.alert('�ʺ��ѱ�ʹ��')\"></body>");
			out.println("</html>");
		}
		else
		{
			
			NormalUserDAO normaluserdao = new NormalUserDAOImpl();
			NormalUserVO normaluservo = normaluserdao.saveNormalUserVO(no, pwd);
			
			
			
			if(logindao.addLogin(loginvo)&&normaluserdao.addNormalUser(normaluservo))
			{
				//ע��ɹ� ��ת��¼

				out.println("<html>");
				out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://localhost:8080/X-Plan/ \"> </head>");
				out.println("<body onload=\"javascript:window.alert('ע��ɹ���')\"></body>");
				out.println("</html>");
			}
			else
			{
				
			}
			
		}
	}

}
