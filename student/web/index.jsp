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
    System.out.println(username + "__" + password);

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/books?characterEncoding=utf-8", "root", "root");
        Statement stat = conn.createStatement();
        String sql = "SELECT * FROM t_user WHERE username = '" + username + "'";
        ResultSet rs = stat.executeQuery(sql);
        rs.next();
        session.setAttribute("last_time", rs.getTimestamp("last_time"));
        System.out.println(session.getAttribute("last_time"));
        if (username.equals(rs.getString("username")) && password == rs.getInt("password")) {
            stat.executeUpdate("UPDATE t_user SET last_time=now() WHERE username='" + username + "'");
            request.getRequestDispatcher("/init").forward(request, response);
        }else {
            response.sendRedirect("/student/error.html");
        }
    } catch (Exception throwables) {
        throwables.printStackTrace();
    }
%>
</body>
</html>
