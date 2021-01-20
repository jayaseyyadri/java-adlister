
<%@ taglib prefix="c"
uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: jaya
  Date: 1/20/21
  Time: 10:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<html>
<head>
    <title><%= "Welcome"%></title>
</head>
<body>

<%@include file="partials/navbar.jsp"%>

<h1>Hello there,</h1>

<form action="/login.jsp" method="post">
<h3>Please enter your credentials </h3>

    <input type="text" name="username" id="username">
    <input type="password" name="password" id="password" >

    <button type="submit">Submit</button>


    </form>
<%--check if its a post request  pageContext is an Implicit object and request is a method--%>
<c:if test="${pageContext.request.method.equals('post')}">
    <c:if test="${param.username.equals(\"admin\") && param.password.equals(\"password\")}">
        <% response.sendRedirect("/profile.jsp"); %>
    </c:if>
</c:if>



<%@include file="partials/footer.jsp"%>
</body>
</html>

<%--action is where the information is submitted--%>



