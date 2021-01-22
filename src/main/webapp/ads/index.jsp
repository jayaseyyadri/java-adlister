<%--
  Created by IntelliJ IDEA.
  User: jaya
  Date: 1/22/21
  Time: 3:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Advertisements:</title>
</head>
<body>

<c:forEach var="ad" items="${Listads}">
<div  class ="ad">

    <h2>${ad.title}</h2>
    <h4>${ad.description}</h4>
</div>
</c:forEach>

</body>
</html>
