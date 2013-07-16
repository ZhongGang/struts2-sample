<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-7-15
  Time: 下午11:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>The shop of form</title>
    <script type="text/javascript" src="/static/bootstrap/js/bootstrap.js"></script>
</head>
<body>
<form action="persist.action" method="post">
    <table>
        <tr>
            <td>名字：</td>
            <td>
                <input type="text" name="shop.name"/>
            </td>
        </tr>
        <tr>
            <td>描述：</td>
            <td>
                <textarea name="shop.description"></textarea>
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="保存"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>