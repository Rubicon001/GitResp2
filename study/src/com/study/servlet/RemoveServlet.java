package com.study.servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.study.vo.Book;

public class RemoveServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gb2312"); 
		String bookno = request.getParameter("bookno");	

		HttpSession session = request.getSession();
		HashMap<String, Book> books = (HashMap<String, Book>)session.getAttribute("books");
		Book book = (Book)books.get(bookno);
		
		float money = (Float)session.getAttribute("money");
		money = money - book.getBooknumber()*book.getBookprice();
		session.setAttribute("money", money);	
		
		books.remove(bookno);		
		response.sendRedirect("/Shixun4/showCart.jsp");
	}
}
