<%--
  Created by IntelliJ IDEA.
  User: jaya
  Date: 1/21/21
  Time: 11:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello ,</title>
</head>
<body>
    <form  action="/viewcolor" method="post">
        <label for="colorName" >Pick a color</label>
        <input type="text" name="colorName" id="colorName">

        <button type="submit">Submit</button>
    </form>
</body>
</html>
