<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html>
<body>
<%
    int bookNo = Integer.parseInt(request.getParameter("bookNo"));
%>

<form action="/student/update" method="post">
    书本名称：<input type="text" name="bookName"><br>
    书本价格：<input type="text" name="bookPrice"><br>
    <input type="hidden" name="bookNo" value="<%=bookNo%>">
    <input type="submit" value="保存">
</form>
</body>
</html>
