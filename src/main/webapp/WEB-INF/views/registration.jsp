<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 17.04.2021
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h3>Welcome, Enter The User Details</h3>
<form  method="post"
       action="/addUser" modelAttribute="user"/>
<table>
    <div>
        Login: <input name="login" type="login">
    </div>
    <div>
        Password: <input name="password" type="password">
    </div>
    <div>
        Email: <input name="email" type="email">
    </div>
    <div>
        Role: <input name="role" type="role">
    </div>
    <div class="input-form">
        <input type="submit" value="AddUser">
    </div>
</table>
</body>
</html>