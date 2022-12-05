<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>insert</title>
    <style>
        div {
            background-color: #d4cec0;
            width: 300px;
            height: 150px;
            display: table-cell;
            vertical-align: middle;
            text-align: center;
            border-radius: 20px;
            position: absolute;
            left: 50%;
            top: 50%;
            transform: translate(-50%,-50%);
        }
        .center {
            border: 3px solid green;
        }
    </style>
</head>
<body style="background-image: url(/img/2.jpg);background-size:100% 100% ; background-attachment: fixed">

<form action="/book/add" method="post">
    <div class="center">
        <p></p>
        <p></p>
        <p></p>
    书本名称：<input type="text" name="bookName"><br>
        <p></p>
        <p></p>
    书本价格：<input type="text" name="bookPrice"><br>
        <p></p>
        <p></p>
    <input type="submit" value="添加" style='font-size:15px'>
    </div>
</form>
</body>
</html>
