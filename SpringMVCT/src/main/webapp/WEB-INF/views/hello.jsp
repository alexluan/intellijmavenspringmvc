<%--
  Created by IntelliJ IDEA.
  User: luanalex
  Date: 2018/8/22
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Helloworld</title>
</head>
<body>
如果禁用 EL 表达式，这这个 方法失效
${msg}<br>
${requestScope.msg}<br>
如果禁用EL 表达式，这个方法也不会失效
<%=request.getAttribute("msg")%>
    <br>
    我的第一个 mvc 应用
<br>
Spring MVC 非线程安全
</body>
</html>
