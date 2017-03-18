<%--
  Created by IntelliJ IDEA.
  User: розалия
  Date: 18.03.2017
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:set var="index" value="0"/>
    <c:forEach var="product" items="${products}">
        <p>Номер:<c:out value="${index+1}"/></p>
        <c:set var="index" value="${index+1}"/>
        <p>Price:${product.getPrice()}</p>
        <br>
        <p>Color:${product.getColor()}</p>
        <br>
        <p><a href="/product_detail/?price=${product.getPrice()}&color=${product.getColor()}&description=${product.getDescription()}">Подробно..</a></p>
        <br>
    </c:forEach>
</body>
</html>
