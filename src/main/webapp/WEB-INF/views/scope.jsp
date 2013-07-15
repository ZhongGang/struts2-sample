<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-7-15
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Scope</title>
</head>
<body>
<h1>${applicationScope.name}</h1>

<h1>${sessionScope.name}</h1>

<h1>${requestScope.name}</h1>
</body>
</html>