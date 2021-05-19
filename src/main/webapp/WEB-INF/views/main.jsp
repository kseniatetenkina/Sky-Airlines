<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 17.04.2021
  Time: 18:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/main_style.css">
</head>

<body>

<form class="navigation">
    <div class="raz">
        <a class="title">SKY AIRLINES</a>
        <div><a class="submit2" href="/view_tickets">Посмотреть билеты</a></div>
        <a class="c1" href="/logout">ВЫЙТИ</a>
    </div>
</form>
<br></br>
<h2 align="center" class="text">Поиск билетов</h2>


<form action="/flights" , method="post" , modelAttribute="flight"/>
<div align="center">
    <div class="form">
        <input class="departure_city" placeholder="Откуда" type="text" name="departure_city">
        <input class="arrival_city" placeholder="Куда" type="text" name="arrival_city">
        <input class ="departure_date" placeholder="Туда" type = "date" name="departure_date">
    </div>
    <p></p>
    <div>
        <input class="submit" type="submit" name="search" value="НАЙТИ БИЛЕТЫ">
    </div>
</div>
<br></br>
<p>
    <img src="https://wallbox.ru/resize/1152x864/wallpapers/main/201309/samolet-ayeroport-aviaciya-eda76aa.jpg"
         height="400" width="580" alt="самолет1">
    <img src="https://pravdaurfo.ru/sites/default/files/088.jpg" height="400" width="580" alt="самолет2">
</p>

<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg " height="0.5" width="100%">
</p>


<br></br>
<p align="right" class="text3">2021, ООО «SKY AIRLINES»</p>
</body>