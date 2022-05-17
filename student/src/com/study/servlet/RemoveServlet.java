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
		Integer id = Integer.parseInt(request.getParameter("bookno"));

		BookDao dao = new BookDao();
		try {
			dao.remove(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("/student/init");
	}
}
