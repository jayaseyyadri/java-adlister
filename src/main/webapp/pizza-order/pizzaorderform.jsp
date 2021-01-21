<%--
  Created by IntelliJ IDEA.
  User: jaya
  Date: 1/21/21
  Time: 2:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/pizza-order" method="post">

        <label>Crust
            <select name="crust">
                <option value="Stuffed"></option>
                <option value="Pan"></option>
                <option value="Handmade"></option>

            </select>
        </label>
<br>
        <label>Sauce
            <select name="sauce" >
                <option value="Marinara"></option>
                <option value="Alfredo"></option>
                <option value="BBQ"></option>

            </select>
        </label>
<br>
        <label>Size
            <select name="size">
                    <option value="Personal"></option>
                    <option value="Medium"></option>
                    <option value="Large"></option>

            </select>
        </label>
<br>
        <label for="chicken"> Chicken<input type="checkbox" name="toppings" id="chicken" value="chicken"></label>
        <label for="pineapple">Pineapple<input type="checkbox" name="toppings" id="pineapple" value="pineapple"></label>
        <label for="cheese">Cheese<input type="checkbox" name="toppings" id="cheese" value="cheese"></label>

        <label> Enter delivery address<input type="text" name="address" id="address"></label>

        <button type="submit">Submit</button>
    </form>
</body>
</html>
