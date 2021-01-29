<%--
  Created by IntelliJ IDEA.
  User: jaya
  Date: 1/28/21
  Time: 1:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create an Account</title>
</head>
<body>
<form method = "POST" action="/register">



    <label for="userName"> Username <input type="text" name="userName" id ="userName"></label>
    <label for="email"> Email address <input type="email" name="email" id ="email"></label>
    <label for="password"> Password <input type="password" name="Password" id ="password"></label>

    <button type="submit">Submit</button>

</form>
</body>
</html>
