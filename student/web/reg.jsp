<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<html>
<body>
<%
    String username = request.getParameter("username");
    int password = Integer.parseInt(request.getParameter("password"));
    Class.forName("com.mysql.jdbc.Driver");
    Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books?characterEncoding=utf-8", "root", "root");
    Statement statement = conn.createStatement();
    String sql = "INSERT INTO t_user(username, password, last_time) VALUES('" + username + "'," + password + ",now())";
    statement.executeUpdate(sql);

    response.sendRedirect("/student/login.html");
%>
</body>
</html>