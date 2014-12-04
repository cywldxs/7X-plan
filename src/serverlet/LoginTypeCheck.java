package serverlet;

import impl.LoginDAOImpl;
import impl.NormalUserDAOImpl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vo.NormalUserVO;
import dao.LoginDAO;
import dao.NormalUserDAO;

/**
 * Servlet implementation class LoginTypeCheck
 */
public class LoginTypeCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginTypeCheck() {
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
		
		String userno = request.getParameter("userno");
		LoginDAO loginDAO = new LoginDAOImpl();
		String type = loginDAO.rtLoginType(userno);
		if(type.equals(null))
		{
			out.println("<head><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/DBToWeb?&userno="+userno+"\"> </head>");
			out.println("<body onload=\"javascript:window.alert('进入修改界面失败！')\"></body>");
		}
		else if(type.equals("normal")||type.equals("NORMAL"))
		{
			out.println("<head><meta http-equiv=\"refresh\" content=\"0;url=http://172.17.201.21:8080/X-Plan/s_ziliao.html?&userno="+userno+"\"> </head>");
			/*
			NormalUserDAO normaluserdao = new NormalUserDAOImpl();
			NormalUserVO normaluservo =new NormalUserVO();
			normaluservo = normaluserdao.rtNUserInfo(userno);
			
			out.println("<form name = \"alterForm\" action = \"AlterNUserInfo\" method = \"post\">");
			out.println("<table><tr>");
			
			out.println("<tr><td><label for \"id\">学籍号</label></td>");
			out.println("<td><input type = \"text\"id = \"id\" name = \"id\" value = \" "+normaluservo.getId()+" \"/></td></tr>");
			
			out.println("<tr><td><label for \"no\">帐号</label></td>");
			out.println("<td><input type = \"text\"id = \"no\" name = \"no\" value = \" "+normaluservo.getNo()+" \"/></td></tr>");
			
			out.println("<tr><td><label for \"pwd\">密码</label></td>");
			out.println("<td><input type = \"text\"id = \"pwd\" name = \"pwd\" value = \" "+normaluservo.getPwd()+" \"/></td></tr>");
			
			out.println("<td><label for \"name\">姓名</label></td>");
			out.println("<td><input type = \"text\"id = \"name\" name = \"name\" value = \" "+normaluservo.getName()+" \"/></td></tr>");
			
			out.println("<td><label for \"email\">email</label></td>");
			out.println("<td><input type = \"text\"id = \"email\" name = \"email\" value = \" "+normaluservo.getMail()+" \"/></td></tr>");
			
			out.println("<td><label for \"sex\">性别</label></td>");
			out.println("<td><input type = \"text\"id = \"sex\" name = \"sex\" value = \" "+normaluservo.getSex()+" \"/></td></tr>");
			
			out.println("<td><label for \"birthday\">生日</label></td>");
			out.println("<td><input type = \"text\"id = \"birthday\" name = \"birthday\" value = \" "+normaluservo.getBirthday()+" \"/></td></tr>");
			
			out.println("<tr><td><label for \"image\">头像</label></td>");
			out.println("<td><input type = \"text\"id = \"image\" name = \"image\" value = \" "+normaluservo.getImage()+" \"/></td></tr>");
			
			out.println("<tr><td><label for \"tele\">联系方式</label></td>");
			out.println("<td><input type = \"text\"id = \"tele\" name = \"tele\" value = \" "+normaluservo.getTele()+" \"/></td></tr>");
			
			
			out.println("<tr><td> <input type=\"submit\" value = \"修改\" /></td></tr>");
			
			out.println("</table></form>");*/
			
		}
		else if(type.equals("manager")||type.equals("MANAGER"))
		{
			
		}
		else if(type.equals("teacher")||type.equals("TEACHER"))
		{
			
		}
	}

}
