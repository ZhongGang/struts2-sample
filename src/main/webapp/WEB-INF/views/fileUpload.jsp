<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-7-15
  Time: 下午9:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Upload file</title>
</head>
<body>
<h1>
    <s:text name="welcome"/>
</h1>

<h2>
    <s:checkboxlist name="language" list="{'java','c','c#','python','groovy'}" value="{'java','python'}"/>
</h2>

<form method="post" action="avatar!upload.action" enctype="multipart/form-data">
    <input type="file" name="avatar"/><s:fielderror/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>