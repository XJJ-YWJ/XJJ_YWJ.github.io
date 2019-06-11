package HXG.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import HXG.DAO.DAO;
import HXG.DAOImp.DAOImp;
import HXG.enity.User;


//注册页面的servlet
@WebServlet("/reg")
public class reg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		User user = new User(username,password,phone);
		DAO dao = new DAOImp();
		if(dao.addUser(user)>0) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			PrintWriter out = response.getWriter();
			out.print("<script>alert('注册失败！用户名或密码已经存在');window.location.href='reg.jsp'</script>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
