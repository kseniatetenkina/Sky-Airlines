<%--
  Created by IntelliJ IDEA.
  User: DNS
  Date: 09.05.2021
  Time: 13:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/style7.css" >
</head>

<body>

<form class = "navigation">
    <div class = "raz">
        <a class = "title">SKY AIRLINES</a>
        <a class="c" href="#">ЛИЧНЫЙ КАБИНЕТ</a>
        <a class="c" href="#">КУПИТЬ БИЛЕТ</a>
        <a class="c" href="авторизация.html">ВХОД/РЕГИСТРАЦИЯ</a>
        <a class="c1" href="#">ВЫЙТИ</a>
    </div>
    <br><b></b></br>
    <h1 align = "center" class = "title">Мои билеты</h1>
</form>
<br><b></b></br>
<form class="schedule">

    <c:if test="${not empty message}">
        <p id="panel"> <c:out value="${message}"/></p>
    </c:if>

    <c:if test="${not empty tickets}">
    <c:forEach items="${tickets}" var="ticket">
    <table align="center" class="block">
        <tr>
            <th><h2>Город вылета</h2></th>
            <th><h3>${ticket.departure_city}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Аэропорт</h2></th>
            <th><h3>${ticket.departure_airport}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Город прилета</h2></th>
            <th><h3>${ticket.arrival_city}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Аэропорт</h2></th>
            <th><h3>${ticket.arrival_airport}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Дата вылета</h2></th>
            <c:set var="departure_date" scope="session" value="${ticket.departure_date}"/>
            <th><h3>${fn:substring(departure_date,0,10)}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Номер рейса</h2></th>
            <th><h3>${ticket.flight_number}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Время вылета</h2></th>
            <th><h3>${ticket.departure_time}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Время прилета</h2></th>
            <th><h3>${ticket.arrival_time}</h3></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h2>Владелец</h2></th>
            <th><h3>${ticket.user_id}</h3></th>
        </tr>
    </table>
    </c:forEach>
    </c:if>

</form>


<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg "height="0.5" width="100%"></p>

<h3 class = "text2">Подпишитесь на рассылку, чтобы не пропустить новую информацию о полетах и скидках</h3>
<form>
    <input class ="email" placeholder="Введите Ваш email" type="email" name="email">
    <input class = "submit" type="submit" name="search" value="Подписаться">
</form>
<br><b></b></br>
<table align="center">
    <tr>
        <th><a class="c">О КОМПАНИИ</a></th>
        <th><a class="c">ДОПОЛНИТЕЛЬНЫЕ УСЛУГИ</a></th>
        <th><a class="c">МЫ В СОЦСЕТЯХ</a></th>
        <th><a class="c">ГОРЯЧАЯ ЛИНИЯ</a></th>
    </tr>
    <tr>
        <th>Новости</th>
        <th>Бронирование отелей</th>
        <th>Instagram</th>
        <th>+7(999)123-45-67</th>
    </tr>
    <tr>
        <th>Партнеры</th>
        <th>Аренда авто</th>
        <th>VK</th>
        <th></th>
    </tr>
    <tr>
        <th>Политика конфиденциальности</th>
        <th>Приоритетная посадка</th>
        <th>Twitter</th>
        <th></th>
    </tr>
</table>
<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg "height="0.5" width="100%"></p>
<p align = "right" class = "text3">© 2021, ООО «SKY AIRLINES»</p>
</body>
