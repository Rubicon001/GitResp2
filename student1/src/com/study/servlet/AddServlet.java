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
		request.setCharacterEncoding("UTF-8");//设置请求编码

		BookDao dao = new BookDao();

		String bookName = request.getParameter("bookName");//从request对象中取出要添加书籍的form表单数据
		float bookPrice = Float.parseFloat(request.getParameter("bookPrice"));//String转换为float类型

		try {
			dao.insert(bookName, bookPrice);//将request里取出来的数据放如sql语句中去执行
		} catch (Exception e) {
			e.printStackTrace();
		}

		response.sendRedirect("/student/init");//插入成功后重定向到所有图书的展示页面
	}

}
