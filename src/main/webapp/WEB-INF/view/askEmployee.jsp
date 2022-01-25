<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Ask Employee</title>
</head>
<body>
<h2>Employee, Please, enter your details</h2>
<br>
<br>
<form:form action="showDetails" modelAttribute="employee">
    Name<form:input path="name"/>
    <form:errors path="name"/>
    <br><br

> Surname<form:input path="surname"/>
    <br><br

> Salary<form:input path="salary"/>
    <br><br>

    Department <form:select path="department">
    <form:option value="IT" label="IT"/>
    <form:option value="HR" label="HR"/>
    <form:option value="Sales" label="Saless"/>
</form:select>
    <br><br>

    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br><br>

    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languageList}"/>
    <%--    EN<form:checkbox path="languages" value="English"/>
        DE<form:checkbox path="languages" value="Deutch"/>
        FR<form:checkbox path="languages" value="French"/>--%>
    <br><br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br><br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br><br>
    <input type="submit" value="OK">
</form:form>
</body>
</html>
