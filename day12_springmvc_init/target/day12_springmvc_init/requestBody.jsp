<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/11/23
  Time: 21:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>RequestBody</title>
</head>
<body>
<h3>请求体测试</h3>

<form action="anno/testRequestBody" method="post">
    姓名: <input type="text" name="name"> <br>
    年龄: <input type="text" name="age"><br>
    <input type="submit" value="提交信息">
</form>
<a href="anno/testSessionAttributes">设置</a>
<a href="anno/getSessionAttributes">获取</a>
<a href="anno/deleteSessionAttributes">删除</a>


</body>
</html>
