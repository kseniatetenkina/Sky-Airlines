<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 30.04.2021
  Time: 21:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form</title>
    <link rel="stylesheet" href="/resourses/css/style6.css" >
</head>
<body>

<div class="form">
    <h1 class="title">Регистрация нового рейса</h1>
    <div class="input-town">
        <input class="town" type="text" placeholder="Введите город отправления" required>
    </div>
    <div class="input-town">
        <input class="town" type="text" placeholder="Введите город прибытия" required>
    </div>
    <div class="input-town">
        <input class="town" type="text" placeholder="Введите номер рейса" required>
    </div>
    <div class="input-town">
        <label style="color: aliceblue;">Введите дату вылета</label>
        <input class="town" type="date" placeholder="Введите дату вылета" required>
    </div>
    <div class="input-town">
        <label style="color: aliceblue;">Введите время вылета</label>
        <input class="town" type="time" placeholder="Введите время вылета" required>
    </div>
    <div class="input-town">
        <label style="color: aliceblue;">Введите время прилета</label>
        <input class="town" type="time" placeholder="Введите время прилета" required>
    </div>

    <input type="submit" class="submit" value="Зарегистрировать рейс">

</div>

</body>
</html>
