package serverlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginToRegister
 * ��¼������ת��ע��
 */
public class LoginToRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginToRegister() {
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
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=http://localhost:8080/X-Plan/Register.html\"> </head>");
		//out.println("<head><!-- ���·�ʽ��ʱת������ҳ�� --><meta http-equiv=\"refresh\" content=\"0;url=https://passport.baidu.com/v2/?reg&tpl=mn&u=http%3A%2F%2Fwww.baidu.com%2F%3Ftn%3DSE_hldp03480_530ir7bs\"> </head>");
	}

}
