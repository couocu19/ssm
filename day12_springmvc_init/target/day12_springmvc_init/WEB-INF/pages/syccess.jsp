<%--
  Created by IntelliJ IDEA.
  User: 11310
  Date: 2019/11/20
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
</head>
<body>
   <h3>入门成功~</h3>
   <form action="user" method="post">
       姓名: <input type="text" name="name"> <br>
       密码: <input type="text" name="password"><br>
       金额: <input type="text" name="money"><br>
       用户姓名: <input type="text" name="user.userName"><br>
       用户年龄: <input type="text" name="user.age"><br>
       <input type="submit" value="提交信息">
   </form>

</body>
</html>
