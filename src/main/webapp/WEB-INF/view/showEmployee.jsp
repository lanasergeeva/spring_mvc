<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Employee</title>
</head>
<body>
<h2>Info</h2>
<br>
<br>
Your name : ${employee.name}
<br>
<br>
Your surname : ${employee.surname}
<br>
<br>
Salary : ${employee.salary}
<br>
<br>
Department : ${employee.department}
<br>
<br>
You car is : ${employee.carBrand}
<br>
<br>
Language
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

Phone number is: ${employee.phoneNumber}
<br>
<br>
Email is: ${employee.email}
</body>
</html>
