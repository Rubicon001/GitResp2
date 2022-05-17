package com.study.servlet;


import com.study.dao.BookDao;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/remove")
public class RemoveServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Integer id = Integer.parseInt(request.getParameter("bookno"));//取出请求参数中的书籍编号

		BookDao dao = new BookDao();
		try {
			dao.remove(id);//将书籍编号作为remove方法的参数
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("/student/init");//删除之后重定向到图书展示页面
	}
}
