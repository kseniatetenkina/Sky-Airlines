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
    <!-- <h1 align = "center" class = "title">SKY AIRLINES</h1> -->
    <link rel="stylesheet" href="/resources/css/style3.css">
</head>

<body>

<form class="navigation">
    <div class="raz">
        <a class="title">SKY AIRLINES</a>
        <a class="c1" href="/logout">ВЫЙТИ</a>
    </div>
</form>

<h2 align="center" class="text">Поиск билетов</h2>


<form action="/flights" , method="post" , modelAttribute="flight"/>
<form align="center">
    <div class="form">
        <input class="departure_city" placeholder="Откуда" type="text" name="departure_city">
        <input class="arrival_city" placeholder="Куда" type="text" name="arrival_city">
        <input class ="departure_date" placeholder="Туда" type = "date" name="departure_date">
        <input class="submit" type="submit" name="search" value="ПОИСК">
    </div>
</form>

<p>
    <img src="https://wallbox.ru/resize/1152x864/wallpapers/main/201309/samolet-ayeroport-aviaciya-eda76aa.jpg"
         height="400" width="590" alt="самолет1">
    <img src="https://pravdaurfo.ru/sites/default/files/088.jpg" height="400" width="590" alt="самолет2">
</p>

<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg " height="0.5" width="100%">
</p>

<h3 class="text2">Подпишитесь на рассылку, чтобы не пропустить новую информацию о полетах и скидках</h3>
<form>
    <input class="email" placeholder="Введите Ваш email" type="email" name="email">
    <input class="submit" type="submit" name="search" value="Подписаться">
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
<br></br>
<p align="right" class="text3">:copyright: 2021, ООО «SKY AIRLINES»</p>
</body>