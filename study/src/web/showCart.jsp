<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@page import="com.study.vo.Book"%>
<html>  
  <body>
  <table border="1">
	<tr bgcolor="pink">
	<td>书本名称</td>
	<td>书本价格</td>
	<td>数量</td>
	<td>删除</td>
	</tr>
   <%
   		HashMap<String, Book> books = (HashMap<String, Book>)session.getAttribute("books");		
		Set<String> set = books.keySet();
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String bookno = ite.next();
			Book book = (Book)books.get(bookno);
	%>
	<tr bgcolor="yellow">
		<td><%=book.getBookname()%></td>
		<td><%=book.getBookprice()%></td>
		<td><%=book.getBooknumber()%></td>
		<td><a href="/Shixun4/servlet/RemoveServlet?bookno=<%=book.getBookno()%>">删除</a></td>
		</tr>
	<%
		}			
   %>
   </table>
   现金总额:<%=session.getAttribute("money")%><HR>
   <a href="showAllBook.jsp">继续买书</a>
  </body>
</html>
