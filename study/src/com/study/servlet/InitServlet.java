package com.study.servlet;

import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.study.dao.BookDao;
import com.study.vo.Book;

@WebServlet("/init")
public class InitServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BookDao bdao = new BookDao();
		HashMap<String, Book> allbook = null;
		try {
			allbook = bdao.getAllBook();
		} catch (Exception e) {
			e.printStackTrace();
		}
		request.getSession().setAttribute("allbook", allbook);
		response.sendRedirect("/showAllBook.jsp");
	}
}
