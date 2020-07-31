<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
	<head>
		<title>Todos for ${name}</title>
	</head>
	<body>
		<h1>Your Todos</h1>
		<table>
		<caption>Your todos are </caption>
		<thead>
			<tr>
				<th>Description</th>
				<th>Date</th>
				<th>Progress</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items = "${todos}" var = "todo">
			<tr>
				<td>${todo.desc}</td>
				<td>${todo.targetDate}</td>
				<td>${todo.done}</td>
			</tr>
		</c:forEach>	
		</tbody>
		</table>
		<a href = "/add-todos">Add a todo</a>
	</body>
</html> 