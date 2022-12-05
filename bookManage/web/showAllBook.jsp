<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.study.vo.Book"%>
<%@ page import="com.count.SessionCounter" %>
<html>
<head>
	<meta charset="UTF-8">
	<title>showall</title>
	<style>

	</style>
</head>
  <body style ="background-image: url(/img/2.jpg);background-size:100% 100% ; background-attachment: fixed">
  	<h1 style="color: dimgray" align="center">图书后台管理系统</h1>
    <%    	
    	HashMap<String, Book> allbook = (HashMap<String, Book>)request.getAttribute("allbook");
    %>

	<div class="sousuo">
		<form action="error.html" methed="get">
			<input type="text" id="input" autocomplete="off" name="productName"  title="请输入商品名">
			<input type="submit" id="sousuo_kuan" value="搜索">
		</form>
	</div>
	<div class="bigbox">
		<c:forEach var="item" items="${list}" varStatus="aa">
		<div class="minbox">
			<span class="imgLink">
                <a href="${ctx }/ProductDetailsServlet?id=${item.id }" ><img src="${item.imgUrl}" /></a>
                </span>
		</div>
	</div>
	</c:forEach>
	</div>

	<div align="center"><a href="insert.jsp"> 添加图书 </a>
		<a href="login.html">退出登录</a>
	</div>

    <table border="1" align="center">
	<tr bgcolor="#a9a9a9">
	<td>书本名称</td>
	<td>书本价格</td>
	<td>系统操纵</td>
	</tr>
	<%
		Set<String> set = allbook.keySet();
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()){
			String bookno = ite.next();
			Book book = allbook.get(bookno);
	%>
		<tr bgcolor="#d2b48c">
		<td><%=book.getBookname()%></td>
		<td><%=book.getBookprice()%></td>
		<td><a href="/book/remove?bookno=<%=bookno%>">删除</a>
			<a href="/book/update.jsp?bookNo=<%=bookno%>">编辑</a></td>
		</tr>	
	<%} %>

		<p align="right"> 上次登录时间：<%=session.getAttribute("last_time")%></p>
		<p align="right"> 当前系统在线人数为:1</p>
	</table>

  </body>
</html>
