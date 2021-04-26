<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!Doctype>
<html>

<body>
<h2>All Employees</h2><br>
<table>
    <tr>
        <th>№ код</th>
        <th>Код инцидента</th>
        <th>Статус</th>
        <th>Приоритет</th>
        <th>Группа ТП3</th>
        <th>Ответственный ТП3</th>
        <th>Время Назначен""</th>
        <th>Время В работе""</th>
        <th>Время В работе""</th>
        <th>Предельный срок исполнения</th>
        <th>Просрочено</th>
        <th>Код завершения</th>
    </tr>
    <c:forEach var="emp" items="${allEmps}">

        <tr>
            <td>${emp.id}</td>
            <td>${emp.id_incident}</td>
            <td>${emp.status}</td>
            <td>${emp.priority}</td>
            <td>${emp.groupTP3}</td>
            <td>${emp.responsibleTP3}</td>
            <td>${emp.timeAppointment}</td>
            <td>${emp.timeWork}</td>
            <td>${emp.timeDone}</td>
            <td>${emp.deadline}</td>
            <td>${emp.overdue}</td>
            <td>${emp.codeCompletion}</td>
        </tr>
    </c:forEach>
</table>
<br> <input type="button" value="ParserOnClick"
            onclick="window.location.href = 'addEmployee'"/>
</body>
</html>