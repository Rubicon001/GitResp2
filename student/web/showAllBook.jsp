<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.study.vo.Book"%>
<html>
  <body>
  	上次登录时间：<%=session.getAttribute("last_time")%>
  	<div style="color: red" align="center">图书后台管理系统</div>
    <%    	
    	HashMap<String, Book> allbook = (HashMap<String, Book>)request.getAttribute("allbook");
    %>
	<div align="center"><a href="insert.jsp">添加</a></div>
    <table border="1" align="center">
	<tr bgcolor="pink">
	<td>书本名称</td>
	<td>书本价格</td>
	<td>操纵</td>
	</tr>
	<%
		Set<String> set = allbook.keySet();
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String bookno = ite.next();
			Book book = allbook.get(bookno);
	%>
		<tr bgcolor="yellow">
		<td><%=book.getBookname()%></td>
		<td><%=book.getBookprice()%></td>
		<td><a href="/student/remove?bookno=<%=bookno%>">删除</a>
			<a href="/student/update.jsp?bookNo=<%=bookno%>">编辑</a></td>
		</tr>	
	<%} %>	
	</table>

  </body>
</html>
