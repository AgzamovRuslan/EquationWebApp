<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>MyFirstServlet</title>
    </head>
    <body>
        <h1>Решатель квадратных уравнений</h1> <!-- Форма, содержащая в себе кнопку и техтовое поле. По нажатию на кнопку отправит POST запрос на сервлет-->
        <form action="servlet" method="POST">
            <div>
                <p>Введите коэффициенты уравнения:</p>
                <input type="text" name="A" value="" placeholder="A"> * x<sup>2</sup> +
                <input type="text" name="B" value="" placeholder="B"> * x +
                <input type="text" name="C" value="" placeholder="C"> = 0
            </div>
            <input type="submit" value="Найти решение" />
        </form>
    </body>
</html>