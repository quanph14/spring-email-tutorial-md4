<%--
  Created by IntelliJ IDEA.
  User: User
  Date: 10/19/2022
  Time: 8:19 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create a new email</title>
</head>
<body>
<h3>Welcome, Enter The Email Details</h3>
<form:form method="POST" action="addEmail" modelAttribute="email">
    <table>

        <tr>
            <th>Language:</th>
            <td><form:select  path="language">
                <form:option value="English"> English</form:option>
                <form:option value="Vietnamese"> Vietnamese </form:option>
                <form:option value="Japanese"> Vietnamese </form:option>
                <form:option value="Chinese"> Vietnamese </form:option>
            </form:select>
            </td>
        </tr>
        <tr>
            <th>Page Size:</th>
            <td><form:select  path="paperSize">
                <form:option value="5"> 5</form:option>
                <form:option value="15"> 15 </form:option>
                <form:option value="25"> 25 </form:option>
                <form:option value="100"> 100 </form:option>
                </form:select>
        </tr>
        <tr>
            Enable Spam Filler<form:checkbox path="spamsFillter" value="Enable Spam Filler"/>
        </tr>
        <tr>
            <td><form:label path="signature"> Signature: </form:label></td>
            <td><form:input path="signature" cssStyle="padding: 20px"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
