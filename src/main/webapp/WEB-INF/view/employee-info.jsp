<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!Doctype>
<html>

<body>
<h2>Employee Info</h2><br>

<form:form action="saveEmployee" modelAttribute="employee" method="post">

    <form:hidden path="id"/>
    Name <form:input path="name"/><br>
    Surname <form:input path="surname"/><br>
    Department <form:input path="department"/><br>
    Salary <form:input path="salary"/><br><br>
    <input type = "submit" value="OK">
</form:form>
</body>
</html>