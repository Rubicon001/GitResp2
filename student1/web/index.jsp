<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: syx
  Date: 2022/5/8
  Time: 18:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
<%
    String username = request.getParameter("username");
    int password = Integer.parseInt(request.getParameter("password"));

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books", "root", "root");
        Statement stat = conn.createStatement();
        String sql = "SELECT * FROM t_user WHERE username = '" + username + "'";
        ResultSet rs = stat.executeQuery(sql);
        rs.next();
        session.setAttribute("last_time", rs.getTimestamp("last_time"));
        //当用户登录时，更改用户表里的上次登录时间
        if (username.equals(rs.getString("username")) && password == rs.getInt("password")) {
            stat.executeUpdate("UPDATE t_user SET last_time=now() WHERE username='" + username + "'");
            request.getRequestDispatcher("/init").forward(request, response);
        }else {
            response.sendRedirect("/student/error.html");
        }
    } catch (Exception throwable) {
        throwable.printStackTrace();
    }
%>
</body>
</html>
