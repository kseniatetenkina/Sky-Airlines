<%--
  Created by IntelliJ IDEA.
  User: Ксения
  Date: 30.04.2021
  Time: 21:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Сайт авиакомпании</title>
    <link rel="stylesheet" href="/resources/css/style5.css" >
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
    <h1 align = "center" class = "title">Профиль</h1>
</form>
<br><b></b></br>
<form>

    <h2 align = "left">Персональные данные</h2>
    <label>Фамилия</label>
    <input id = "from" class ="from" placeholder="Фамилия" type="text" name="from" value="Иванов" required>
    <label>Имя</label>
    <input id = "to" class ="to" placeholder="Имя" type="text" name="to" value="Иван" required="required">
    <label>Отчество</label>
    <input id = "to" class ="to" placeholder="Отчество" type="text" name="to" value="Иванович" required="required">
    <br><b></b></br>
    <label>Дата рождения</label>
    <input class ="date1" placeholder="Дата рождения" type = "date" name="first date" value="05/05/1999" required="required">
    <input id="round" type="radio" name="radio" value="1" checked>
    <label for="round">Мужчина</label>
    <input id="thereto" type="radio" name="radio" value="2">
    <label for="thereto">Женщина</label>
    <br><b></b></br>
    <label for="list">Гражданство</label>
    <select id="list" class="from" name="user_profile_color_1">
        <option value="1">РФ</option>
        <option value="2">Украина</option>
        <option value="3">Беларусь</option>
        <option value="4">Армения</option>
        <option value="5">Грузия</option>
        <option value="6">Азербайджан</option>
    </select>
    <label>Тип документа</label>
    <input id = "to" class ="to" placeholder="Тип документа" type="text" name="to" value="Паспорт РФ" required="required">
    <label>№ документа</label>
    <input id = "to" class ="to" placeholder="Серия и номер" type="text" name="to"  required="required">
    <br><b></b></br>
    <h2 align = "left">Контактная информация</h2>
    <input class ="email" placeholder="Электронная почта" type="email" value="i.ivanov@mail.ru" name="email">
    <input class ="email" placeholder="Телефон" type="tel" value="+79184730395" name="number">
    <br><b></b></br>

    <div align = "center">
        <input type="submit" class ="save" value="Сохранить изменения">
    </div>
</form>
<p><img src="https://lime-stone.ru/image/cache/data/gallery/granit/gabbrodiabaz-920x690.jpg "height="0.5" width="100%"></p>

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
<p align = "right" class = "text3">© 2021, ООО «SKY AIRLINES»</p>
</body>