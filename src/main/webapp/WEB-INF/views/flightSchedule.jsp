<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 22.04.2021
  Time: 0:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/style4.css" >
</head>

<body>

<form class = "navigation">
    <div class = "raz">
        <a class = "title">SKY AIRLINES</a>
        <a class="c" href="#">ИНФОРМАЦИЯ</a>
        <a class="c" href="#">КУПИТЬ БИЛЕТ</a>
        <a class="c" href="авторизация.html">ВХОД/РЕГИСТРАЦИЯ</a>
        <a class="c1" href="#">ВЫЙТИ</a>
    </div>
    <br><b></b></br>
    <h1 align = "center" class = "title">Выбор рейса</h1>
</form>
<br><b></b></br>
<table>
    <tr>
        <td>
            password
        </td>
        <td>
            ${Пассажир.password}
        </td>
    </tr>
    <tr>
        <td>
            email
        </td>
        <td>
            ${Пассажир.email}
        </td>
    </tr>
</table>



<form class="schedule">
    <table align="left">
        <tr>
            <th><h2>Город вылета</h2></th>
            <th><h2>Город прилета</h2></th>
            <th><h2>Номер рейса</h2></th>
            <th><h2>Время вылета</h2></th>
            <th><h2>Время прилета</h2></th>
        </tr>
    </table>
    <br><b></b></br>

    <table align="center" class="block">
        <c:if test="${not empty flights}">
            <c:forEach items="${flights}" var="flight">
                <table align="center" class="block">
                <tr>
                    <th><h3>${flight.departureCity}</h3></th>
                    <th><h3>${flight.arrivalCity}</h3></th>
                    <th><h3>${flight.flightNumber}</h3></th>
                    <th><h3>${flight.departureAirport}</h3></th>
                    <th><h3>${flight.departureDate}</h3></th>
                    <th><a class="submit" href="покупка.html">Выбрать рейс</a></th>
                </tr>
                </table>
            </c:forEach>
        </c:if>
    </table>
<%--    <table align="center" class="block">--%>
<%--        <tr >--%>
<%--            <th><h3>Санкт-Петербург (LED)</h3></th>--%>
<%--            <th><h3>Москва (VKO)</h3></th>--%>
<%--            <th><h3>SU 6035</h3></th>--%>
<%--            <th><h3>12:55</h3></th>--%>
<%--            <th><h3>14:25</h3></th>--%>
<%--            <th><a class ="submit" href="покупка.html">Выбрать рейс</a></th>--%>
<%--        </tr>--%>
<%--    </table>--%>
<%--    <table align="left" class="block">--%>
<%--        <tr class="schedule1">--%>
<%--            <th><h3>Санкт-Петербург (LED)</h3></th>--%>
<%--            <th><h3>Москва (VKO)</h3></th>--%>
<%--            <th><h3>SU 6023</h3></th>--%>
<%--            <th><h3>14:00</h3></th>--%>
<%--            <th><h3>15:30</h3></th>--%>
<%--            <th><a class ="submit" href="покупка.html">Выбрать рейс</a></th>--%>
<%--        </tr></table>--%>
<%--    <table align="left" class="block">--%>
<%--        <tr class="schedule1">--%>
<%--            <th><h3>Санкт-Петербург (LED)</h3></th>--%>
<%--            <th><h3>Москва (SVO)</h3></th>--%>
<%--            <th><h3>SU 6037</h3></th>--%>
<%--            <th><h3>17:45</h3></th>--%>
<%--            <th><h3>19:15</h3></th>--%>
<%--            <th><a class ="submit" href="покупка.html">Выбрать рейс</a></th>--%>
<%--        </tr></table>--%>
<%--    <table align="left" class="block">--%>
<%--        <tr class="schedule1">--%>
<%--            <th><h3>Санкт-Петербург (LED)</h3></th>--%>
<%--            <th><h3>Москва (DME)</h3></th>--%>
<%--            <th><h3>SU 6023</h3></th>--%>
<%--            <th><h3>20:10</h3></th>--%>
<%--            <th><h3>21:40</h3></th>--%>
<%--            <th><a class ="submit" href="покупка.html">Выбрать рейс</a></th>--%>
<%--        </tr></table>--%>
<%--    <table align="left" class="block">--%>
<%--        <tr class="schedule1">--%>
<%--            <th><h3>Санкт-Петербург (LED)</h3></th>--%>
<%--            <th><h3>Москва (SVO)</h3></th>--%>
<%--            <th><h3>SU 6035</h3></th>--%>
<%--            <th><h3>21:50</h3></th>--%>
<%--            <th><h3>23:20</h3></th>--%>
<%--            <th><a class ="submit" href="покупка.html">Выбрать рейс</a></th>--%>
<%--        </tr></table>--%>
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