<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 17.04.2021
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <link rel="stylesheet" href="/resources/css/style.css" >
</head>
<body>
<form action="/login/process" , method="post"/>


<script scr="script.js"></script>
<div class="form">
    <h1>Вход</h1>
    <div><a href="/reg" class = "create">Нет аккаунта?</a></div>
    <div class="input-form">
        <input  class="email" name="email" type="email" placeholder="Введите email">
    </div>
    <div class="input-form">
        <input class="password" name="password" type="password" placeholder="Введите пароль">
    </div>
    <div class="input-form">
        <input class="submit" type="submit" value="Войти">
    </div>
    <a href="#" class="forget">Забыли пароль?</a>
</div>

</body>
</html>