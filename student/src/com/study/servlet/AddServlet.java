package com.study.servlet;

import com.study.dao.BookDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		BookDao dao = new BookDao();

		String bookName = request.getParameter("bookName");
		float bookPrice = Float.parseFloat(request.getParameter("bookPrice"));

		try {
			dao.insert(bookName, bookPrice);
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("/student/init");
	}

}
