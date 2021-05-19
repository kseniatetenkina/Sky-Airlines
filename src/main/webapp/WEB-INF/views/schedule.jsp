<%--
  Created by IntelliJ IDEA.
  User: DNS
  Date: 27.04.2021
  Time: 0:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/style3.css">
</head>

<body>
<form class="navigation">
    <div class="raz">
        <a class="title" href="/main">SKY AIRLINES</a>
        <a class="c1" href="/logout">ВЫЙТИ</a>
    </div>
    <br><b></b></br>
    <h1 align="center" class="title">Выбор рейса</h1>
</form>
<br><b></b></br>
<form class="schedule">
    <table align="center">
        <tr>
            <th><h2>Город вылета</h2></th>
            <th><h2>Город прилета</h2></th>
            <th><h2>Номер рейса</h2></th>
            <th><h2>Время вылета</h2></th>
            <th><h2>Время прилета</h2></th>
        </tr>
    </table>
    <br><b></b></br>
    <c:if test="${not empty flights}">
        <c:forEach items="${flights}" var="flight">
            <table align="center" class="block">

                <div class="form">
                    <tr>
                        <th><h3>${flight.departure_city}</h3></th>
                        <th><h3>${flight.arrival_city}</h3></th>
                        <th><h3>${flight.flight_number}</h3></th>
                        <th><h3>${flight.departure_time}</h3></th>
                        <th><h3>${flight.arrival_time}</h3></th>
                    </tr>
                </div>
                <c:set var="flight_id" scope="session" value="${flight.id}"/>
                <c:set var="departure_city" scope="session" value="${flight.departure_city}"/>
                <c:set var="arrival_city" scope="session" value="${flight.arrival_city}"/>
                <c:set var="flight_number" scope="session" value="${flight.flight_number}"/>
                <c:set var="departure_time" scope="session" value="${flight.departure_time}"/>
                <c:set var="arrival_time" scope="session" value="${flight.arrival_time}"/>
                <th><a class="submit" href="/ticket_buying/${flight.id}">Выбрать рейс</a></th>
            </table>
        </c:forEach>
    </c:if>
    <br></br>
</form>


<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg " height="0.5" width="100%">
</p>
<p align="right" class="text3">© 2021, ООО «SKY AIRLINES»</p>
</body>