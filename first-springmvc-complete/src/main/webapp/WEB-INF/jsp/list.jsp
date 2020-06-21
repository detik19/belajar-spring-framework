<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Employee</title>
</head>
<body>
	<h1>Employee</h1>
	<c:forEach var="employee" items="${employeeList}">
		<li>
			<c:out value="${employee.name}"></c:out>
		</li>
	</c:forEach>
</body>
</html>
