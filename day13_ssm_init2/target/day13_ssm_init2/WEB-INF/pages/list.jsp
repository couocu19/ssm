<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/11/26
  Time: 22:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h3>这里是list</h3>
<c:forEach items="${list}" var="a">
    ${a.money}<br>


</c:forEach>


</body>
</html>
