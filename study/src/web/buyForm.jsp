<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="com.study.vo.Book"%>
<html>  
  <body> 
    <%
		String bookno = request.getParameter("bookno");
    	HashMap<String, Book> allbook = (HashMap<String, Book>)session.getAttribute("allbook");
    	Book book = (Book)allbook.get(bookno);
    %>
    欢迎购买：<%=book.getBookname()%> 
    <form action="/study/com/servlet/AddServlet" method="post">
		书本价格:<%=book.getBookprice()%><BR>
		<input name="bookno" type="hidden" value="<%=book.getBookno()%>">
		<input name="bookname" type="hidden" value="<%=book.getBookname()%>">
		<input name="bookprice" type="hidden" value="<%=book.getBookprice()%>">
		数量:
		<input name="booknumber" type="text">
		<input type="submit" value="购买">
    </form>    
  </body>
</html>
