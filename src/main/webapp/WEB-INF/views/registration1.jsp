<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 17.04.2021
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <link rel="stylesheet" href="/resourses/css/style2.css" >
</head>
<body>
<form action="/reg" , method="post", modelAttribute="user"/>

<div class="form">
    <h1 class="title">Регистрация нового аккаунта</h1>
    <div class="input-email">
        <input class="email" name="email" type="email" placeholder="Введите email">
    </div>
    <div class="input-password">
        <input class="password" name="password" type="password" placeholder="Придумайте пароль">
    </div>
    <div class="block">
        <p class="text">Нажимая кнопку "Зарегистрироваться" Вы даете согласие на обработку своих персональных данных.</p>
    </div>
    <div class="input-submit">
        <input type="submit" class="submit" value="Зарегистрироваться">
    </div>
</div>

</body>
</html>