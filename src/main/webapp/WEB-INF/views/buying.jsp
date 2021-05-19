<%--
  Created by IntelliJ IDEA.
  User: DNS
  Date: 09.05.2021
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/buying_style.css">
</head>

<body>
<form  method="get"
       action="/tickets" modelAttribute="flight_number"/>
<form class="navigation">
    <div class="raz">
        <a class="title" href="/main">SKY AIRLINES</a>
        <a class="c1" href="/logout">ВЫЙТИ</a>
    </div>
    <br><b></b></br>
    <h1 align="center" class="title">Покупка билета</h1>
</form>
<br><b></b></br>
<form  method="get"
       action="/tickets" modelAttribute="flight_number"/>
<div class="form">
    <h2 align="left">Информация о рейсе</h2>
    <table align="center" class="schedule1">
        <tr>
            <th><h2>Город вылета</h2></th>
            <th><h2>Аэропорт</h2></th>
            <th><h2>Город прилета</h2></th>
            <th><h2>Аэропорт</h2></th>
            <th><h2>Номер рейса</h2></th>
            <th><h2>Дата рейса</h2></th>
            <th><h2>Время вылета</h2></th>
            <th><h2>Время прилета</h2></th>
            <th><h2>Цена</h2></th>
        </tr>
    </table>
    <table align="center" class="block">
        <tr>
            <th><h3>${flight.departure_city}</h3></th>
            <th><h3>${flight.departure_airport}</h3></th>
            <th><h3>${flight.arrival_city}</h3></th>
            <th><h3>${flight.arrival_airport}</h3></th>
            <th><h3>${flight.flight_number}</h3></th>
            <th><h3>${flight.departure_date}</h3></th>
            <th><h3>${flight.departure_time}</h3></th>
            <th><h3>${flight.arrival_time}</h3></th>
            <th><h3>${flight.flight_price}</h3></th>
        </tr>
    </table>

    <h2 align="left">Введите данные пассажира</h2>

    <input id="from" class="from" placeholder="Фамилия" type="text" name="from" required>
    <input id="to" class="to" placeholder="Имя" type="text" name="to" required="required">
    <input id="to" class="to" placeholder="Отчество" type="text" name="to" required="required">
    <input class="date1" placeholder="Дата рождения" type="date" name="first date" required="required">
    <input id="round" type="radio" name="radio" value="1" checked>
    <label for="round">Мужчина</label>
    <input id="thereto" type="radio" name="radio" value="2">
    <label for="thereto">Женщина</label>
    <br><b></b></br>
    <input id="from" class="from" placeholder="Гражданство" type="text" name="from" required="required">
    <input id="to" class="to" placeholder="Тип документа" type="text" name="to" required="required">
    <input id="to" class="to" placeholder="№ документа" type="text" name="to" required="required">
    <br><b></b></br>
    <h2 align="left">Контактная информация</h2>
    <input class="email" placeholder="Электронная почта" type="email" name="email">
    <input class="email" placeholder="Телефон" type="tel" name="number">
    <br><b></b></br>
    <p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg " height="0.5"
            width="100%"></p>
    <h2 align="center">Оплата</h2>
    <table align="center" class="card">
        <tr>
            <th><label for="number">Номер карты</label>
                <input id="number" class="number1" placeholder="Введите номер карты" type="number" required>
            </th>
            <th><label for="number">Срок действия</label>
                <input id="date3" class="date3" placeholder="ММ/ГГ" type="text" required>
            </th>
        </tr>
        <tr>
            <th><label for="number">Имя держателя</label>
                <input id="fi" class="fi" placeholder="IVAN IVANOV" type="text" required>
            </th>
            <th><label for="number">CVV/CVC</label>
                <input id="cvv" class="cvv" placeholder="CVV/CVC" type="number" pattern="[0-9]{3}" required>
            </th>
        </tr>
    </table>
    <br><b></b></br>
    <input type="flight_id" hidden class="flight_id" value = "${flight.id}" name = "flight_id">
    <div align="center">
        <input type="submit" class="pay" value="Оплатить">
    </div>
</div>

<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg " height="0.5" width="100%">
</p>

<br><b></b></br>

<p align="right" class="text3">© 2021, ООО «SKY AIRLINES»</p>
</body>