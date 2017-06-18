
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Submitted Student Information</h2>
<table>
    <tr>
        <td>username</td>
        <td>${userEntity.getUsername()}</td>
    </tr>
    <tr>
        <td>password</td>
        <td>${userEntity.getPassword()}</td>
    </tr>

    <tr>
        <td>email</td>
        <td>${userEntity.getEmail()}</td>
    </tr>

</table>
</body>
</html>
