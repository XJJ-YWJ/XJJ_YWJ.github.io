package HXG.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.apache.ibatis.javassist.bytecode.stackmap.BasicBlock.Catch;
import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import HXG.DAO.DAO;
import HXG.DAOImp.DAOImp;
import HXG.enity.User;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			UIManager.put("RootPane.setupButtonVisible",false);
		} catch (Exception e) {
		}
		//设置编码方式
		request.setCharacterEncoding("UTF-8");
		//设置相应编码
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		User user = new User(username,password);
		DAO dao = new DAOImp();
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(user.toString());
//		System.out.println(dao.selectOne(user));
		//登录成功！
		if(dao.selectOne(user)) {
			request.setAttribute("user", user);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			JOptionPane.showMessageDialog(null, "登录成功！");
			
		}else {  //登录失败！
			request.getRequestDispatcher("login.jsp").forward(request, response);
			JOptionPane.showMessageDialog(null, "用户名或密码输入错误！");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
